package com.chirag.ib.math.combinatorics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GridUniquePathsTest
{
	private GridUniquePaths obj;
	
	@Before
	public void setUp()
	{
		obj = new GridUniquePaths();
	}
	
	@Test
	public void gridUniquePathsA2B2()
	{
		int uniquePaths = obj.uniquePaths(2, 2);
		Assert.assertTrue(uniquePaths==2);
	}
	
	@Test
	public void gridUniquePathsA3B3()
	{
		int uniquePaths = obj.uniquePaths(3, 3);
		Assert.assertTrue(uniquePaths==6);
	}
	
	@Test
	public void gridUniquePathsA4B4()
	{
		int uniquePaths = obj.uniquePaths(4, 4);
		Assert.assertTrue(uniquePaths==20);
	}
	
	@Test
	public void gridUniquePathsA2B3()
	{
		int uniquePaths = obj.uniquePaths(2, 3);
		Assert.assertTrue(uniquePaths==3);
	}
	
	@Test
	public void gridUniquePathsA1B3()
	{
		int uniquePaths = obj.uniquePaths(1, 3);
		Assert.assertTrue(uniquePaths==1);
	}
}
