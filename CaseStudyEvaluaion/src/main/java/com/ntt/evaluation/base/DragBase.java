package com.ntt.evaluation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragBase extends Base {

	public static WebElement findById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static void debitAccountDragAndDrop() throws InterruptedException {
		WebElement drag1 = findById("credit2");
		WebElement drop1 = findById("bank");
		acc = new Actions(driver);
		sleep();
		acc.dragAndDrop(drag1, drop1).build().perform();
	}

	public static void debitAmountDragAndDrop() throws InterruptedException {
		WebElement drag1 = findById("fourth");
		WebElement drop1 = findById("amt7");
		acc = new Actions(driver);
		sleep();
		acc.dragAndDrop(drag1, drop1).build().perform();
	}

	public static void creditAccountDragAndDrop() throws InterruptedException {
		WebElement drag1 = findById("credit1");
		WebElement drop1 = findById("loan");
		acc = new Actions(driver);
		sleep();
		acc.dragAndDrop(drag1, drop1).build().perform();
	}

	public static void creditAmountDragAndDrop() throws InterruptedException {
		WebElement drag1 = findById("fourth");
		WebElement drop1 = findById("amt8");
		acc = new Actions(driver);
		sleep();
		acc.dragAndDrop(drag1, drop1).build().perform();
	}

	public static void printMessage() throws InterruptedException {
		WebElement text = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text2 = text.getText();
		sleep();
		System.out.println(text2);
	}

}
