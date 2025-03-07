package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Doctor;

public interface IDoctorService {
	
	//Sorting 
	public Iterable<Doctor> showAllDoctorBySorting(boolean ascOrder,String ...props);
	
	//Pagination
	public Page<Doctor> showAllDoctorByPageNo(int pageNo,int pageSize); //Without Sorting
	public Page<Doctor> showAllDoctorByPageNoAsSorted(int pageNo,int pageSize,boolean ascOrder, String ...props); //With Sorting
	public void showAllDoctorInPagination(int pageSize);
	

}
