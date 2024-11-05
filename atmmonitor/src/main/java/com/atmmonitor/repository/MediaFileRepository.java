package com.atmmonitor.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atmmonitor.entity.MediaFile;

public interface MediaFileRepository extends JpaRepository<MediaFile, Long> {
	List<MediaFile> findMediaFilesByTimestampBetween(LocalDateTime start, LocalDateTime end);
}
