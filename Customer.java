package com.javatpoint.sample;

import java.util.Scanner;

public class Customer{

	

	/*
	 * private String firstName; private String lastName; private int age; private
	 * int roomNumber;
	 */

	public static void main(String args[]) {
		
		String firstName , lastName  ;
		int age = 0 , roomNumber = 0;
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the value for firstName:" );
		firstName = sc.nextLine();
		
		
		System.out.println("Enter the value for lastName:" );
		lastName = sc.nextLine();
		
		System.out.println("Enter the value for age:" );
		age = sc.nextInt();
		System.out.println("Enter the value for roomNumber:" );
		roomNumber = sc.nextInt();
		
		System.out.println("FirstName:" + firstName);
		System.out.println("LastName:" + lastName);
		System.out.println("Age:" + age);
		System.out.println("RoomNumber:"+roomNumber);

	}
	
	

}
