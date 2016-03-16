package com.chirag.ib.math.numbertheory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedPermutationRankTest
{
	private SortedPermutationRank obj;
	
	@Before
	public void setUp()
	{
		obj = new SortedPermutationRank();
	}
	
	@Test
	public void sortedPermutationRankabc()
	{
		int rank = obj.findRank("acb");
		Assert.assertTrue(rank==2);
	}
	
	@Test
	public void sortedPermutationRank3421()
	{
		int rank = obj.findRank("3421");
		Assert.assertTrue(rank==18);
	}
	
	@Test
	public void sortedPermutationRankVIEW()
	{
		int rank = obj.findRank("VIEW");
		Assert.assertTrue(rank==15);
	}
	
	@Test
	public void sortedPermutationRankaba()
	{
		int rank = obj.findRank("aba");
		Assert.assertTrue(rank==2);
	}
	
	@Test
	public void sortedPermutationRankbaa()
	{
		int rank = obj.findRank("baa");
		Assert.assertTrue(rank==3);
	}
}
