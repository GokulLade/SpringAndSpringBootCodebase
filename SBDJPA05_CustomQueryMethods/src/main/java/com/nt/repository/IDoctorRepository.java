package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

	/* ----------------------- Getting all Entity Record --------------------------------------*/
	@Query("From Doctor") // All Doctors
	public List<Doctor> showAllDoctor() throws Exception; 
	
	
	/* ----------------------- Use of Different Parameter --------------------------------------*/
	@Query("From Doctor where qly in(?1,?2)") // Ordinary Para
	public List<Doctor> showDoctorByQly(String qly1, String qly2) throws Exception;
	
	@Query("From Doctor where qly in(:qly1,:qly2)") // Named Para
	public List<Doctor> showDoctorByQlyPara(String qly1, String qly2) throws Exception;
	 
	@Query("From Doctor where qly in(?1,:qly2)") //Valid
	public List<Doctor> showDoctorByQlyPara1(String qly1, String qly2) throws Exception;
	
//	@Query("From Doctor where qly in(:qly1,?2)") //InvalidValid
//	public List<Doctor> showDoctorByQlyPara2(String qly1, String qly2) throws Exception;
	
	
	/* ----------------------- Getting all Entity Record with some specific column -----------------------------*/
	@Query("from Doctor where income>=:startInc and income<=:endInc order by income DESC") //Bulk Entity query
	public List<Doctor> showDoctorByIncome(Double startInc,Double endInc) throws Exception; 
	
	@Query("Select docid,docName,qly from Doctor where qly in(:qly1,:qly2)") //Bulk Scalar/Projection query operation
	public List<Object[]> showDoctorDataByQly(String qly1,String qly2) throws Exception; 
	
	@Query("Select docName from Doctor where qly=:qly1") //Bulk Scalar query giving single column value
	public List<String> showDoctorDataByQly(String qly1) throws Exception; 
	
	
	/* ----------------------- Getting an Entity Record with Single row --------------------------------------*/
	@Query(" from Doctor where docName=:dName") // Single row doctor Query
	public Doctor getDoctorByName(String dName) throws Exception;
	
	@Query(" Select docid,docName, income from Doctor where where docName=:dName") //Single row scalar query [Multiple columns]
	public Object getDoctorDataByName(String dName) throws Exception; 
	
	@Query("Select income from Doctor where docName=:dName")
	public Double getDoctorIncomeByName(String dName) throws Exception;
	
	/* ----------------------- Aggregate Operations --------------------------------------*/
	@Query("Select distinct count")
	public Long showUniqueDoctorCount();
	
	
	
	
	
}
