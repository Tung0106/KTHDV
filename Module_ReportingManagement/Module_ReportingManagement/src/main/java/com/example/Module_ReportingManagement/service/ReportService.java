package com.example.Module_ReportingManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Module_ReportingManagement.repository.ReportRepository;

@Service
public class ReportService {
	@Autowired
	private ReportRepository repo;
	
}
