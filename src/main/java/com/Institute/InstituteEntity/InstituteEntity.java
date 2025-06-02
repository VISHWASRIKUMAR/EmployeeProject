package com.Institute.InstituteEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="Institutedetails")
@Entity
public class InstituteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String courses;
	private int fees;
	private int age;
	private float ratings;
	private String trainerName;
	private String location;
	
	
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
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "InstituteEntity [id=" + id + ", name=" + name + ", courses=" + courses + ", fees=" + fees + ", age="
				+ age + ", ratings=" + ratings + ", trainerName=" + trainerName + ", location=" + location + "]";
	}

	

}
