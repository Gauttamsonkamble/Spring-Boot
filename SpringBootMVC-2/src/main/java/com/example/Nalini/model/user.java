package com.example.Nalini.model;

public class user {
	
	private int eid;
	private String fname;
	private String lname;
	private String email;
	private String Country;
	private int age;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "user [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", Country="
				+ Country + ", age=" + age + "]";
	}
	
	
	

}
