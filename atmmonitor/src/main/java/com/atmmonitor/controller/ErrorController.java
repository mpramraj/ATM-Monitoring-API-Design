package com.atmmonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atmmonitor.entity.ATMStatus;
import com.atmmonitor.service.ErrorService;

@RestController
@RequestMapping("/errors")
public class ErrorController {
	@Autowired
	private ErrorService errorService;

	@GetMapping("/log")
	public ResponseEntity<List<ATMStatus>> getErrorLog() {
		return ResponseEntity.ok(errorService.getRecentErrors());
	}
}
