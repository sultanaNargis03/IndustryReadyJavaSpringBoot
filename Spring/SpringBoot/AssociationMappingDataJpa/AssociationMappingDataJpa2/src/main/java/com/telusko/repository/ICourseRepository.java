package com.telusko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

}
