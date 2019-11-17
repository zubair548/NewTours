package com.SingleTestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Single_TestData {

	public static void main(String[] args) throws IOException  {
		FileInputStream file=new FileInputStream("./src/com/SingleTestData/userdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file); 
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(data);
			String data1=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.print("  " +data1);
			  System.out.println();
			  System.out.println("");
		}
		 
		
	}
}


	