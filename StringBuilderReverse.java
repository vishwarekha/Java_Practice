package com.javatpoint.sample;

public class StringBuilderReverse {
public static void main(String args[]) {
	//WAY1
	String str1="Automation";
	StringBuilder str2=new StringBuilder();
	str2.append(str1);
	str2=str2.reverse();
	System.out.println("Reverse string"+" "+str2);
	
	//WAY2
	StringBuilder str3=new StringBuilder();
	str3.append("AutomationNew1");	
	StringBuilder str4=new StringBuilder();
	str4.append(str3);
	str4=str4.reverse();
	System.out.println("Reversed String"+" "+str4);
	
	
	//WAY3
	StringBuilder str5=new StringBuilder();
	str5.append("Mango");
	str5=str5.reverse();
	System.out.println("Reversed string"+" "+str5);
	
}
}
