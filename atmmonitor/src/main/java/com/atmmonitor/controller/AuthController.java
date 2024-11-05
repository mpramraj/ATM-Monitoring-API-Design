package com.atmmonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmmonitor.requestDto.AuthRequest;
import com.atmmonitor.utils.JwtUtils;

@RestController
public class AuthController {

	private final AuthenticationManager authenticationManager;
	private final JwtUtils jwtUtils;

	@Autowired
	public AuthController(AuthenticationManager authenticationManager, JwtUtils jwtUtils,
			UserDetailsService userDetailsService) {
		this.authenticationManager = authenticationManager;
		this.jwtUtils = jwtUtils;
	}

	@PostMapping("/api/auth/login")
	public ResponseEntity<String> login(@RequestBody AuthRequest authRequest) {
		try {
		    // Authenticate the user
		    authenticationManager.authenticate(
		        new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

		    // Generate JWT token
		    String token = jwtUtils.generateToken(authRequest.getUsername());
		    System.out.println("token=" + token); // Print the token
		    return ResponseEntity.ok(token); // Return the token
		} catch (Exception e) {
		    e.printStackTrace(); // Print stack trace for debugging
		    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
	}
}
