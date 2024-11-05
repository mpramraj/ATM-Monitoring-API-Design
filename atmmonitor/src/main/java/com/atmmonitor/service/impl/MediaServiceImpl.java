package com.atmmonitor.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atmmonitor.entity.MediaFile;
import com.atmmonitor.service.MediaService;

@Service
public class MediaServiceImpl implements MediaService {
    @Override
    public List<MediaFile> getMediaFiles(LocalDateTime startTime, LocalDateTime endTime) {
        // Implement logic to fetch media files within the specified time range.
        return new ArrayList<>(); // Placeholder
    }
}