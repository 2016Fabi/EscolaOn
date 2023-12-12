package com.FI.EscolaOn.builders.entities;

import java.util.List;

import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.entity.Teacher;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherBuilder {
	 private Teacher entity;

	    private TeacherBuilder(){
	        this.entity = new Teacher();
	    }

	    public static TeacherBuilder builder(){
	        return new TeacherBuilder();
	    }

	    public Teacher build(){
	        return this.entity;
	    }

	    public TeacherBuilder name(String name){
	        this.entity.setName(name);
	        return this;
	    }

	    public TeacherBuilder password(String password){
	        this.entity.setPassword(password);
	        return this;
	    }

	    public TeacherBuilder cpf(String cpf){
	        this.entity.setCpf(cpf);
	        return this;
	    }

	    public TeacherBuilder roleName(RoleName role){
	        this.entity.setRole(role);
	        return this;
	    }

	    public TeacherBuilder address(Address address) {
	        this.entity.setAddress(address);
	        return this;
	    }

	    public TeacherBuilder courses(List<Course> courses) {
	        this.entity.setCourses(courses);
	        return this;
	    }
}
