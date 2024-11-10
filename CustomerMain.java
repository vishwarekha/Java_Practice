package com.javatpoint.sample;

import java.util.Scanner;

public class CustomerMain {
	
	public static void main(String args[]) {
		Customer2 c=new Customer2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for firstName,lastName,age,room number");
		System.out.println();
		String fName=sc.nextLine();
		c.setFirstName(fName);
		String lName=sc.nextLine();
		c.setLastName(lName);
		int age=sc.nextInt();
		c.setAge(age);
		int rm=sc.nextInt();
		c.setRoomNumber(rm);
		System.out.println("FirstName:"+c.getFirstName());
		System.out.println("LastName:"+c.getLastName());
		System.out.println("Age:"+c.getAge());
		System.out.println("Room Number:"+c.getRoomNumber());
	
		
		
		
		
		
	}

}
