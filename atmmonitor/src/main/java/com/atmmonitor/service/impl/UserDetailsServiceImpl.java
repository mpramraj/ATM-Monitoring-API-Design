package com.atmmonitor.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    System.out.println("Trying to load user: " + username);
	    if ("testuser".equals(username)) {
	        return User.withUsername("testuser").password("{noop}password123") // No password encoder for plain text
	                .authorities("USER") // Assign roles/authorities
	                .build();
	    }
	    throw new UsernameNotFoundException("User not found: " + username);
	}
}
