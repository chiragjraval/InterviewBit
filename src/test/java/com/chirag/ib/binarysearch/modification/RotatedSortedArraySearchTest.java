package com.chirag.ib.binarysearch.modification;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotatedSortedArraySearchTest
{
	private RotatedSortedArraySearch obj;
	
	@Before
	public void setUp()
	{
		obj = new RotatedSortedArraySearch();
	}
	
	@Test
	public void pivotedBinarySearchCase10()
	{
		Assert.assertTrue(obj.search(Arrays.asList(5, 6, 7, 8, 9, 10, 1, 2, 3), 3)==8);
	}
	
	@Test
	public void pivotedBinarySearchCase11()
	{
		Assert.assertTrue(obj.search(Arrays.asList(5, 6, 7, 8, 9, 10, 1, 2, 3), 10)==5);
	}
	
	@Test
	public void pivotedBinarySearchCase12()
	{
		Assert.assertTrue(obj.search(Arrays.asList(4, 5, 6, 7, 0, 1, 2), 4)==0);
	}
}
