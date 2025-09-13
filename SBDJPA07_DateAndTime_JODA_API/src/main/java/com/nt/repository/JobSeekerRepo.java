package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.JobSeeker;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {

	@Query(value = "SELECT TIMESTAMPDIFF(YEAR, js_dob, CURDATE()) FROM Job_Seeker_Info WHERE js_id = :id", nativeQuery = true)
	Float calculateAgeByJsId(int id);

}