package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo1 {
	@Id    
    public int id;
	private String name;
    public int age;
	public String gender;
    public String bloodgroup;
    private long number;
    public String healthcondition;
    public float weight;
    public float haemoglobinCount;
    public String city;
   
    
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float gethaemoglobinCount() {
		return haemoglobinCount;
	}
	public void setHaemoglobinCount(float haemoglobinCount) {
		this.haemoglobinCount = haemoglobinCount;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	public String getHealthcondition()
	{
		return healthcondition;
	}
	public void setHealthcondition(String healthcondition) {
		this.healthcondition = healthcondition;
	}
	

    
    
    
}
