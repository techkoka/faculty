package com.bellinfo.faculty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Fac_Reg")
public class FacultyRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FAC_ID")
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min=2, max=10)
	@Column(name="FAC_NAME")
	private String name;
	
	@Email
	@NotBlank
	@Column(name="FAC_EMAIL")
	private String email;
	
	@Column(name="Tech")
	private String tech;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "FacultyRegistration [id=" + id + ", name=" + name + ", email="
				+ email + ", tech=" + tech + "]";
	}

	

}
