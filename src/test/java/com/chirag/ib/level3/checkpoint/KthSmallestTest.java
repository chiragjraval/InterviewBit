package com.chirag.ib.level3.checkpoint;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthSmallestTest
{
	private KthSmallest obj;
	
	@Before
	public void setUp()
	{
		obj = new KthSmallest();
	}
	
	@Test
	public void kthsmallestCase10()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3, 2));
		Assert.assertTrue(obj.kthsmallest(input, 3)==2);
	}
	
	@Test
	public void kthsmallestCase11()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 1, 4, 3, 3));
		Assert.assertTrue(obj.kthsmallest(input, 5)==5);
	}
}
