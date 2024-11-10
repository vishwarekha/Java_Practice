package com.javatpoint.sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value for originalStr");
		String originalStr=sc.nextLine();
		
		String revStr="";
		
		for(int i=0;i<originalStr.length();i++) {
			revStr=originalStr.charAt(i)+revStr;
		}
		System.out.println("Reversed String------->"+revStr);
		if(originalStr.equals(revStr)) {			
			System.out.println("Original String is a palindrome");
		}
		else {
			System.out.println("Original String is not a palindrome");		
			}

	}

}
