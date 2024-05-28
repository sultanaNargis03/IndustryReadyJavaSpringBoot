package com.telusko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
