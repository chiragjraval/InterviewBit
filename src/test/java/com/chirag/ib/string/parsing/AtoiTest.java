package com.chirag.ib.string.parsing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtoiTest
{
	private Atoi obj;
	
	@Before
	public void setUp()
	{
		obj = new Atoi();
	}
	
	@Test
	public void atoiCase10()
	{
		Assert.assertTrue(obj.atoi("1")==1);
	}
	
	@Test
	public void atoiCase11()
	{
		Assert.assertTrue(obj.atoi(" -1  a ")==-1);
	}
	
	@Test
	public void atoiCase12()
	{
		Assert.assertTrue(obj.atoi(" -1.6  a ")==-1);
	}
	
	@Test
	public void atoiCase13()
	{
		Assert.assertTrue(obj.atoi(" 9 2704 ")==9);
	}
	
	@Test
	public void atoiCase14()
	{
		Assert.assertTrue(obj.atoi(" +1  a ")==1);
	}
	
	@Test
	public void atoiCase20()
	{
		Assert.assertTrue(obj.atoi(" -abc ")==0);
	}
	
	@Test
	public void atoiCase21()
	{
		Assert.assertTrue(obj.atoi(" -a 9 bc ")==0);
	}
	
	@Test
	public void atoiCase22()
	{
		Assert.assertTrue(obj.atoi(" #-a 9 -")==0);
	}
	
	@Test
	public void atoiCase23()
	{
		Assert.assertTrue(obj.atoi(" +abc ")==0);
	}
	
	@Test
	public void atoiCase30()
	{
		Assert.assertTrue(obj.atoi("123456789012")==Integer.MAX_VALUE);
	}
	
	@Test
	public void atoiCase31()
	{
		Assert.assertTrue(obj.atoi("-123456789012")==Integer.MIN_VALUE);
	}
	
	@Test
	public void atoiCase32()
	{
		Assert.assertTrue(obj.atoi("-a 123456789012")==0);
	}
	
	@Test
	public void atoiCase33()
	{
		Assert.assertTrue(obj.atoi("  -123456789012 abc")==Integer.MIN_VALUE);
	}
	
	@Test
	public void atoiCase34()
	{
		Assert.assertTrue(obj.atoi("  - 123456789012 abc")==0);
	}
	
	@Test
	public void atoiCase35()
	{
		Assert.assertTrue(obj.atoi("  +123456789012 abc")==Integer.MAX_VALUE);
	}
}
