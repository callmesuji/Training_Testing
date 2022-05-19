package wrapper_class;

import java.util.Scanner;

public class Subtract {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter double value num1");
		String num1 = sc.nextLine();

		System.out.println("Enter double value num2");
		String num2 = sc.nextLine();

		double value = (Double.parseDouble(num1)) - (Double.parseDouble(num2));

		System.out.println("The Double result of num1 " + num1 + " - " + num2 + " is " + value);
		sc.close();
	}

}
