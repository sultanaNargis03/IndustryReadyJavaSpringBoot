package com.telusko.service;

import java.util.Optional;

import com.telusko.bo.JobSeeker;

public interface IJobSeekerService 
{
	public String registerJobSeeker(JobSeeker seeker);
	public Optional<JobSeeker> getDetailsById(Integer id);
}
