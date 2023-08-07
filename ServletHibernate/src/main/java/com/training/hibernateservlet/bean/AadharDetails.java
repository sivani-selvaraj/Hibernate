package com.training.hibernateservlet.bean;

public class AadharDetails {
	
	long Aadhar_ID;
	String Name;
	String Father_name;
	int Age;
	long Phone_no;
	String Address;
	String City;
	String State;
	long Pin;
	
	public long getPin() {
		return Pin;
	}
	public void setPin(long pin) {
		Pin = pin;
	}
	String Email_ID;
	
	public long getAadhar_ID() {
		return Aadhar_ID;
	}
	public void setAadhar_ID(long aadhar_ID) {
		Aadhar_ID = aadhar_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public String getEmail_ID() {
		return Email_ID;
	}
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	

}
