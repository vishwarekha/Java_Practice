package com.javatpoint.sample;

public class StringExamples {
	
	

	public static void main(String args[]) {
		String str1="Vishu";
		String str2="Vishu";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		String str3=new String("Vishu");
		String str4=new String("Vishu");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	
	}
	
	
}
