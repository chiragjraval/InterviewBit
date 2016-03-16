package com.chirag.ib.bits.array;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTwoTest
{
	private SingleNumberTwo obj;
	
	@Before
	public void setUp()
	{
		obj = new SingleNumberTwo();
	}
	
	@Test
	public void singleNumberTwoCase1()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3, 3, 2, 3));
		Assert.assertTrue(obj.singleNumberTwo(input)==2);
	}
	
	@Test
	public void singleNumberTwoCase2()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 4, 3, 2, 2, 4, 1, 1));
		Assert.assertTrue(obj.singleNumberTwo(input)==3);
	}
	
	@Test
	public void singleNumberTwoCase3()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1));
		Assert.assertTrue(obj.singleNumberTwo(input)==4);
	}
}
