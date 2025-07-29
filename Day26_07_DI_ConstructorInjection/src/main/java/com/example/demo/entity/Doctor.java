package com.example.demo.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "DoctorConst")
@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String specialization;		//nero or cardiac
	private String city;		
	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private int requiredExperinece;			//explicitly set on child impl requirement.
	private int fees;						//explicitly set on child impl requirement.
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public int getRequiredExperinece() {
		return requiredExperinece;
	}
	public void setRequiredExperinece(int requiredExperinece) {
		this.requiredExperinece = requiredExperinece;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/*private int docId;
	private String dname;
    private String specialization;
    private String email;
    private String contactNumber;
    private int experienceYears;
    private double consultationFee;
    private String Address;*/
	
	

}
