package com.mock.summary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.summary.model.Summary;

public interface SummaryRepository extends JpaRepository<Summary, Long>{
    
}
