package com.chirag.ib.string.simulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountAndSayTest
{
	private CountAndSay obj;
	
	@Before
	public void setUp()
	{
		obj = new CountAndSay();
	}
	
	@Test
	public void countAndSayCase1()
	{
		Assert.assertTrue("1".equals(obj.countAndSay(1)));
	}
	
	@Test
	public void countAndSayCase2()
	{
		Assert.assertTrue("11".equals(obj.countAndSay(2)));
	}
	
	@Test
	public void countAndSayCase3()
	{
		Assert.assertTrue("21".equals(obj.countAndSay(3)));
	}
	
	@Test
	public void countAndSayCase4()
	{
		Assert.assertTrue("1211".equals(obj.countAndSay(4)));
	}
	
	@Test
	public void countAndSayCase5()
	{
		Assert.assertTrue("111221".equals(obj.countAndSay(5)));
	}
	
	@Test
	public void countAndSayCase6()
	{
		Assert.assertTrue("312211".equals(obj.countAndSay(6)));
	}
}
