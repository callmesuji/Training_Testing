package wrapper_class;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) throws Exception {

		 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter double value num1");
		String num1 = sc.nextLine();

		System.out.println("Enter double value num2");
		String num2 = sc.nextLine();
		sc.close();
		int val2 = Integer.parseInt(num2);
		System.out.println("hello");

		if (val2 < 0) {
			System.out.println("cant divide by 0");

		}

		float value = (Float.parseFloat(num1)) / (Float.parseFloat(num2));
		System.out.println("The Float result of num1 " + num1 + " / " + num2 + " is " + value);

	}

}
