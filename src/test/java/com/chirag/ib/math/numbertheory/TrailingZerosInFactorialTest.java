package com.chirag.ib.math.numbertheory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrailingZerosInFactorialTest
{
	private TrailingZerosInFactorial obj;
	
	@Before
	public void setUp()
	{
		obj = new TrailingZerosInFactorial();
	}
	
	@Test
	public void getTrailingZeros5()
	{
		int trailingZeros = obj.getTrailingZeros(5);
		Assert.assertTrue(trailingZeros==1);
	}
	
	@Test
	public void getTrailingZeros9()
	{
		int trailingZeros = obj.getTrailingZeros(9);
		Assert.assertTrue(trailingZeros==1);
	}
	
	@Test
	public void getTrailingZeros10()
	{
		int trailingZeros = obj.getTrailingZeros(10);
		Assert.assertTrue(trailingZeros==2);
	}
	
	@Test
	public void getTrailingZeros15()
	{
		int trailingZeros = obj.getTrailingZeros(15);
		Assert.assertTrue(trailingZeros==3);
	}
	
	@Test
	public void getTrailingZeros26()
	{
		int trailingZeros = obj.getTrailingZeros(26);
		Assert.assertTrue(trailingZeros==6);
	}
	
	@Test
	public void getTrailingZeros9247()
	{
		int trailingZeros = obj.getTrailingZeros(9247);
		Assert.assertTrue(trailingZeros==2307);
	}
}
