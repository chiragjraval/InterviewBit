package com.chirag.ib.bits.array;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest
{
	private SingleNumber obj;
	
	@Before
	public void setUp()
	{
		obj = new SingleNumber();
	}
	
	@Test
	public void singleNumberCase1()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 1));
		Assert.assertTrue(obj.singleNumber(input).equals(3));
	}
	
	@Test
	public void singleNumberCase2()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 1));
		Assert.assertTrue(obj.singleNumber(input).equals(2));
	}
	
	@Test
	public void singleNumberCase3()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 2));
		Assert.assertTrue(obj.singleNumber(input).equals(1));
	}
}
