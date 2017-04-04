package com.chirag.ib.string.prettyprint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZigzagStringTest
{
	private ZigzagString obj;
	
	@Before
	public void setUp()
	{
		obj = new ZigzagString();
	}
	
	@Test
	public void zigzagStringCase1()
	{
		Assert.assertTrue("PAHNAPLSIIGYIR".equals(obj.zigzagString("PAYPALISHIRING", 3)));
	}
	
	@Test
	public void zigzagStringCase2()
	{
		Assert.assertTrue("PINALSIGYAHRPI".equals(obj.zigzagString("PAYPALISHIRING", 4)));
	}
}
