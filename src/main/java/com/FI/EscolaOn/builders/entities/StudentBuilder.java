package com.FI.EscolaOn.builders.entities;

import java.util.List;

import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.enums.RoleName;

public class StudentBuilder {
	 private Student entity;

	    private StudentBuilder(){
	        this.entity = new Student();
	    }

	    public static StudentBuilder builder(){
	        return new StudentBuilder();
	    }

	    public Student build(){
	        return this.entity;
	    }

	    public StudentBuilder name(String name){
	        this.entity.setName(name);
	        return this;
	    }

	    public StudentBuilder password(String password){
	        this.entity.setPassword(password);
	        return this;
	    }

	    public StudentBuilder email(String email){
	        this.entity.setEmail(email);
	        return this;
	    }

	    public StudentBuilder cpf(String cpf){
	        this.entity.setCpf(cpf);
	        return this;
	    }

	    public StudentBuilder roleName(RoleName role){
	        this.entity.setRoleName(role);
	        return this;
	    }

	    public StudentBuilder address(Address address) {
	        this.entity.setAddress(address);
	        return this;
	    }

	    public StudentBuilder courses(List<Course> courses) {
	        this.entity.setCourses(courses);
	        return this;
	    }
}
