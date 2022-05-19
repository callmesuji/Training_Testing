package com.nttdata.com;

import java.util.Scanner;

public class ArrayExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the array size");

			int size = sc.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter the array elements");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("printing array elements");

			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this is finally block");
			sc.close();
		}
	}

}
