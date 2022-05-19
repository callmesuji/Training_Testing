package com.excelsheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\DELL\\eclipse-workspace\\sujith\\Selenium_Learning\\Excel\\Test Data.xlsx");

		Workbook w = new XSSFWorkbook();

		Sheet s = w.createSheet("Java");

		Row r = s.createRow(0);

		Cell c = r.createCell(1);

		c.setCellValue("selenium automation testing");

		FileOutputStream o = new FileOutputStream(loc);

		w.write(o);
		
		System.out.println("inserting data Completed");

	}

}
