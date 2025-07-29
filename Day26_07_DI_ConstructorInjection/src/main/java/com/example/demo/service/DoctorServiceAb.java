package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DocRepository;

@Service
public abstract class DoctorServiceAb implements DoctorService {

	
	@Autowired
	DocRepository dr;

	@Override
	public  List<Doctor> getAllDoctor() {		//common method to all childs
		return dr.findAll();
	}
	

}
