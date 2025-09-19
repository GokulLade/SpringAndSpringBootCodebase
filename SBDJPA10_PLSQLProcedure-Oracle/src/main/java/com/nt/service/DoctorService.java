package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/* 
  
CREATE PROCEDURE `GET_DOCTORS_BY_INCOME_RANGE` (in start float, in end float)
BEGIN
	Select * from doctor_info where income>=start and income<=end;
END
  
*/

@Service
public class DoctorService implements IDoctorService {

	@Autowired
	EntityManager manager;
	
	@Override
	public List<Doctor> getAllDoctorByIncome(Double startIncome,Double endIncome) throws Exception {
		//Creating object for StoreprocedureQuery
		StoredProcedureQuery query= manager.createStoredProcedureQuery("GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
		
		//Reg both IN-OUT parameter
		query.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		
		//Setting value to IN parameter
		query.setParameter(1, startIncome);
		query.setParameter(2, endIncome);
		
		//Calling PL/SQL procedure
		return query.getResultList();
	}

}
