package com.chirag.ib.math.baseconversion;

public class ExcelColumnNumber
{
	public int getExcelColumnNumber(String columnName)
	{
		if(columnName==null || columnName.isEmpty())
			return -1;
		
		int excelColNumber = 0;
		int colNameLength = columnName.length();
		for(int i=0, j=colNameLength-1; i<colNameLength; i++, j--)
		{
			int curColNum = columnName.charAt(i)-64;
			excelColNumber += curColNum * Math.pow(26, j);
		}
		
		return excelColNumber;
	}
}
