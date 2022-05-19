package com.nttdata.com;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of square");
		Double sides = sc.nextDouble();

		area = sides * sides;

		System.out.println("Area of a Square is " + area);
		sc.close();

	}

}
