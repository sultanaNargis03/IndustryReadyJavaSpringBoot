package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.JobSeeker;
import com.telusko.dao.IJobSeekerDao;
@Service
public class JobSeekerServiceImpl implements IJobSeekerService 
{
	@Autowired
	IJobSeekerDao repo;

	@Override
	public String registerJobSeeker(JobSeeker seeker) {
	
		Integer id = repo.save(seeker).getId();
		return "Jobseeker details registered with id :"+id;
	}

	@Override
	public Optional<JobSeeker> getDetailsById(Integer id) {
		return repo.findById(id);
	}

	
}
