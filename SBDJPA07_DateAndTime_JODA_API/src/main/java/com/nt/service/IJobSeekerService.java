package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeeker;

public interface IJobSeekerService {

	String regJobSeeker(JobSeeker js) throws Exception;
	List<JobSeeker> getAllJobSeeker() throws Exception;
	Float getJsAge(Integer id) throws Exception;
}
