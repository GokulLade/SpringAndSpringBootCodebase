package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorService {

	List<Doctor> getAllDoctorByIncome(Double startIncome,Double endIncome) throws Exception;
}
