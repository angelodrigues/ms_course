package com.angelo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
}
