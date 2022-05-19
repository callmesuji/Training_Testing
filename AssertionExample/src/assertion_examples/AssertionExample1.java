package assertion_examples;

import java.util.Scanner;

public class AssertionExample1 {

	private static void CheckForAge(int age) {

		assert age > 18 && age < 123 : "You are not Eligible for voting";

		if (age > 18 && age < 123)
			System.out.println("Congrats you are eligible for voiting");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check for qualification");
		int age = sc.nextInt();

		CheckForAge(age);
		sc.close();
	}

}
