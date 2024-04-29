package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.model.Student;

public interface IStudentRepo extends JpaRepository<Student,Integer>{

}
