package com.chirag.ib.string.parsing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompareVersionNumbersTest
{
	private CompareVersionNumbers obj;
	
	@Before
	public void setUp()
	{
		obj = new CompareVersionNumbers();
	}
	
	@Test
	public void compareVersionNumbersCase1()
	{
		Assert.assertTrue(obj.compareVersionNumbers("0.1", "1.0")==-1);
	}
	
	@Test
	public void compareVersionNumbersCase2()
	{
		Assert.assertTrue(obj.compareVersionNumbers("0.1", "0.1")==0);
	}
	
	@Test
	public void compareVersionNumbersCase3()
	{
		Assert.assertTrue(obj.compareVersionNumbers("0.1", "0.1.2")==-1);
	}
	
	@Test
	public void compareVersionNumbersCase4()
	{
		Assert.assertTrue(obj.compareVersionNumbers("1", "0.1.2")==1);
	}
	
	@Test
	public void compareVersionNumbersCase5()
	{
		Assert.assertTrue(obj.compareVersionNumbers("1", "1.0")==0);
	}
	
	@Test
	public void compareVersionNumbersCase6()
	{
		Assert.assertTrue(obj.compareVersionNumbers("2.0", "2")==0);
	}
	
	@Test
	public void compareVersionNumbersCase7()
	{
		Assert.assertTrue(obj.compareVersionNumbers("4444371174137455", "5.168")==1);
	}
	
	@Test
	public void compareVersionNumbersCase8()
	{
		Assert.assertTrue(obj.compareVersionNumbers("444444444444444444444444", "4444444444444444444444444")==-1);
	}
}
