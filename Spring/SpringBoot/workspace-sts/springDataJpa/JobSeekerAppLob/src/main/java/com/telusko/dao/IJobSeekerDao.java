package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.JobSeeker;

public interface IJobSeekerDao extends CrudRepository<JobSeeker, Integer> 
{

}
