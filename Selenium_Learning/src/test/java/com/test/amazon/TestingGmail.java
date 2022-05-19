package com.test.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://in.mail.yahoo.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sujithchowdary1223@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"signin-main\"]/div[1]/a")).click();
//		driver.navigate().back();

	}

}
