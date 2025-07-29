package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {
	
	public String saveDoctor(Doctor d);
	
	public Doctor getById(int id);
	
	public List<Doctor> getAllDoctor();
	
	public List<Doctor> getDoctorsBySpeaciality();
		
	

}
