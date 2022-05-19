package com.ntt.evaluation;

import java.awt.AWTException;

import com.ntt.evaluation.base.Base;

public class AmazonExample extends Base {
	public static void main(String[] args) throws InterruptedException, AWTException {

		getDriver();

		driver.manage().window().maximize();

		getUrl("https://www.amazon.in/");

		searchAndEnter();

		clickFirstProduct();

		switchWindow();

		addToCart();
		
		printMessage();

		closeWindow();

		quit();

	}
}
