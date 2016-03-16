package com.chirag.ib.string.words;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthOfLastWordTest
{
	private LengthOfLastWord obj;
	
	@Before
	public void setUp()
	{
		obj = new LengthOfLastWord();
	}
	
	@Test
	public void lengthOfLastWordCaseEmpty()
	{
		Assert.assertTrue(obj.lengthOfLastWord("")==-1);
	}
	
	@Test
	public void lengthOfLastWordCaseWhitespaces()
	{
		Assert.assertTrue(obj.lengthOfLastWord("   ")==0);
	}
	
	@Test
	public void lengthOfLastWordCase1()
	{
		Assert.assertTrue(obj.lengthOfLastWord("Hello")==5);
	}
	
	@Test
	public void lengthOfLastWordCase2()
	{
		Assert.assertTrue(obj.lengthOfLastWord("Hello World1")==6);
	}
	
	@Test
	public void lengthOfLastWordCase3()
	{
		Assert.assertTrue(obj.lengthOfLastWord("Hello World1   ")==6);
	}
}
