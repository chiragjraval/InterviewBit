package com.chirag.ib.binarysearch.practice;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountElementsTest
{
	private CountElements obj;
	
	@Before
	public void setUp()
	{
		obj = new CountElements();
	}
	
	@Test
	public void findCountCase10()
	{
		Assert.assertTrue(obj.findCount(new ArrayList<Integer>(), 3)==0);
	}
	
	@Test
	public void findCountCase11()
	{
		Assert.assertTrue(obj.findCount(new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5)), 3)==0);
	}
	
	@Test
	public void findCountCase20()
	{
		Assert.assertTrue(obj.findCount(new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10)), 7)==2);
	}
	
	@Test
	public void findCountCase21()
	{
		Assert.assertTrue(obj.findCount(new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10)), 8)==2);
	}
}
