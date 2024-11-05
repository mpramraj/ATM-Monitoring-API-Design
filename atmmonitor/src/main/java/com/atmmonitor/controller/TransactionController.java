package com.atmmonitor.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atmmonitor.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/customerCount")
    public ResponseEntity<Long> getCustomerCount() {
        return ResponseEntity.ok(transactionService.getCustomerCountInLast24Hours());
    }

    @GetMapping("/breakdown")
    public ResponseEntity<Map<String, Long>> getTransactionBreakdown() {
        return ResponseEntity.ok(transactionService.getTransactionBreakdown());
    }
}