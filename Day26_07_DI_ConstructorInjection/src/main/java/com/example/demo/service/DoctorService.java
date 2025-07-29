package com.example.demo.service;


import com.example.demo.entity.Doctor;

public interface DoctorService {
	
	public String saveDoctor(Doctor d);
	
	public Doctor getById(int id);
		
	

}
