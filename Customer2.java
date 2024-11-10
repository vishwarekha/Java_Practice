package com.javatpoint.sample;

public class Customer2 {

	private String firstName;
	private String lastName;
	private int age;
	private int roomNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Customer2 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", roomNumber="
				+ roomNumber + "]";
	}
	
	
	
	
}
