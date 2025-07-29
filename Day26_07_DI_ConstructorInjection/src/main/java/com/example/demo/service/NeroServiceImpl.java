package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DocRepository;

@Service
public class NeroServiceImpl extends DoctorServiceAb {

	@Autowired
	DocRepository dr;

	@Override
	public String saveDoctor(Doctor d) {

		d.setRequiredExperinece(8);
		d.setFees(5000);

		dr.save(d);
		return "Doctor Added for Nero";
	}

	@Override
	public Doctor getById(int id) {

		return dr.findById(id).get();
	}

	@Override
	public List<Doctor> getDoctorsBySpeaciality() {
		
		return dr.findBySpecialization("nero");
	}

}
