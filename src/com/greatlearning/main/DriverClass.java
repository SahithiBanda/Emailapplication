package com.greatlearning.main;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		System.out.println("Enter the department of the follwoing");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		
		System.out.println("Your generated crediantials are as follows");
		
		Employee emp=new Employee("Sandy","Rosy");
		
		Services ser=new Services();
		
		
	    int option;
	    option=sc.nextInt();
	    
	    switch(option) {
	    case1:
	    	System.out.println("Technical ");
	     String emailid=ser.generateEmailAddress();
	     break;
	     
	     case2:
		    	System.out.println("Admin ");
	     String admin=ser.generateUserName();
	     break;
	     
	     case3:
		    	System.out.println("HR ");
	     String hr=ser.generateHumanResource();
	     break;
	     
	     case4:
	    	  System.out.println("legal");
	     String legal=ser.generateLegal();
	   break;
	     
		    	

	    }
	
        
       
	}

}
