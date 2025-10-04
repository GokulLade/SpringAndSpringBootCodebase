package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
