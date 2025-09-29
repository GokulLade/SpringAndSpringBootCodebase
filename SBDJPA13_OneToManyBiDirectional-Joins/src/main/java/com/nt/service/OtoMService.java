package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service
public class OtoMService implements IOtoMService {

	@Autowired
	private IPersonRepo perRepo;
	@Autowired
	private IPhoneNumberRepo phnorepo;

	@Override
	public List<Object[]> showPersonAndHisPhoneNumber() {
		return perRepo.showPersonAndPhoneNumberUsingJoins();
	}
	
	@Override
	public List<Object[]> showPhoneNumberAndPerson() {
		return phnorepo.showPhoneNumberAndPersonUsingJoin();
	}

}
