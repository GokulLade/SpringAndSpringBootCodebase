package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

	@Query("select ph.regno,ph.numberType,ph.phoneNumber,ph.provider,per.pid,per.pname,per.paddr from PhoneNumber ph inner join ph.person per")
	List<Object[]> showPhoneNumberAndPersonUsingJoin();
}
