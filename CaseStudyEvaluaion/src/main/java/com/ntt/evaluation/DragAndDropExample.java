package com.ntt.evaluation;

import com.ntt.evaluation.base.DragBase;

public class DragAndDropExample extends DragBase {

	public static void main(String[] args) throws InterruptedException {

		getDriver();

		driver.manage().window().maximize();

		getUrl("http://demo.guru99.com/test/drag_drop.html");

		debitAccountDragAndDrop();

		debitAmountDragAndDrop();

		creditAccountDragAndDrop();

		creditAmountDragAndDrop();

		printMessage();

		quit();

	}

}
