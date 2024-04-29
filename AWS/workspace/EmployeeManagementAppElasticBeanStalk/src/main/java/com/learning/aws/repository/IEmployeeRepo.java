package com.learning.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.aws.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
