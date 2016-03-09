package com.chirag.ib.math.baseconversion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcelColumnNumberTest
{
	private ExcelColumnNumber obj;
	
	@Before
	public void setUp()
	{
		obj = new ExcelColumnNumber();
	}
	
	@Test
	public void excelColumnNumberA()
	{
		int res = obj.getExcelColumnNumber("A");
		Assert.assertTrue(res==1);
	}
	
	@Test
	public void excelColumnNumberZ()
	{
		int res = obj.getExcelColumnNumber("Z");
		Assert.assertTrue(res==26);
	}
	
	@Test
	public void excelColumnNumberAD()
	{
		int res = obj.getExcelColumnNumber("AD");
		Assert.assertTrue(res==30);
	}
	
	@Test
	public void excelColumnNumberAAA()
	{
		int res = obj.getExcelColumnNumber("AAA");
		Assert.assertTrue(res==703);
	}
	
	@Test
	public void excelColumnNumberAY()
	{
		int res = obj.getExcelColumnNumber("AY");
		Assert.assertTrue(res==51);
	}
	
	@Test
	public void excelColumnNumberAZ()
	{
		int res = obj.getExcelColumnNumber("AZ");
		Assert.assertTrue(res==52);
	}
	
	@Test
	public void excelColumnNumberCB()
	{
		int res = obj.getExcelColumnNumber("CB");
		Assert.assertTrue(res==80);
	}
	
	@Test
	public void excelColumnNumberYZ()
	{
		int res = obj.getExcelColumnNumber("YZ");
		Assert.assertTrue(res==676);
	}
	
	@Test
	public void excelColumnNumberZZ()
	{
		int res = obj.getExcelColumnNumber("ZZ");
		Assert.assertTrue(res==702);
	}
	
	@Test
	public void excelColumnNumberAAC()
	{
		int res = obj.getExcelColumnNumber("AAC");
		Assert.assertTrue(res==705);
	}
}
