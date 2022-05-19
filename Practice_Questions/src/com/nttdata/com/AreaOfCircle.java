package com.nttdata.com;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Double radius;
		Double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		radius = sc.nextDouble();
		area = radius * radius * Math.PI;
		System.out.println("area of circle is " + area);
		sc.close();
	}

}
