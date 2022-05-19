package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

//		wait for 30sec load the module
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		closes current tab
//		driver.close();

//		entire browser will be closed
//		driver.quit();
	}

}
