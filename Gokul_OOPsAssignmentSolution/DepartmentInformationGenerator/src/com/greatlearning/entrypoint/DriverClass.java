package com.greatlearning.entrypoint;
import com.greatlearning.departments.*;

public class DriverClass {

	public static void main(String[] args) {

		// Creating objects of different departments
		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 = new HrDepartment();
		TechDepartment obj3 = new TechDepartment();

		// Printing the required output
		System.out.println("Welcome to " + obj1.departmentName() + "\n" + obj1.getTodaysWork() + "\n"
				+ obj1.getWorkDeadline() + "\n" + obj1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj2.departmentName() + "\n" + obj2.doActivity() + "\n"
				+ obj2.getTodaysWork() + "\n" + obj2.getWorkDeadline() + "\n" + obj2.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj3.departmentName() + "\n" + obj3.getTodaysWork() + "\n"
				+ obj3.getWorkDeadline() + "\n" + obj3.getTechStackInformation() + "\n" + obj3.isTodayAHoliday());

	}

}
