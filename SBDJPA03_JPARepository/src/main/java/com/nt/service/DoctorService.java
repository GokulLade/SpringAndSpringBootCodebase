package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
@Service
public class DoctorService implements IDoctorService{
	
	@Autowired
	private IDoctorRepository repo;
	
	@Override
	public String removeAllDoctorInBatch(Iterable<Integer> ids) 
	{
		//Getting the Doctor based on ids
		List<Doctor> list = repo.findAllById(ids);
		
		//Getting available doctor count
		int count=list.size();
		
		//Delete Record
		repo.deleteAllByIdInBatch(ids);
		
		return count+"number of record are deleted..!";
	}
	
	
	@Override
	public List<Doctor> findDoctorByExampleData(Doctor doctor, boolean ascOrder, String... props) 
	{
		Example<Doctor> example=Example.of(doctor);
		
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		List<Doctor> list = repo.findAll(example, sort);
		
		return list;
	}
	
	
	@Override
	public Doctor showDoctorById(Integer id) 
	{
		Doctor doctor=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
		
		return doctor;
	}
	
	@Override
	public Doctor fetchDoctorById(Integer id) 
	{
		Doctor doctor = repo.getReferenceById(id);
		
		return doctor;
	}
	
}
