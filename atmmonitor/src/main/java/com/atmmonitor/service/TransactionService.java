package com.atmmonitor.service;

import java.util.Map;

public interface TransactionService {
    Long getCustomerCountInLast24Hours();
    Map<String, Long> getTransactionBreakdown();
}
