package com.atmmonitor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atmmonitor.entity.MediaFile;

@RestController
@RequestMapping("/media")
public class MediaController {
	@GetMapping("/download")
	public ResponseEntity<List<MediaFile>> getMedia(@RequestParam("startTime") String start,
			@RequestParam("endTime") String end) {
		// Logic to retrieve media files based on timestamps
		return ResponseEntity.ok(new ArrayList<>());
	}
}
