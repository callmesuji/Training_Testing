package wrapper_class;

import java.util.Scanner;

public class FloatExample {

	public static void main(String[] args) throws Exception {
		float result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter double value num1");
		String num1 = sc.nextLine();

		System.out.println("Enter double value num2");
		String num2 = sc.nextLine();

		result = (Float.parseFloat(num1)) * (Float.parseFloat(num2));

		System.out.println("The Float result of num1 " + num1 + " * " + num2 + " is " + result);
		sc.close();

	}

}
