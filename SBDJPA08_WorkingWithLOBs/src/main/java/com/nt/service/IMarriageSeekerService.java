package com.nt.service;

import com.nt.entity.MarriageSeeker;

public interface IMarriageSeekerService {

	String regMarriageSeeker(MarriageSeeker ms) throws Exception;
	MarriageSeeker getMarriageSeeker(Integer id) throws Exception;

}
