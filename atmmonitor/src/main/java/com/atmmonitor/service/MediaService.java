package com.atmmonitor.service;

import java.time.LocalDateTime;
import java.util.List;

import com.atmmonitor.entity.MediaFile;



public interface MediaService {
    List<MediaFile> getMediaFiles(LocalDateTime startTime, LocalDateTime endTime);
}
