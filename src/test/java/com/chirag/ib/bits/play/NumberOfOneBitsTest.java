package com.chirag.ib.bits.play;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfOneBitsTest
{
	private NumberOfOneBits obj;
	
	@Before
	public void setUp()
	{
		obj = new NumberOfOneBits();
	}
	
	@Test
	public void numberOfOneBitsCase0()
	{
		Assert.assertTrue(obj.numberOfOneBits(0)==0);
	}
	
	@Test
	public void numberOfOneBitsCase1()
	{
		Assert.assertTrue(obj.numberOfOneBits(1)==1);
	}
	
	@Test
	public void numberOfOneBitsCase2()
	{
		Assert.assertTrue(obj.numberOfOneBits(2)==1);
	}
	
	@Test
	public void numberOfOneBitsCase3()
	{
		Assert.assertTrue(obj.numberOfOneBits(3)==2);
	}
	
	@Test
	public void numberOfOneBitsCase4()
	{
		Assert.assertTrue(obj.numberOfOneBits(4)==1);
	}
	
	@Test
	public void numberOfOneBitsCase7()
	{
		Assert.assertTrue(obj.numberOfOneBits(7)==3);
	}
	
	@Test
	public void numberOfOneBitsCase32()
	{
		Assert.assertTrue(obj.numberOfOneBits(32)==1);
	}
}
