package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Update {

	public static void main(String[] args) throws IOException {

		File loca = new File("C:\\Users\\DELL\\eclipse-workspace\\sujith\\Selenium_Learning\\Excel\\Test Data.xlsx");

		FileInputStream f = new FileInputStream(loca);

		Workbook w = new XSSFWorkbook();

		Sheet s = w.getSheet("Java");

		Row r = s.getRow(0);

		Cell c = r.getCell(1);

		String name = c.getStringCellValue();
		
		System.out.println(name);

		if (name.equals("selenium automation testing")) {
			c.setCellValue("Automation Testing");
		}
		
		FileOutputStream o = new FileOutputStream(loca);
		
		w.write(o);
		
		System.out.println("completed");

	}

}
