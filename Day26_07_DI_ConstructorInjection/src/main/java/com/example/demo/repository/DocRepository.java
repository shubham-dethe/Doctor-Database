package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DocRepository extends JpaRepository<Doctor, Integer> {

}
