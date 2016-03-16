package com.chirag.ib.math.numbertheory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedPermutationRankWithRepeatsTest
{
	private SortedPermutationRankWithRepeats obj;
		
	@Before
	public void setUp()
	{
		obj = new SortedPermutationRankWithRepeats();
	}
	
	@Test
	public void sortedPermutationRankWithRepeatsabc()
	{
		int rank = obj.findRank("acb");
		Assert.assertTrue(rank==2);
	}
	
	@Test
	public void sortedPermutationRankWithRepeatsbaa()
	{
		int rank = obj.findRank("baa");
		Assert.assertTrue(rank==3);
	}
	
	@Test
	public void sortedPermutationRankWithRepeatscbaba()
	{
		int rank = obj.findRank("cbaba");
		Assert.assertTrue(rank==17);
	}
}
