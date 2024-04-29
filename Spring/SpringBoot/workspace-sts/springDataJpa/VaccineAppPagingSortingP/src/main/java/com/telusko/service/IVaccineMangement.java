package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	Iterable<VaccineDetails> findAll();
}
