package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

//	@Query("select per.pid,per.pname,per.paddr, ph.regno,ph.numberType,ph.phoneNumber,ph.provider from Person per inner join per.phones ph")
//	@Query("select per.pid,per.pname,per.paddr, ph.regno,ph.numberType,ph.phoneNumber,ph.provider from Person per right join per.phones ph")
//	@Query("select per.pid,per.pname,per.paddr, ph.regno,ph.numberType,ph.phoneNumber,ph.provider from Person per left join per.phones ph")
	@Query("select per.pid,per.pname,per.paddr, ph.regno,ph.numberType,ph.phoneNumber,ph.provider from Person per full join per.phones ph")
	List<Object[]> showPersonAndPhoneNumberUsingJoins();
}
