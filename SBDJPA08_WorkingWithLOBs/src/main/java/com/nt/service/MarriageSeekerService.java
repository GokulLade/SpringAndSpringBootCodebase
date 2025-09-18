package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.IMarriageSeekerRepo;

@Service
public class MarriageSeekerService implements IMarriageSeekerService {

	@Autowired
	IMarriageSeekerRepo msRepo;

	@Override
	public String regMarriageSeeker(MarriageSeeker ms) throws Exception {

		Integer msid = msRepo.save(ms).getMsId();

		return "Marriage Seeker is Saved with id: " + msid;
	}
	
	@Override
	public MarriageSeeker getMarriageSeeker(Integer id) throws Exception {
		return msRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}

}
