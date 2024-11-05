package com.atmmonitor.service;

import java.util.List;

import com.atmmonitor.entity.ATMStatus;

public interface ErrorService {
    List<ATMStatus> getRecentErrors();
}
