package com.chirag.ib.math.numbertheory;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class GreatestCommonDivisorTest
{
	private GreatestCommonDivisor obj;
	
	@Before
    public void setUp()
	{
		obj = new GreatestCommonDivisor();
    }
	
	@Test
	public void gcdOf2And4()
	{
		int result = obj.gcd(2, 4);
		Assert.assertTrue(result==2);
	}
	
	@Test
	public void gcdOf3And7()
	{
		int result = obj.gcd(3, 7);
		Assert.assertTrue(result==1);
	}
	
	@Test
	public void gcdOf24And12()
	{
		int result = obj.gcd(24, 12);
		Assert.assertTrue(result==12);
	}
	
	@Test
	public void gcdOf61And35()
	{
		int result = obj.gcd(61, 35);
		Assert.assertTrue(result==1);
	}
}
