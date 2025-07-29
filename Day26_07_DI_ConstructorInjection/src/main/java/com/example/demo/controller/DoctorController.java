package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	private DoctorService neroServiceImpl;

	private DoctorService cardiacServiceImpl;

	public DoctorController(DoctorService neroServiceImpl, DoctorService cardiacServiceImpl) {

		this.neroServiceImpl = neroServiceImpl;
		this.cardiacServiceImpl = cardiacServiceImpl;
	}

	@PostMapping("doctor")
	public String addDoctor(@RequestBody Doctor d) {
		if (d.getSpecialization().equalsIgnoreCase("nero")) {

			return neroServiceImpl.saveDoctor(d);
		}

		if (d.getSpecialization().equalsIgnoreCase("cardiac")) {

			return cardiacServiceImpl.saveDoctor(d);
		}

		return "Doctor data not added";

	}

}
