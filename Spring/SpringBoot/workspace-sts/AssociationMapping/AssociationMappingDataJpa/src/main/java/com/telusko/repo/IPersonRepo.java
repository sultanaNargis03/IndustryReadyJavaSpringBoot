package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Person;


public interface IPersonRepo extends JpaRepository<Person, Integer> {

	

}
