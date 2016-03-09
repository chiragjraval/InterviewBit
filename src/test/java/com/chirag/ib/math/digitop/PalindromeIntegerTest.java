package com.chirag.ib.math.digitop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeIntegerTest
{
	private PalindromeInteger obj;
	
	@Before
	public void setUp()
	{
		obj = new PalindromeInteger();
	}
	
	@Test
	public void isPalindromeInteger4()
	{
		boolean computedResult = obj.isPalindromeInteger(4);
		Assert.assertTrue(computedResult);
	}
	
	@Test
	public void isPalindromeInteger12()
	{
		boolean computedResult = obj.isPalindromeInteger(12);
		Assert.assertTrue(!computedResult);
	}
	
	@Test
	public void isPalindromeInteger121()
	{
		boolean computedResult = obj.isPalindromeInteger(121);
		Assert.assertTrue(computedResult);
	}
	
	@Test
	public void isPalindromeInteger91()
	{
		boolean computedResult = obj.isPalindromeInteger(91);
		Assert.assertTrue(!computedResult);
	}
	
	@Test
	public void isPalindromeInteger987656789()
	{
		boolean computedResult = obj.isPalindromeInteger(987656789);
		Assert.assertTrue(computedResult);
	}
}
