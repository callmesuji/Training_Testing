package org.emp;

import java.util.Scanner;

public class StudentTotalMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student id");
		int stu_id = sc.nextInt();

		System.out.println("Enter Student name");
		String stu_name = sc.next();

		System.out.println("MARK1");
		double m1 = sc.nextDouble();

		System.out.println("MARK2");
		double m2 = sc.nextDouble();

		System.out.println("MARK3");
		double m3 = sc.nextDouble();

		System.out.println("MARK4");
		double m4 = sc.nextDouble();

		System.out.println("MARK5");
		double m5 = sc.nextDouble();

		double stu_total = m1 + m2 + m3 + m4 + m5;

		System.out.println("Student Details and Total Marks are as follows");

		System.out.println("STUDENT ID" + stu_id);
		System.out.println("STUDENT NAME " + stu_name);
		System.out.println("STUDENT TOTAL MARKS " + stu_total);

	}

}
