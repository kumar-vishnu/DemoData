package org.class1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File("D:\\softwares\\selenium\\selenium project\\NewProject\\Excel\\Worksheet.xlsx");
		
		FileInputStream stream = new FileInputStream(loc);
		
		Workbook W = new XSSFWorkbook(stream);
		
		Sheet s = W.getSheet("Data");
	
//	to print particular cells
//		Row r = s.getRow(3);
//		Cell c = r.getCell(0);
//		System.out.println(c);
//		To find no of the Cells and rows
//		int row = s.getPhysicalNumberOfRows();
//		System.out.println(row);
//		Row r = s.getRow(2);	
//		int cell = r.getPhysicalNumberOfCells();
//		System.out.println(cell);
//		
//		Cell c = r.getCell(1);
//		System.out.println(c);
		
//		to iterate cells and rows
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				int cellType = c.getCellType();
				
				if(cellType==1) {
					String Value = c.getStringCellValue();
					System.out.println(Value);
				}else
				{
				double numeric = c.getNumericCellValue();
				long l =(long) numeric;
				System.out.println(l);			
				}
				
			}
			
			
		}
		
		
		
	}
	

}
