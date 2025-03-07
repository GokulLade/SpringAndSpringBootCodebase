package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorService;

@Component
public class DoctorClassRunners implements CommandLineRunner {

	@Autowired
	private IDoctorService docService;
	
	@Override
	public void run(String... args) throws Exception 
	{
//		try {
//			
//			Doctor doctor= new Doctor("Gokul", "MD", 353434D);
//			
//			String msg=docService.registerDoctor(doctor);
//			
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//			Long showDoctorCount = docService.showDoctorCount();
//			
//			System.out.println(showDoctorCount);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		
//		try {
//			
//			//Storing Doctors in List
//			List<Doctor> doctors=List.of(new Doctor("Ram","MD",3432323D),new Doctor("Shyam","MBBS",3432323D),new Doctor("Om","MD",344323D));
//			
//			
//			//Passing List to Service class
//			String msg = docService.registerDoctorsAsroup(doctors);
//			
//			//Printing Result
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			
//			String msg = docService.checkDoctorAvailabilityById(8);
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//			Iterable<Doctor> list = docService.findAllDoctors();
//			list.forEach(doc->System.out.println(doc));
//			System.out.println("---------------");
//			
//			list.forEach(doc->System.out.println(doc));
//			System.out.println("---------------");
//			
//			list.forEach(System.out::println);
//			System.out.println("---------------");
//			
//			StreamSupport.stream(list.spliterator(), false).forEach(System.out::println);
//			System.out.println("---------------");
//			
//			long count=StreamSupport.stream(list.spliterator(), false).count();
//			System.out.println("No.of records ::"+count);
//			System.out.println("---------------");
//			
//			Iterable<String> qualification=StreamSupport.stream(list.spliterator(),false).
//												map(Doctor::getQly).
//												collect(Collectors.toList());
//			System.out.println(qualification);
//			System.out.println("---------------");
//			
//			for(Doctor doc:list) 
//			{
//				System.out.println(doc);
//			}
//			System.out.println("---------------");
//		
//			List<Doctor> listl =StreamSupport.stream(list.spliterator(), false).toList();
//			for(int i=0;i<count;++i) 
//			{
//				System.out.println(listl.get(i));
//			}
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			
////			Iterable<Integer> list=List.of(4,5,null); Exception
//			Iterable<Integer> list=Arrays.asList(4,5,null); 
//			
//			
//			Iterable<Doctor> allDoctorsByIds = docService.findAllDoctorsByIds(list);
//			
//			allDoctorsByIds.forEach(doc->System.out.println(doc));
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		
//		try {
//			Doctor doctor = docService.showDoctorById(8);
//			
//			System.out.println(doctor);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//			Doctor doctor=new Doctor(7,"Ram","MBBS",45000D);
//			
//			String msg = docService.registerOrUpdateDoctor(doctor);
//			
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}

//		try {
//			
//			String msg = docService.updateDoctorDetails(8, 3000D, "MBBS");
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			
//		}
		
		
//		try {
//			
//			String msg=docService.deleteAllDoctor();
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
////		
		
//		try {
//			
//			String msg = docService.deleteDoctorByIds(Arrays.asList(12,13,14));
//			
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		try {
			
			String msg = docService.deleteDoctorbyId(15);
			
			System.out.println(msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
