package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DocRepository;

@Service
public class CardiacServiceImpl extends DoctorServiceAb {

	@Autowired
	DocRepository dr;

	@Override
	public String saveDoctor(Doctor d) {
		d.setRequiredExperinece(10);
		d.setFees(7500);

		dr.save(d);

		return "Doctor Added for Cardiac";
	}

	@Override
	public Doctor getById(int id) {

		return dr.findById(id).get();
	}

}
