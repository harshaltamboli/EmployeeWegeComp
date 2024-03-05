
package com.infogalaxy.employeewege;

import java.util.Scanner;

public class EmployeeWegeComp {
	public static void main(String args[]) {
		
		int attendance=0;
		Scanner sc=new Scanner(System.in);	
	System.out.println("Welcome To Employee Wage omputation program");
	
	System.out.println("Enter The Attendance : [0- Absent / 1- present]");
	attendance = sc.nextInt();
	if(attendance==0) {
		
		System.out.println("Employee Is Absent ");
		
	}
	
	else{
		
		System.out.println("Employee is present ");
		
	}

}
}