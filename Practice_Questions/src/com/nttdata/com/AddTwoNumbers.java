package com.nttdata.com;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int num1;
		int num2;
		int res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		num1 = sc.nextInt();
		System.out.println("Enter the num2");
		num2 = sc.nextInt();

		res = num1 + num2;
		System.out.println(res);
		sc.close();

	}

}
