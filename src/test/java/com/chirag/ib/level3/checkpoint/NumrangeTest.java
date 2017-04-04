package com.chirag.ib.level3.checkpoint;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chirag.ib.level3.checkpoint.Numrange;

public class NumrangeTest
{
	private Numrange obj;
	
	@Before
	public void setUp()
	{
		obj = new Numrange();
	}
	
	@Test
	public void numRangeCase10()
	{
		Assert.assertTrue(obj.numRange(null, 5, 8)==0);
	}
	
	@Test
	public void numRangeCase11()
	{
		Assert.assertTrue(obj.numRange(new ArrayList<Integer>(), 5, 8)==0);
	}
	
	@Test
	public void numRangeCase20()
	{
		Assert.assertTrue(obj.numRange(new ArrayList<Integer>(Arrays.asList(10, 5, 1, 0, 2)), 6, 8)==3);
	}
	
	@Test
	public void numRangeCase21()
	{
		Assert.assertTrue(obj.numRange(new ArrayList<Integer>(Arrays.asList(10, 5, 1, 3, 2, 2)), 6, 9)==5);
	}
	
	@Test
	public void numRangeCase30()
	{
		Assert.assertTrue(obj.numRange(new ArrayList<Integer>(Arrays.asList(80, 97, 78, 45, 23, 38, 38, 93, 83, 16, 91, 69, 18, 82, 60, 50, 61, 70, 15, 6, 52, 90)), 99, 269)==58);
	}
}
