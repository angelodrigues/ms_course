package com.hrworker.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrworker.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long>{
}