package com.chirag.ib.string.simulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeStringTest
{
	private PalindromeString obj;
	
	@Before
	public void setUp()
	{
		obj = new PalindromeString();
	}
	
	@Test
	public void isPalindromeCase1()
	{
		Assert.assertTrue(obj.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	public void isPalindromeCase2()
	{
		Assert.assertTrue(!obj.isPalindrome("race a car"));
	}
}
