package com.atmmonitor.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmmonitor.entity.ATMStatus;
import com.atmmonitor.repository.ATMStatusRepository;
import com.atmmonitor.service.ErrorService;

@Service
public class ErrorServiceImpl implements ErrorService {
	@Autowired
	private ATMStatusRepository atmStatusRepository;

	@Override
	public List<ATMStatus> getRecentErrors() {
		return atmStatusRepository.findAll().stream().filter(status -> "ERROR".equals(status.getStatus()))
				.collect(Collectors.toList());
	}
}