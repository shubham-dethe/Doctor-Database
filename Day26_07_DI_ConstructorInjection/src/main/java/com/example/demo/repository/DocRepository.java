package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DocRepository extends JpaRepository<Doctor, Integer> {

	List<Doctor> findBySpecialization(String specialization);
}
