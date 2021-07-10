package com.genrics.MavenFlightRadar24;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellLiberary implements AutoConstants
{
	public static String fetchExcelCellData(int row_index,int cell_index) throws IOException 
	{
		FileInputStream fis=new FileInputStream(excelSheet_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(excelSheet_name).getRow(row_index).getCell(cell_index).getStringCellValue();		
	}
}
