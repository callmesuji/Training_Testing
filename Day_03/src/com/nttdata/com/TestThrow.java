package com.nttdata.com;

public class TestThrow {
	public int checkNo(int num1, int num2) throws Exception {
		if (num1 > num2)
			return num1 * num2;
		else
			throw new Exception("cant calculate");
	}

	public static void main(String[] args) {
		TestThrow obj = new TestThrow();
		try {
			obj.checkNo(5, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
