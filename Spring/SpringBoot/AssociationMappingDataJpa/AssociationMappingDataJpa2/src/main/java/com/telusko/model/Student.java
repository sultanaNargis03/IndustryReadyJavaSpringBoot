package com.telusko.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer age;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
	        name = "student course",
	        joinColumns = {
	            @JoinColumn(name = "student__id", referencedColumnName="id")
	        }, inverseJoinColumns= { @JoinColumn(name = "course_id", referencedColumnName="cid")})
	@JsonManagedReference
	private Set<Course> courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", courses=" + courses + "]";
	}
	
	
}
