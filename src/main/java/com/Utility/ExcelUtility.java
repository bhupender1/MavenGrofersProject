package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtility {
	public static XSSFWorkbook Excelbook;
	private static XSSFSheet Excelsheet;
	private static XSSFCell cell;
	private static XSSFRow Row;
	public static void setExcel(String path,String sheetname) throws IOException
	{
		File src=new File(path);
		FileInputStream fio=new FileInputStream(src);
		Excelbook =new XSSFWorkbook(fio);
		Excelsheet=Excelbook.getSheet(sheetname);
		
		
	}
	public static String getCellData(int row, int col)
	{
		cell=Excelsheet.getRow(row).getCell(col);
		String celldata=cell.getStringCellValue();
		return celldata;
	}
	public static void setCellData(String path,String Result,String sheet,int RowNum, int ColNum) throws Exception	{
		 
			try{
File file=new File(path);
FileInputStream fio=new FileInputStream(file);
Excelbook=new XSSFWorkbook(fio);
Excelsheet=Excelbook.getSheet(sheet);
  			Row  = Excelsheet.createRow(RowNum);

			cell = Row.createCell(RowNum);

			cell.setCellValue(cell.CELL_TYPE_STRING);
			cell.setCellValue(Result);
			
  				FileOutputStream fileOut = new FileOutputStream(path);

  				Excelbook.write(fileOut);

  				}catch(Exception e){

					throw (e);

			}

		}
	
	

}
