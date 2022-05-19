package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\DELL\\eclipse-workspace\\sujith\\Selenium_Learning\\Excel\\Test Data.xlsx");

		FileInputStream f = new FileInputStream(loc);

		Workbook book = new XSSFWorkbook(f);

		Sheet s = book.getSheet("Sheet1");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				System.out.print(c + " ");

				int cellType = c.getCellType();
				System.out.println("Cell type " + cellType);

			}

		}

//		Row r = s.getRow(1);
//
//		Cell c = r.getCell(2);
//
//		System.out.println(c);
//
//		System.out.println(s.getLastRowNum());
//		
//		System.out.println(r.getLastCellNum());

	}

}
