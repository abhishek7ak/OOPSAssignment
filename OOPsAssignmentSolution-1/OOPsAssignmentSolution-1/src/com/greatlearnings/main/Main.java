package com.greatlearnings.main;

import java.util.Scanner;

import com.greatlearnings.department.AdminDepartment;
import com.greatlearnings.department.HrDepartment;
import com.greatlearnings.department.SuperDepartment;
import com.greatlearnings.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please select department from the following");
			System.out.println(" 1. Super");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Tech");
			System.out.println("5. All");
			
			int choice = sc.nextInt();
			String department = null;
			switch(choice) {
			case 1:
				department = "Super";
				SuperDepartment objSuper = new SuperDepartment();
				System.out.println("Welcome to " +objSuper.departmentName());
				System.out.println(objSuper.getTodaysWork());
				System.out.println(objSuper.getWorkDeadline());
				System.out.println(objSuper.isTodayAHoliday());
				break;
			case 2:
				department = "Admin";
				AdminDepartment objAdmin = new AdminDepartment();
				System.out.println("Welcome to " + objAdmin.departmentName());
				System.out.println(objAdmin.getTodaysWork());
				System.out.println(objAdmin.getWorkDeadline());
				System.out.println(objAdmin.isTodayAHoliday() + "\n");
				break;
			case 3:
				department = "Human Resurces";
				HrDepartment objHr = new HrDepartment();
				System.out.println("Welcome to " + objHr.departmentName());
				System.out.println(objHr.doActivity());
				System.out.println(objHr.getTodaysWork());
				System.out.println(objHr.getWorkDeadline());
				System.out.println(objHr.isTodayAHoliday() + "\n");
			    System.out.println("");
			    return;
			case 4:
				department = "Tech";
				TechDepartment objTech = new TechDepartment();
				System.out.println("Welcome to " + objTech.departmentName());
				System.out.println(objTech.getTodaysWork());
				System.out.println(objTech.getWorkDeadline());
				System.out.println(objTech.getTechStackInformation());
				System.out.println(objTech.isTodayAHoliday());
				return;
			case 5:
				department = "All";
				SuperDepartment objSuper1 = new SuperDepartment();
				System.out.println("Welcome to " +objSuper1.departmentName());
				System.out.println(objSuper1.getTodaysWork());
				System.out.println(objSuper1.getWorkDeadline());
				System.out.println(objSuper1.isTodayAHoliday());
				System.out.println("");
				
				AdminDepartment objAdmin1 = new AdminDepartment();
				System.out.println("Welcome to " + objAdmin1.departmentName());
				System.out.println(objAdmin1.getTodaysWork());
				System.out.println(objAdmin1.getWorkDeadline());
				System.out.println(objAdmin1.isTodayAHoliday() + "\n");
				System.out.println("");
				
				HrDepartment objHr1 = new HrDepartment();
				System.out.println("Welcome to " + objHr1.departmentName());
				System.out.println(objHr1.doActivity());
				System.out.println(objHr1.getTodaysWork());
				System.out.println(objHr1.getWorkDeadline());
				System.out.println(objHr1.isTodayAHoliday() + "\n");
			    System.out.println("");
			    
			    TechDepartment objTech1 = new TechDepartment();
				System.out.println("Welcome to " + objTech1.departmentName());
				System.out.println(objTech1.getTodaysWork());
				System.out.println(objTech1.getWorkDeadline());
				System.out.println(objTech1.getTechStackInformation());
				System.out.println(objTech1.isTodayAHoliday());
				break;
			}
		}
	}

}
