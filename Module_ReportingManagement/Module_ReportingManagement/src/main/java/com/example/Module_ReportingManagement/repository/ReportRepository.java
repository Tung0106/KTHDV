package com.example.Module_ReportingManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Module_ReportingManagement.entities.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{

}
