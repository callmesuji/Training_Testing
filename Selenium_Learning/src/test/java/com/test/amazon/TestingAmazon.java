package com.test.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("MI")).click();
		driver.close();

	}

}
