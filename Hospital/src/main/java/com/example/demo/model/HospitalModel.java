package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HospitalModel {
	
	
	
	@Id
	private String pId;
	private String firstname;
	private String secondname;
	private int age;
	private String mobile;
	private String consultant;
	private String gender;
	private double weight;
	private int bp;
	private int oxygen_lvl;
	private String problem;
	private String appoinment;
	
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getBp() {
		return bp;
	}
	public void setBp(int bp) {
		this.bp = bp;
	}
	public int getOxygen_lvl() {
		return oxygen_lvl;
	}
	public void setOxygen_lvl(int oxygen_lvl) {
		this.oxygen_lvl = oxygen_lvl;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getAppoinment() {
		return appoinment;
	}
	public void setAppoinment(String appoinment) {
		this.appoinment = appoinment;
	}
	
	
	
	
	

}
