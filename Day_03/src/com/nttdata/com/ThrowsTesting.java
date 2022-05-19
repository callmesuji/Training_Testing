package com.nttdata.com;

public class ThrowsTesting {

	public void fun(int a, int b) throws Exception {
		if (a == b)
			System.out.println("same");
		else
			System.out.println("values differ");

	}

	public static void main(String[] args) throws Exception {
		ThrowsTesting obj = new ThrowsTesting();
		obj.fun(1, 0);

	}

}
