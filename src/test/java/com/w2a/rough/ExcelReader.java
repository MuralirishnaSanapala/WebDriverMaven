package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static XSSFRow row;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("login_data");
		System.out.println(ws.getRow(0).getCell(0).getStringCellValue());
		System.out.println(ws.getRow(0).getCell(1).getStringCellValue());
		System.out.println(ws.getRow(1).getCell(0).getStringCellValue());
		System.out.println(ws.getRow(1).getCell(1).getStringCellValue());
		//int rc = ws.getLastRowNum();
	
		/*XSSFCell cell1, cell2;
		String uid, pwd;
		for (int i = 1; i <=rc; i++) {
			cell1 = row.getCell(0);
			cell2= row.getCell(1);
			uid= cell1.getStringCellValue();
			pwd=cell2.getStringCellValue();
			System.out.println(uid+"_"+pwd);
		}	*/

	}

}
