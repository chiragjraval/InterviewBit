package com.chirag.ib.string.parsing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidNumberTest
{
	private ValidNumber obj;
	
	@Before
	public void setUp()
	{
		obj = new ValidNumber();
	}
	
	@Test
	public void validNumberCase1()
	{
		Assert.assertTrue(obj.validNumber("1"));
	}
	
	@Test
	public void validNumberCase11()
	{
		Assert.assertTrue(obj.validNumber("-1"));
	}
	
	@Test
	public void validNumberCase2()
	{
		Assert.assertTrue(obj.validNumber("1.0"));
	}
	
	@Test
	public void validNumberCase21()
	{
		Assert.assertTrue(obj.validNumber("-1.0"));
	}
	
	@Test
	public void validNumberCase3()
	{
		Assert.assertTrue(!obj.validNumber("1."));
	}
	
	@Test
	public void validNumberCase4()
	{
		Assert.assertTrue(!obj.validNumber("1.0e1.1"));
	}
	
	@Test
	public void validNumberCase41()
	{
		Assert.assertTrue(!obj.validNumber("1.0e1.1"));
	}
	
	@Test
	public void validNumberCase42()
	{
		Assert.assertTrue(!obj.validNumber("1.0e1."));
	}
	
	@Test
	public void validNumberCase43()
	{
		Assert.assertTrue(obj.validNumber("-1.0e1"));
	}
	
	@Test
	public void validNumberCase44()
	{
		Assert.assertTrue(obj.validNumber("-1.0e-1"));
	}
	
	@Test
	public void validNumberCase45()
	{
		Assert.assertTrue(obj.validNumber("2e10"));
	}
	
	@Test
	public void validNumberCase5()
	{
		Assert.assertTrue(!obj.validNumber("1..0"));
	}
	
	@Test
	public void validNumberCase6()
	{
		Assert.assertTrue(!obj.validNumber("43232412#312312"));
	}
}
