package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {

	//Insert Operation
	public String registerDoctor(Doctor doctor);
	public String registerDoctorsAsroup(Iterable<Doctor> list);
	
	//Select Operation
	public Long showDoctorCount();
	public String checkDoctorAvailabilityById(int id);
	public Iterable<Doctor> findAllDoctors();
	public Iterable<Doctor> findAllDoctorsByIds(Iterable<Integer> ids);
	public Doctor showDoctorById(Integer id);
	
	//Update Operation
	public String registerOrUpdateDoctor(Doctor doctor); //Full Object Modification
	public String updateDoctorDetails(Integer id,Double newIncome,String newQly); //Partial Object Modification
	
	//Delete Operation
	public String deleteAllDoctor();
	public String deleteDoctorByIds(Iterable<Integer> ids);
	public String deleteDoctorbyId(Integer id);
}
