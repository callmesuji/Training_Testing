package com.nttdata.com;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Entered " + num + " number is even");
		} else {
			System.out.println("Entered " + num + " number is even");
		}
		sc.close();
	}

}
