package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
@Service
public class DoctorService implements IDoctorService{
	
	@Autowired
	private IDoctorRepository repo;
	
	@Override
	public Iterable<Doctor> showAllDoctorBySorting(boolean ascOrder, String... props) 
	{
		//Creating Sort Object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		//Use repository ref
		Iterable<Doctor> all = repo.findAll(sort);
		
		return all;
	}
	
	@Override
	public Page<Doctor> showAllDoctorByPageNo(int pageNo, int pageSize) 
	{
		//Creating Object for Pageable
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		
		//Creating Object for Page
		Page<Doctor> page=repo.findAll(pageable);
		
		return page;
	}
	
	@Override
	public Page<Doctor> showAllDoctorByPageNoAsSorted(int pageNo, int pageSize, boolean ascOrder, String... props) 
	{
		//Creating Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		//Creating Object for Pageable
		Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
				
		//Creating Object for Page
		Page<Doctor> page=repo.findAll(pageable);
				
		return page;
	}
	
	@Override
	public void showAllDoctorInPagination(int pageSize) 
	{
		//Getting Record Count
		long count=repo.count();
		
		//Getting Page Count
		long pageCount=count/pageSize;
		
		//Checking pageCount is odd or not is it then increase by one
		if(count%pageSize!=0)
		{
			pageCount++;
		}
		
		//Getting Pageable object for each page
		for(int i=0;i<pageCount;i++)
		{
			Pageable pageable=PageRequest.of(i, pageSize);
			
			Page<Doctor> page=repo.findAll(pageable);
			
			System.out.println("---------- Page Number is "+(page.getNumber()+1)+"/"+page.getTotalPages()+" Records are");
			
			page.forEach(System.out::println);
			
			System.out.println("-----------------------------------------");
		}
		
	}

}
