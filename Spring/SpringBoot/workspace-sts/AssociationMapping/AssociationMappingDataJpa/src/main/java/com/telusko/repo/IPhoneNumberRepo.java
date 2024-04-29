package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
