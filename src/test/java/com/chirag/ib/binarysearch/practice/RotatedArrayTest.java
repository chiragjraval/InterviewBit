package com.chirag.ib.binarysearch.practice;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotatedArrayTest
{
	private RotatedArray obj;
	
	@Before
	public void setUp()
	{
		obj = new RotatedArray(); 
	}
	
	@Test
	public void findMinCase10()
	{
		Assert.assertTrue(obj.findMin(new ArrayList<Integer>())==-1);
	}
	
	@Test
	public void findMinCase20()
	{
		Assert.assertTrue(obj.findMin(new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 0, 1, 2)))==0);
	}
	
	@Test
	public void findMinCase21()
	{
		Assert.assertTrue(obj.findMin(new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8, 1, 2)))==1);
	}
	
	@Test
	public void findMinCase22()
	{
		Assert.assertTrue(obj.findMin(new ArrayList<Integer>(Arrays.asList(6, 7, 1, 2, 3, 4, 5)))==1);
	}
}
