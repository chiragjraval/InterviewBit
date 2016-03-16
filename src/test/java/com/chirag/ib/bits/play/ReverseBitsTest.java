package com.chirag.ib.bits.play;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseBitsTest
{
	private ReverseBits obj;
	
	@Before
	public void setUp()
	{
		obj = new ReverseBits();
	}
	
	@Test
	public void reverseBits0()
	{
		Assert.assertTrue(obj.reverse(new Long(0))==(Long.parseLong("0")));
	}
	
	@Test
	public void reverseBits1()
	{
		Assert.assertTrue(obj.reverse(new Long(1))==(Long.parseLong("2147483648")));
	}
	
	@Test
	public void reverseBits2()
	{
		Assert.assertTrue(obj.reverse(new Long(2))==(Long.parseLong("1073741824")));
	}
	
	@Test
	public void reverseBits3()
	{
		Assert.assertTrue(obj.reverse(new Long(3))==(Long.parseLong("3221225472")));
	}
	
	@Test
	public void reverseBits10()
	{
		Assert.assertTrue(obj.reverse(new Long(10))==(Long.parseLong("1342177280")));
	}
}
