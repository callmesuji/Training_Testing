package com.nttdata.com;

public class FinalExample {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println("exception occoured");
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception occoured");
				System.out.println(e);
			}
			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handled the exception (outer catch)");
		}
		finally {
			System.out.println("this is Finally block");
		}
	}

}
