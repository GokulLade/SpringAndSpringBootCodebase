package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Faculty;
import com.nt.repository.IFacultyRepo;
import com.nt.repository.IStudentRepo;
@Service
public class CollegeMgmtService implements ICollegeMgmtService {

	@Autowired
	private IFacultyRepo facultyRepo;
	@Autowired
	private IStudentRepo studentRepo;
	
	@Override
	public String regDetailUsingFacultiesInfo(List<Faculty> list) {
		 List<Faculty> list1 = facultyRepo.saveAll(list);
		 List<Integer> ids = list1.stream().map(Faculty::getFid).collect(Collectors.toList());
		 return list1.size()+" Faculties and the associated Student are saved with the ids Values:" + ids;
	}

}
