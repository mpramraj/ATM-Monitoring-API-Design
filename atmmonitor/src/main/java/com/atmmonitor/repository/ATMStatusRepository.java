package com.atmmonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atmmonitor.entity.ATMStatus;

@Repository
public interface ATMStatusRepository extends JpaRepository<ATMStatus, Long> {
}
