package com.ExportData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exportdata {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./src/com/ExportData/Export.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file); 
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.createRow(3);	
		Cell cell=row.createCell(4);
		cell.setCellValue("Automation Testing");
		cell.setCellValue("Performance Testing");
		FileOutputStream file1=new FileOutputStream("./src/com/ExportData/Export.xlsx");
		workbook.write(file1);

		       
			
		
	}

}
