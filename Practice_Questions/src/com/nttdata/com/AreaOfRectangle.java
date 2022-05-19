package com.nttdata.com;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Double area;
		Double length;
		Double width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = sc.nextDouble();
		System.out.println("Enter the width of rectangle");
		width = sc.nextDouble();

		area = length * width;

		System.out.println("Area of a Rectangle is " + area);
		sc.close();
	}

}
