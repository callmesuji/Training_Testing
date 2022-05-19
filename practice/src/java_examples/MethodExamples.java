package java_examples;

import java.util.Scanner;

public class MethodExamples {

	static int empid = 1001;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 ");

		int num1 = sc.nextInt();

		System.out.println("Enter num 2 ");
		int num2 = sc.nextInt();

		System.out.println(add(num1, num2));
		
		
		
		sc.close();
	}

	private static int add(int num1, int num2) {

		int result = num1 + num2;

		String name = "sujith";
		
//		System.out.println(name);

		return result;

	}

}
