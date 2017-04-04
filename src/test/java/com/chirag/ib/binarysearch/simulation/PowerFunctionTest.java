package com.chirag.ib.binarysearch.simulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerFunctionTest
{
	private PowerFunction obj;
	
	@Before
	public void setUp()
	{
		obj = new PowerFunction();
	}
	
	@Test
	public void powCase10()
	{
		Assert.assertTrue(obj.pow(4, 3, 3)==1);
	}
	
	@Test
	public void powCase11()
	{
		Assert.assertTrue(obj.pow(-4, 3, 3)==2);
	}
	
	@Test
	public void powCase12()
	{
		Assert.assertTrue(obj.pow(-5, 3, 3)==1);
	}
	
	
	@Test
	public void powCase20()
	{
		Assert.assertTrue(obj.pow(71045970, 41535484, 64735492)==20805472);
	}
}
