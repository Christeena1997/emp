package com.onesoft.emp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.emp.entity.Employe;

public interface EmployeeRepository extends JpaRepository<Employe, Integer> {


}
