package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String specialization;		//nero or cardiac
	private int city;			
	

	private int requiredExperinece;			//explicitly set on child impl requirement.
	private int fees;				//explicitly set on child impl requirement.
	private int age;
	
	
	/*private int docId;
	private String dname;
    private String specialization;
    private String email;
    private String contactNumber;
    private int experienceYears;
    private double consultationFee;
    private String Address;*/
	
	

}
