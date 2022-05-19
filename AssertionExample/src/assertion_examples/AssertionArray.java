package assertion_examples;

import java.util.Scanner;
import java.util.logging.Logger;

public class AssertionArray {

	private static void checkArray(int[] arr) {
		
		assert (arr.length > 0 && arr[0] > 0) : "assigned value at index 1 less than zero";

		if (arr[0] > 0) {
			System.out.println(arr[0]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arr[] = new int[sc.nextInt()];

		System.out.println("Enter Elements into array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		checkArray(arr);
		sc.close();

	}

}
