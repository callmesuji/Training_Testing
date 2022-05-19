package com.lwl.exam;

public class Parrot implements Animal, Birds {

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		System.out.println("Parrots can eat upto 100 grams in a day:\n");
	}

	@Override
	public void makeSound() {
		System.out.println("Parrots can make sound of screech :\n");


	}

}
