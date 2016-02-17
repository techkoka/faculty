package com.bellinfo.faculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.faculty.model.FacultyRegistration;
import com.bellinfo.faculty.repository.FacultyRespository;

@Service
@Transactional
public class FacultyServiceImpl {
	
	@Autowired
	FacultyRespository facultyRespository;
	
	public int saveFaculty(FacultyRegistration fac){
		return facultyRespository.saveFaculty(fac);
	}
	
	public List<FacultyRegistration> listFacultyDetails(){	
		return facultyRespository.listFacultyDetails();
	}

	public void updateFacultyDetails(FacultyRegistration fac){
		facultyRespository.updateFacultyDetails(fac);
	}
	
	public FacultyRegistration getFacultyData(int id){
		return facultyRespository.getFacultyData(id);
	}
	
	public void deleteFacultyData(int id){
		facultyRespository.deleteFacultyData(id);  
	}
	
}
