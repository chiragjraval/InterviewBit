package com.chirag.ib.binarysearch.function;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chirag.ib.binarysearch.function.Sqrt;

public class SqrtTest
{
	private Sqrt obj;
	
	@Before
	public void setUp()
	{
		obj = new Sqrt();
	}
	
	@Test
	public void sqrtCase0()
	{
		Assert.assertTrue(obj.sqrt(0)==0);
	}
	
	@Test
	public void sqrtCase1()
	{
		Assert.assertTrue(obj.sqrt(1)==1);
	}
	
	@Test
	public void sqrtCase4()
	{
		Assert.assertTrue(obj.sqrt(4)==2);
	}
	
	@Test
	public void sqrtCase11()
	{
		Assert.assertTrue(obj.sqrt(11)==3);
	}
	
	@Test
	public void sqrtCase229()
	{
		Assert.assertTrue(obj.sqrt(229)==15);
	}
	
	@Test
	public void sqrtCase2147483647()
	{
		Assert.assertTrue(obj.sqrt(2147483647)==46340);
	}
	
	
}
