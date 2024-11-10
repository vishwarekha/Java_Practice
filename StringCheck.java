package com.javatpoint.sample;

public class StringCheck {
	
	
	
	public static void main(String[] args) {	
		//String[] args= {"hello","world"};
		System.out.println("Argument>>>>>>>>>"+args);
		// TODO Auto-generated method stub
		  String s1 = "tutorialspoint"; // obj reference is same means hashcode is same .
	      String s2 = "tutorialspoint";
	      String s3 = new String ("Tutorials Point"); //stored outside the heap memory hashcode is different
	      String s4 = new String ("Tutorials Point");
	      System.out.println(s1==s2); // obj reference is same means hashcode is same .
	      System.out.println(s1.equals(s2)); // content of object
	      
	      System.out.println(s3==s4);
	      System.out.println(s3.equals(s4));
      
	      
	
	}

}
