package com.atmmonitor.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.atmmonitor.entity.TransactionLog;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, Long> {
	@Query("SELECT COUNT(DISTINCT customerId) FROM TransactionLog WHERE timestamp >= :yesterday")
	Long countDistinctCustomerByTimestampAfter(@Param("yesterday") LocalDateTime yesterday);
}