package com.chirag.ib.math.baseconversion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcelColumnTitleTest
{
	private ExcelColumnTitle obj;
	
	@Before
	public void setUp()
	{
		obj = new ExcelColumnTitle();
	}
	
	@Test
	public void getExcelColumnTitle1()
	{
		String res = obj.getExcelColumnName(1);
		Assert.assertTrue("A".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle26()
	{
		String res = obj.getExcelColumnName(26);
		Assert.assertTrue("Z".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle30()
	{
		String res = obj.getExcelColumnName(30);
		Assert.assertTrue("AD".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle703()
	{
		String res = obj.getExcelColumnName(703);
		Assert.assertTrue("AAA".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle51()
	{
		String res = obj.getExcelColumnName(51);
		Assert.assertTrue("AY".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle52()
	{
		String res = obj.getExcelColumnName(52);
		Assert.assertTrue("AZ".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle80()
	{
		String res = obj.getExcelColumnName(80);
		Assert.assertTrue("CB".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle676()
	{
		String res = obj.getExcelColumnName(676);
		Assert.assertTrue("YZ".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle702()
	{
		String res = obj.getExcelColumnName(702);
		Assert.assertTrue("ZZ".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle705()
	{
		String res = obj.getExcelColumnName(705);
		Assert.assertTrue("AAC".equals(res));
	}
	
	@Test
	public void getExcelColumnTitle943566()
	{
		String res = obj.getExcelColumnName(943566);
		Assert.assertTrue("BAQTZ".equals(res));
	}
	
}
