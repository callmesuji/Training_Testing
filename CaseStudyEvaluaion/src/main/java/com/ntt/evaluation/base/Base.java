package com.ntt.evaluation.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static WebElement element;
	
	public static Actions acc;

	public static WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() throws InterruptedException {
		sleep();
		driver.quit();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void searchAndEnter() throws InterruptedException, AWTException {
		element = driver.findElement(By.id("twotabsearchtextbox"));

		type(element, "I-phone XR");
		
		/*
		 * Robot r = new Robot(); r.keyPress(KeyEvent.VK_ENTER);
		 * r.keyRelease(KeyEvent.VK_ENTER);
		 */

		searchAndReturnId("nav-search-submit-button");
	}

	public static void clickFirstProduct() throws InterruptedException {
		searchAndReturnXpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	}

	public static String getWindowHandle() {
		String pwid = driver.getWindowHandle();
		return pwid;
	}

	public static Set<String> getWindowHandles() {
		Set<String> all = driver.getWindowHandles();
		return all;
	}

	public static void switchWindow() throws InterruptedException {

		String parentId = getWindowHandle();

		Set<String> all = getWindowHandles();

		for (String a : all) {
			if (!parentId.equals(a)) {
				driver.switchTo().window(a);
			}
		}
	}

	public static void addToCart() throws InterruptedException {
		searchAndReturnId("add-to-cart-button");
	}

	public static void printText(WebElement text) throws InterruptedException {
		sleep();

		String t = text.getText();

		System.out.println(t);
	}

	public static WebElement searchAndReturnXpath(String xpath) throws InterruptedException {
		element = driver.findElement(By.xpath(xpath));
		sleep();
		btnClick(element);
		return element;
	}

	public static WebElement searchAndReturnId(String id) throws InterruptedException {
		element = driver.findElement(By.id(id));
		sleep();
		btnClick(element);
		return element;
	}

	public static void closeWindow() throws InterruptedException {
		searchAndReturnId("attach-close_sideSheet-link");
	}

	public static void printMessage() throws InterruptedException {
		sleep();
		WebElement findElement = driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[3]/div[1]/div[1]/div/div[1]/div/h4"));
		String text = findElement.getText();
		System.out.println(text);
	}

}
