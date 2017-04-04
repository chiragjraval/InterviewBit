package com.chirag.ib.string.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImplementStrstrTest
{
	private ImplementStrstr obj;
	
	@Before
	public void setUp()
	{
		obj = new ImplementStrstr();
	}
	
	@Test
	public void strstrCase10()
	{
		Assert.assertTrue(obj.strStr("abc", null)==-1);
	}
	
	@Test
	public void strstrCase11()
	{
		Assert.assertTrue(obj.strStr(null, "abc")==-1);
	}
	
	@Test
	public void strstrCase12()
	{
		Assert.assertTrue(obj.strStr(null, null)==-1);
	}
	
	@Test
	public void strstrCase13()
	{
		Assert.assertTrue(obj.strStr("", "")==-1);
	}
	
	@Test
	public void strstrCase14()
	{
		Assert.assertTrue(obj.strStr("abc", "")==-1);
	}
	
	@Test
	public void strstrCase15()
	{
		Assert.assertTrue(obj.strStr("", "abc")==-1);
	}
	
	@Test
	public void strstrCase16()
	{
		Assert.assertTrue(obj.strStr("ab", "abc")==-1);
	}
	
	@Test
	public void strstrCase20()
	{
		Assert.assertTrue(obj.strStr("abc", "ab")==0);
	}
	
	@Test
	public void strstrCase21()
	{
		Assert.assertTrue(obj.strStr("cdsabc", "ab")==3);
	}
	
	@Test
	public void strstrCase22()
	{
		Assert.assertTrue(obj.strStr("cccab", "ab")==3);
	}
	
	@Test
	public void strstrCase23()
	{
		Assert.assertTrue(obj.strStr("cccab", "abc")==-1);
	}
	
	@Test
	public void strstrCase24()
	{
		Assert.assertTrue(obj.strStr("ab", "ab")==0);
	}
}
