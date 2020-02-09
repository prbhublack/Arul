package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
		public static void main(String[] args) throws IOException {
			File loc = new File("C:\\Users\\prabhu\\eclipse-workspace\\ExcelTesting\\ExcelPath\\ss.xlsx");
		FileOutputStream stream = new FileOutputStream(loc);
		Workbook w = new HSSFWorkbook();
Sheet s = w.createSheet("NewSheet");
		Row cr = s.createRow(0);
	Cell cc = cr.createCell(3);
	cc.setCellValue("NewValue");
	System.out.println("Excel Updated Successfully");
		
		
	}

}
