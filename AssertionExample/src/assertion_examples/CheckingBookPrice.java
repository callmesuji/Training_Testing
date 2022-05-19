package assertion_examples;

import java.util.Scanner;

public class CheckingBookPrice {

	private static void checkPriceOfBook(int sp) {
		assert sp > 499 : "selling price cant be less than cost price";
		
		if(sp < 499) 
			System.out.println("cant be less than cost price");
		else
			System.out.println("it can be higher than costprice");
			
	 

	}

	public static void main(String[] args) {
		int costPrice = 499;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Selling price of the book");

		int sp = sc.nextInt();
		checkPriceOfBook(sp);

	}

}
