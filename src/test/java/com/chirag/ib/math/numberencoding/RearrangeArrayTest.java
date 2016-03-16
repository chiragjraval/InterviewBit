package com.chirag.ib.math.numberencoding;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RearrangeArrayTest
{
	private RearrangeArray obj;
	
	@Before
	public void setUp()
	{
		obj = new RearrangeArray();
	}
	
	@Test
	public void rearrangeArrayCase1()
	{
		final int[] input = {1, 0};
		obj.rearrangeArray(input);
		Assert.assertTrue(Arrays.equals(input, new int[]{0, 1}));
	}
	
	@Test
	public void rearrangeArrayCase2()
	{
		final int[] input = {3, 2, 0, 1};
		obj.rearrangeArray(input);
		Assert.assertTrue(Arrays.equals(input, new int[]{1, 0, 3, 2}));
	}
	
	@Test
	public void rearrangeArrayCase3()
	{
		final int[] input = {4, 0, 2, 1, 3};
		obj.rearrangeArray(input);
		Assert.assertTrue(Arrays.equals(input, new int[]{3, 4, 2, 0, 1}));
	}
	
	@Test
	public void rearrangeArrayCase4()
	{
		final int[] input = {0, 1, 2, 3};
		obj.rearrangeArray(input);
		Assert.assertTrue(Arrays.equals(input, new int[]{0, 1, 2, 3}));
	}
	
	@Test
	public void rearrangeArrayCase5()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 0));
		obj.arrange(input);
		Assert.assertTrue(input.equals(new ArrayList<Integer>(Arrays.asList(0, 1))));
	}
	
	@Test
	public void rearrangeArrayCase6()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3, 2, 0, 1));
		obj.arrange(input);
		Assert.assertTrue(input.equals(new ArrayList<Integer>(Arrays.asList(1, 0, 3, 2))));
	}
	
	@Test
	public void rearrangeArrayCase7()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4, 0, 2, 1, 3));
		obj.arrange(input);
		Assert.assertTrue(input.equals(new ArrayList<Integer>(Arrays.asList(3, 4, 2, 0, 1))));
	}
	
	@Test
	public void rearrangeArrayCase8()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
		obj.arrange(input);
		Assert.assertTrue(input.equals(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3))));
	}
}
