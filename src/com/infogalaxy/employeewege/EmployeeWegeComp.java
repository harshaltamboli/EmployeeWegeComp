
package com.infogalaxy.employeewege;

import java.util.Random;


public class EmployeeWegeComp {
	public static void main(String args[]) {
		int attendance ;
		int dailyWage  = 0;
		int employee_type ;
		int total_working_hr = 0;
		int total_working_days =1;
		int total_wage =0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS =20;
		System.out.println("Welcome To Employee Wage omputation program");
		
		while(total_working_hr <= 100 && total_working_days <= 20) {
			
			System.out.println("Days="+total_working_days);
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
					dailyWage  = WAGE_PER_HR * PART_TIME_HR;
					total_working_hr +=  PART_TIME_HR;
					break;
				case 1:
					System.out.println("Employee is FULL time");
					dailyWage  = WAGE_PER_HR * FULL_TIME_HR;
					total_working_hr +=  FULL_TIME_HR;
					break;
					
					
				}
				total_wage = total_wage+ dailyWage ;
				System.out.println("Employee Wage="+dailyWage);
				break;
		
			}
			
			System.out.println("Total workin hr="+	total_working_hr);
			System.out.println("---------------------------------------------");
			
			total_working_days++;
		}
		System.out.println("Employee Monthly Wage="+total_wage);
		
	
		}
}