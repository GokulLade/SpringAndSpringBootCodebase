package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IOtoMService;

import jakarta.transaction.Transactional;

@Component
public class OtoMRunner implements CommandLineRunner {

	@Autowired
	private IOtoMService otomservice;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
//		// Parent Object
//		Person per = new Person("Gokul", "Hyd");
//
//		// Child Objects
//		PhoneNumber ph1 = new PhoneNumber("Home", 434343434L, "JIO");
//		PhoneNumber ph2 = new PhoneNumber("Office", 234234324L, "VI");
//
//		// Link parent to child(Many to One)
//		ph1.setPerson(per);
//		ph2.setPerson(per);
//
//		// Link child with parent(One to Many)
//		per.setPhones(Set.of(ph1, ph2));
//
//		try {
//			String msg = otomservice.regPersonAndhisPhoneNumber(per);
//			System.out.println(msg);
//
//		} catch (Exception e) {
//				e.printStackTrace();
//		}

		// Child to parent object saving
		// Parent Object
//		Person per = new Person("Ram", "Nanded");
//
//		// Child Object
//		PhoneNumber ph1 = new PhoneNumber("Home", 344234234L, "Airtel");
//		PhoneNumber ph2 = new PhoneNumber("Personal", 9064232323L, "JIO");
//
//		// Link parent with child
//		ph1.setPerson(per);
//		ph2.setPerson(per);
//
//		// Link child with parent
//		Set<PhoneNumber> ph = new HashSet<PhoneNumber>();
//		ph.add(ph1);
//		ph.add(ph2);
//		per.setPhones(ph);
//
//		// Parent List Collection
//		List<PhoneNumber> list = Arrays.asList(ph1, ph2);
//
//		//Invoke Business method
//		try {
//			String msg = otomservice.regPhoneNumberWithPerson(list);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//
//			List<Person> list = otomservice.loadPersonAndHisPhoneNumbers();
//			list.forEach(p -> {
//				System.out.println("Parent: " + p);
//				Set<PhoneNumber> set=p.getPhones();
//				set.forEach(ph->System.out.println(ph));
//				
//				System.out.println("---------------------------------------");
//			});
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			List<PhoneNumber> list = otomservice.loadPhoneNumberWithPerson();
//			list.forEach(ph->{
//				System.out.println("Child: "+ph);
//				
//				//Get Association parent
//				Person per=ph.getPerson();
//				System.out.println("Parent: "+per);
//			});
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//
//			String msg = otomservice.removePhoneOfAPerson(101);
//			System.out.println(msg);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//
//			PhoneNumber newPhno = new PhoneNumber("Office", 2323232L, "JIO");
//
//			String msg = otomservice.addNewPhoneNumberToPerson(101, newPhno);
//			System.out.println(msg);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			String msg = otomservice.removePhoneNumberAndPerson(101);
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
