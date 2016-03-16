package com.chirag.ib.string.simulation;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest
{
	private LongestCommonPrefix obj;
	
	@Before
	public void setUp()
	{
		obj = new LongestCommonPrefix();
	}
	
	@Test
	public void longestCommonPrefixCase1()
	{
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("abcdefgh", "abcefgh"));
		Assert.assertTrue("abc".equals(obj.longestCommonPrefix(input)));
	}
	
	@Test
	public void longestCommonPrefixCase2()
	{
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("abcdefgh", "abcefgh", "aefghijk"));
		Assert.assertTrue("a".equals(obj.longestCommonPrefix(input)));
	}
}
