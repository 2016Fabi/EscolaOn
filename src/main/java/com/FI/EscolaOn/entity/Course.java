package com.FI.EscolaOn.entity;

import java.time.Instant;

import com.FI.EscolaOn.enums.CourseName;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CourseName course;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String description;

	private Instant createdAt = Instant.now();

	@Column(nullable = false)
	private int timeCourse;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Course() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CourseName getCourse() {
		return course;
	}

	public void setCourse(CourseName course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public int getTimeCourse() {
		return timeCourse;
	}

	public void setTimeCourse(int timeCourse) {
		this.timeCourse = timeCourse;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
