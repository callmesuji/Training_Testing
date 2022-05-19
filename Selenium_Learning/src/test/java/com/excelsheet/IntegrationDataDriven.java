package com.excelsheet;

import java.io.IOException;

import org.openqa.selenium.By;

public class IntegrationDataDriven extends Base {

	public static void main(String[] args) throws IOException {

		getDriver();

		getUrl("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(getData(1, 1));
		driver.findElement(By.id("pass")).sendKeys(getData(2, 1));

	}

}
