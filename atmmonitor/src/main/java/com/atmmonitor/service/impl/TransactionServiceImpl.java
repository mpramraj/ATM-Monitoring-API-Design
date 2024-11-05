package com.atmmonitor.service.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmmonitor.repository.TransactionLogRepository;
import com.atmmonitor.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionLogRepository transactionLogRepository;

	@Override
	public Long getCustomerCountInLast24Hours() {
		return transactionLogRepository.countDistinctCustomerByTimestampAfter(LocalDateTime.now().minusHours(24));
	}

	@Override
	public Map<String, Long> getTransactionBreakdown() {
		Map<String, Long> breakdown = new HashMap<>();
		transactionLogRepository.findAll()
				.forEach(transaction -> breakdown.merge(transaction.getTransactionType(), 1L, Long::sum));
		return breakdown;
	}
}