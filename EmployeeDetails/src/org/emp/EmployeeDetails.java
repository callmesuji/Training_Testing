package org.emp;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee id");
		int emp_id = sc.nextInt();

		System.out.println("Enter Employee name");
		String emp_name = sc.next();

		System.out.println("Enter Employee Email");
		String emp_email = sc.next();

		System.out.println("Enter Employee phone number");
		long emp_mob_number = sc.nextLong();

		System.out.println("Enter Employee salary");
		double emp_salary = sc.nextDouble();

		System.out.println("Enter Employee Gender");
		String emp_gender = sc.next();

		System.out.println("Enter Employee City");
		String emp_city = sc.next();

		System.out.println("Employee Details are as follows");

		System.out.println("Employee id --------------------" + emp_id);
		System.out.println("Employee name ------------------" + emp_name);
		System.out.println("Employee Email -----------------" + emp_email);
		System.out.println("Employee mobile number ---------" + emp_mob_number);
		System.out.println("Employee salary ----------------" + emp_salary);
		System.out.println("Employee Gender ----------------" + emp_gender);
		System.out.println("Employee City ------------------" + emp_city);

	}

}
