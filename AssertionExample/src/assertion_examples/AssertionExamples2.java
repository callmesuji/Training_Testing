package assertion_examples;

import java.util.Scanner;

public class AssertionExamples2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check for qualification");
		int age = sc.nextInt();

		 assert age >= 18 && age <= 122 : "Cannot Vote";
	      System.out.println("The voter's age is " + age);
	      sc.close();

	}

}