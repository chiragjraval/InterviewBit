package com.chirag.ib.math.digitop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest
{
	private ReverseInteger obj;
	
	@Before
	public void setUp()
	{
		obj = new ReverseInteger();
	}
	
	@Test
	public void reverseInteger4()
	{
		int computedResult = obj.reverseInteger(4);
		Assert.assertTrue(computedResult==4);
	}
	
	@Test
	public void reverseInteger41()
	{
		int computedResult = obj.reverseInteger(41);
		Assert.assertTrue(computedResult==14);
	}
	
	@Test
	public void reverseInteger123()
	{
		int computedResult = obj.reverseInteger(123);
		Assert.assertTrue(computedResult==321);
	}
	@Test
	public void reverseIntegerMinus123()
	{
		int computedResult = obj.reverseInteger(-123);
		Assert.assertTrue(computedResult==-321);
	}
	
	@Test
	public void reverseInteger12321()
	{
		int computedResult = obj.reverseInteger(12321);
		Assert.assertTrue(computedResult==12321);
	}
	
	@Test
	public void reverseInteger123456789()
	{
		int computedResult = obj.reverseInteger(123456789);
		Assert.assertTrue(computedResult==987654321);
	}
	
	@Test
	public void reverseInteger2147483647()
	{
		int computedResult = obj.reverseInteger(2147483647);
		Assert.assertTrue(computedResult==0);
	}
	
}
