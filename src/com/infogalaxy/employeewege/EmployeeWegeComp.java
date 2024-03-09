
package com.infogalaxy.employeewege;

import java.util.Random;


public class EmployeeWegeComp {
	public static void main(String args[]) {
		int attendance ;
		int dailyWage  = 0;
		int employee_type ;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS =20;
		System.out.println("Welcome To Employee Wage omputation program");
		
		for(int i = 1; i <=WORKING_DAYS ; i++) {
			System.out.println("Days="+i);
			Random random = new Random();
			attendance=random.nextInt(9)%2;
			
		
			
			System.out.println("Random now:"+attendance);
			
			switch(attendance) {
			
			case 0:
				System.out.println("Employee is absent ");
			
			break;
			
			case 1:
				System.out.println("Employee is present ");
				
				employee_type = random.nextInt(9) % 2 ;
				
				switch(employee_type) {
				
				case 0:
					System.out.println("Employee is part time");
					dailyWage  = WAGE_PER_HR *PART_TIME_HR;
					
					break;
				case 1:
					System.out.println("Employee is FULL time");
					dailyWage  = WAGE_PER_HR *FULL_TIME_HR;
					
					break;
					
					
				}
				System.out.println("Employee Wage="+dailyWage);
				break;
		
			}
			
			System.out.println("---------------------------------------------");
		}
	
		}
}