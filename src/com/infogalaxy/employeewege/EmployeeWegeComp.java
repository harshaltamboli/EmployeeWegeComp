
package com.infogalaxy.employeewege;

import java.util.Random;


public class EmployeeWegeComp {
	public static void main(String args[]) {
		
		int attendance ;
		int dailyWage  = 0;
		int employee_type ;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		final int PART_TIME_HR = 4;
		System.out.println("Welcome To Employee Wage omputation program");
	
		Random random = new Random();
		attendance=random.nextInt(9)%2;
		
	
		
		System.out.println("Random now:"+attendance);
	if(attendance==0) {
		
		System.out.println("Employee Is Absent ");
		
	}
	
	else{
		
		System.out.println("Employee is present ");
	
		employee_type = random.nextInt(9) % 2 ;
		
		if(employee_type == 0) {
			System.out.println("Employee is part time");
			dailyWage  = WAGE_PER_HR *PART_TIME_HR;
		}
		
		else {
			
			System.out.println("Employee is full time");
			dailyWage  = WAGE_PER_HR *FULL_DAY_HR;
		}
		//dailyWage  = WAGE_PER_HR *FULL_DAY_HR;
		System.out.println("Employee Wage="+dailyWage);
	}

}
}