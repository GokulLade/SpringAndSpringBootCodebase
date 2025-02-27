package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service("doc-service")
public class DoctorServiceImp implements IDoctorService {

	@Autowired
	private IDoctorRepo docRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) 
	{
		Doctor doc=docRepo.save(doctor);
		return "Doctor object is saved with id value: "+doc.getDocid();
	}

}
