package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;

	public static String getData(int row, int cell) throws IOException {

		File loc = new File("C:\\Users\\DELL\\eclipse-workspace\\sujith\\Selenium_Learning\\Excel\\Test Data.xlsx");

		FileInputStream f = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(f);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		String value = null;

		int type = c.getCellType();

		if (type == 1) {
			value = c.getStringCellValue();
		} else if (type == 0) {

			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mmm-yyyy");
				value = sim.format(dateCellValue);
			} else {
				double numeric = c.getNumericCellValue();

				long l = (long) numeric;

				value = String.valueOf(l);
			}
		}
		return value;
	}

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");
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

	public static void selecyByValue(Select select, String value) {
		select.selectByValue(value);

	}

}
