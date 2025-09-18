package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/* 
  
CREATE OR REPLACE PROCEDURE P_GET_DOCTERBYINCOME 
(
  STARTINCOME IN NUMBER 
, ENDINCOME IN NUMBER 
, DOCTERINFO OUT SYS_REFCURSOR 
) AS 
BEGIN
Open docterinfo for
  select * from Doctor_Info where income>=STARTINCOME and income<=ENDINCOME;
END P_GET_DOCTERBYINCOME
  
*/

@Service
public class DoctorService implements IDoctorService {

	@Autowired
	EntityManager manager;
	
	@Override
	public List<Doctor> getAllDoctorByIncome(Double startIncome,Double endIncome) throws Exception {
		//Creating object for StoreprocedureQuery
		StoredProcedureQuery query= manager.createStoredProcedureQuery("P_GET_DOCTERBYINCOME ",Doctor.class);
		
		//Reg both IN-OUT parameter
		query.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class,ParameterMode.REF_CURSOR);
		
		//Setting value to IN parameter
		query.setParameter(1, startIncome);
		query.setParameter(2, endIncome);
		
		//Calling PL/SQL procedure
		return query.getResultList();
	}

}
