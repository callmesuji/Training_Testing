package wrapper_class;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer value num1");
		String num1 = sc.nextLine();

		System.out.println("Enter integer value num2");
		String num2 = sc.nextLine();

		int value = Integer.parseInt(num1) + Integer.parseInt(num2);

		System.out.println("The Addition result of num1 " + num1 + " + " + num2 + " is " + value);

		sc.close();

	}
}
