package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void study() {
		System.out.println("Student is reading book");
		this.samosa.display();
	}
	private Samosa samosa; // dependency injection
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

}
