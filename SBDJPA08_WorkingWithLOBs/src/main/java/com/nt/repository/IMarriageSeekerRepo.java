package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.MarriageSeeker;

@Repository
public interface IMarriageSeekerRepo extends JpaRepository<MarriageSeeker, Integer> {

}
