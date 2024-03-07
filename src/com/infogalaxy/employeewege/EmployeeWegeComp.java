
package com.infogalaxy.employeewege;

import java.util.Random;


public class EmployeeWegeComp {
	public static void main(String args[]) {
		
		int attendance=0;
		System.out.println("Welcome To Employee Wage omputation program");
	
		Random random = new Random();
		attendance=random.nextInt(9)%2;
		
	//	attendance=Math.random();


		System.out.println("Random now:"+Math.floor(Math.random() %2));
		
		System.out.println("Random now:"+attendance);
	if(attendance==0) {
		
		System.out.println("Employee Is Absent ");
		
	}
	
	else{
		
		System.out.println("Employee is present ");
		
	}

}
}