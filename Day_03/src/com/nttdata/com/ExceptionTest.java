package com.nttdata.com;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Exception occoured");
		}
		finally {
			System.out.println("this is finally block");
			sc.close();
		}
	}
}

