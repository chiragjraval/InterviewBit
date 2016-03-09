package com.chirag.ib.math.adhoc;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeSumTest
{
	private PrimeSum obj;
	
	@Before
	public void setUp()
	{
		obj = new PrimeSum();
	}
	
	@Test
	public void getPrimeSumPair4()
	{
		ArrayList<Integer> computedResult = obj.getPrimeSumPair(4);
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 2));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
	
	@Test
	public void getPrimeSumPair10()
	{
		ArrayList<Integer> computedResult = obj.getPrimeSumPair(10);
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(3, 7));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
	
	@Test
	public void getPrimeSumPair100()
	{
		ArrayList<Integer> computedResult = obj.getPrimeSumPair(100);
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(3, 97));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
	
	@Test
	public void getPrimeSumPair121()
	{
		ArrayList<Integer> computedResult = obj.getPrimeSumPair(121);
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
}
