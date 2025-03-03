package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.exception.DoctorNotFoundException;
import com.nt.repository.IDoctorRepo;

@Service("doc-service")
public class DoctorServiceImp implements IDoctorService {

	@Autowired
	private IDoctorRepo docRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) 
	{
		Doctor doc=docRepo.save(doctor);
		return "Doctor object is saved with id value: "+doc.getDocid();
	}
	
	
	@Override
	public Long showDoctorCount() 
	{
		
		long count = docRepo.count();
		
		return count;
	}
	

	@Override
	public String registerDoctorsAsroup(Iterable<Doctor> list) 
	{
		//Storing List of doctor in database using saveAll method
		Iterable<Doctor> saveAll = docRepo.saveAll(list);
		
		//Converting Iterable into StreamAPI and fetch all ids
		List<Integer> ids = StreamSupport.stream(saveAll.spliterator(), false).map(Doctor::getDocid).collect(Collectors.toList());
		
		//Returning the result
		return ids.size()+"Number of Doctor are saved with the ids: "+ids;
	}
	
	
	@Override
	public String checkDoctorAvailabilityById(int id) 
	{
		boolean isAvailable = docRepo.existsById(id);
		
		return (isAvailable==true)?id+" Id number Doctor is found":"Doctor is not found";
	}
	
	@Override
	public Iterable<Doctor> findAllDoctors() 
	{
		return docRepo.findAll();
	}
	
	@Override
	public Iterable<Doctor> findAllDoctorsByIds(Iterable<Integer> ids) 
	{
		return docRepo.findAllById(ids);
	}
	
	@Override
	public Doctor showDoctorById(Integer id) 
	{
		Optional<Doctor> opt = docRepo.findById(id);
		
		Doctor doc=opt.orElseThrow(()->new DoctorNotFoundException("ID Doctor is not found"));
		
		return doc;
	}
	
	
	@Override
	public String registerOrUpdateDoctor(Doctor doctor) 
	{
		docRepo.save(doctor);
		return "Doctor is Saved / Updated";
	}
	
	
	@Override
	public String updateDoctorDetails(Integer id, Double newIncome, String newQly) 
	{
		Optional<Doctor> opt = docRepo.findById(id);
		
		if(opt.isPresent())
		{
			//Getting Doctor Class Object
			Doctor doctor = opt.get();
			
			//Setting new Data
			doctor.setIncome(newIncome);
			doctor.setQly(newQly);
			
			//Saving into Database
			docRepo.save(doctor);
			
			return "Doctor details are Updated";
		}
		
		return "Doctor id is not found";
	}

}
