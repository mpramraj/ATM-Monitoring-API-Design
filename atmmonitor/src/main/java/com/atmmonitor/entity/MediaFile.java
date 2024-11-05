package com.atmmonitor.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-arguments constructor
public class MediaFile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Unique identifier for the media file
	private String filePath; // Path or URL to access the media file
	private String fileType; // Type of the file (e.g., "image", "video")
	private LocalDateTime timestamp; // Timestamp when the media was recorded or retrieved
}