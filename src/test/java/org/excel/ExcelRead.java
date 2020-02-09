package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\prabhu\\eclipse-workspace\\ExcelTesting\\ExcelPath\\Test_Case_Template-Prabhu.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sample Test Case Document");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		System.out.println(c);
	}

}
