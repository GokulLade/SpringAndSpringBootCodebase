package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorService {
	
	public String removeAllDoctorInBatch(Iterable<Integer> ids);
	public List<Doctor> findDoctorByExampleData(Doctor doctor, boolean ascOrder, String ...props);
	public Doctor showDoctorById(Integer id);
	public Doctor fetchDoctorById(Integer id);
}
