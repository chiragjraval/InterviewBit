package com.chirag.ib.bits.play;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DifferentBitsSumPairwiseTest
{
	private DifferentBitsSumPairwise obj;
	
	@Before
	public void setUp()
	{
		obj = new DifferentBitsSumPairwise();
	}
	
	@Test
	public void diffBitsSumPairwiseCase1()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 3, 5));
		Assert.assertTrue(obj.diffBitsSumPairwise(input)==8);
	}
	
	@Test
	public void diffBitsSumPairwiseCase2()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 6));
		Assert.assertTrue(obj.diffBitsSumPairwise(input)==8);
	}
	
	@Test
	public void diffBitsSumPairwiseCase3()
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6));
		Assert.assertTrue(obj.diffBitsSumPairwise(input)==24);
	}
}
