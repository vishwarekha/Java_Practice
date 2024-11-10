package com.javatpoint.sample;

 class Test {
	 public static boolean check;
	
public static void main(String args[]) {
	int ii;
	if(check==true) 
		ii=1;
	
	else 
		ii=2;
	if(ii==2)
		ii=ii+2;
	else
		ii=ii+4;
	
	
	System.out.println(ii);
}


}