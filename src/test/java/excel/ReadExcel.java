package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\prabhu\\eclipse-workspace\\ExcelTesting\\ExcelPath\\excel.xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("excel");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String da = c.getStringCellValue();
		System.out.println(c);

	}

}
