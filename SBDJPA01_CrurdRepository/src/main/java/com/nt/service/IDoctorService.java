package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {

	public String registerDoctor(Doctor doctor);
	public Long showDoctorCount();
	public String registerDoctorsAsroup(Iterable<Doctor> list);
	public String checkDoctorAvailabilityById(int id);
	public Iterable<Doctor> findAllDoctors();
	public Iterable<Doctor> findAllDoctorsByIds(Iterable<Integer> ids);

}
