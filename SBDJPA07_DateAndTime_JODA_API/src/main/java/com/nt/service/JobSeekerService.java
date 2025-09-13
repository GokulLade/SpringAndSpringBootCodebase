package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.JobSeekerRepo;

@Service
public class JobSeekerService implements IJobSeekerService {

	@Autowired
	private JobSeekerRepo jsRepo;

	@Override
	public String regJobSeeker(JobSeeker js) throws Exception {
		int jsId = jsRepo.save(js).getJsId();

		return "JobSeeker is Saved with id: " + jsId;
	}
	
	@Override
	public List<JobSeeker> getAllJobSeeker() throws Exception {
		return jsRepo.findAll();
	}
	
	@Override
	public Float getJsAge(Integer id) throws Exception {
		return jsRepo.calculateAgeByJsId(id);
	}

}
