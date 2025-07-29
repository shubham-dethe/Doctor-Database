package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("doctor/{id}/{specialization}")
	public Doctor getbyId(@PathVariable int id, @PathVariable String specialization) {

		if (specialization.equalsIgnoreCase("nero")) {
			return neroServiceImpl.getById(id);

		}

		if (specialization.equalsIgnoreCase("cardiac")) {
			return cardiacServiceImpl.getById(id);

		}

		return null;

	}

	@GetMapping("doctor/all")
	public List<Doctor> getAllDoctors() {

		return neroServiceImpl.getAllDoctor(); // common in both child return the same output i.e. all doctors

	}

}
