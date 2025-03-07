package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorService;

@Component
public class PagingAndSortingRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService service;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Iterable<Doctor> showAllDoctorBySorting = service.showAllDoctorBySorting(true, "income","docName");
//
//			showAllDoctorBySorting.forEach(System.out::println);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			
//			Page<Doctor> page = service.showAllDoctorByPageNo(1, 3);
//			
//			List<Doctor> list = page.getContent();
//			
//			System.out.println("Page Record are: ");
//			list.forEach(System.out::println);
//			
//			System.out.println("Page number is: "+(page.getNumber()+1));
//			System.out.println("Page count is: "+page.getTotalPages());
//			System.out.println("Is first Page: "+page.isFirst());
//			System.out.println("Is Last Page: "+page.isLast());
//			System.out.println("Page size : "+page.getSize());
//			System.out.println("Page element count: "+page.getNumberOfElements());
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//			Page<Doctor> page = service.showAllDoctorByPageNoAsSorted(0, 3, false, "income","docName");
//			page.forEach(System.out::println);
//			
//		}
//		catch(Exception e)
//		{
//			
//		}
		
		
		try {
			
			service.showAllDoctorInPagination(4);
			
		}
		catch(Exception e)
		{
			
		}

	}

}
