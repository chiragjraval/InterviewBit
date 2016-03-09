package com.chirag.ib.math.baseconversion;

public class ExcelColumnTitle
{
	public String getExcelColumnName(int columnNum)
	{
		if(columnNum<1)
			return "";
		
		StringBuilder excelColNameBuilder = new StringBuilder();
		while(columnNum!=0)
		{
			int curColNum = columnNum%26;
			if(curColNum!=0)
			{
				columnNum = columnNum/26;
				excelColNameBuilder.append((char)(curColNum+64));
			}
			else
			{
				columnNum = columnNum/26 - 1;
				excelColNameBuilder.append('Z');		
			}
		}
		
		return excelColNameBuilder.reverse().toString();
	}
}
