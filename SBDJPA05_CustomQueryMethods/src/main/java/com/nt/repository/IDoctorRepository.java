package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

	@Query("From Doctor")
	List<Doctor> showAllDoctor() throws Exception; // All Doctors
	
	@Query("From Doctor where qly in(?1,?2)")
	List<Doctor> showDoctorByQly(String qly1, String qly2) throws Exception;
	
	@Query("From Doctor where qly in(:qly1,:qly2)")
	List<Doctor> showDoctorByQlyPara(String qly1, String qly2) throws Exception;
	
	/*
	@Query("From Doctor where qly in(?1,:qly2)") //Valid
	List<Doctor> showDoctorByQlyPara(String qly1, String qly2) throws Exception;
	
	@Query("From Doctor where qly in(:qly1,?2)") //InvalidValid
	List<Doctor> showDoctorByQlyPara(String qly1, String qly2) throws Exception;
	
	
	*/
}
