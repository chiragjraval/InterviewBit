package com.chirag.ib.string.words;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseTheStringTest
{
	private ReverseTheString obj;
	
	@Before
	public void setUp()
	{
		obj = new ReverseTheString();
	}
	
	@Test
	public void countAndSayCase1()
	{
		Assert.assertTrue("add things other of lots and words String Testing".equals(obj.reverseWords("Testing String words and lots of other things add")));
	}
	
	@Test
	public void countAndSayCase2()
	{
		Assert.assertTrue("blue is sky the".equals(obj.reverseWords("the sky is blue")));
	}
}
