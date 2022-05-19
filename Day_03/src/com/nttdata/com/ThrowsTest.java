package com.nttdata.com;

public class ThrowsTest {
	public int division(int num1, int num2) throws NullPointerException {
		int divide = num1 / num2;
		return divide;
	}

	public static void main(String[] args)   {

		ThrowsTest obj = new ThrowsTest();
		 
		 obj.division(1, 0);
		 
	}
}
