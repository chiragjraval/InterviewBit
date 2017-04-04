package com.chirag.ib.string.parsing;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidIpAddressesTest
{
	private ValidIpAddresses obj;
	
	@Before
	public void setUp()
	{
		obj = new ValidIpAddresses();
	}
	
	@Test
	public void isValidIpAddressCase1()
	{
		Assert.assertTrue(obj.isValidIpAddress("0.0.0.0")==1);
	}
	
	@Test
	public void isValidIpAddressCase11()
	{
		Assert.assertTrue(obj.isValidIpAddress("0.0.0.")==0);
	}
	
	@Test
	public void isValidIpAddressCase12()
	{
		Assert.assertTrue(obj.isValidIpAddress("0.0.0.-1")==0);
	}
	
	@Test
	public void isValidIpAddressCase13()
	{
		Assert.assertTrue(obj.isValidIpAddress("0.0..0.1")==0);
	}
	
	@Test
	public void isValidIpAddressCase14()
	{
		Assert.assertTrue(obj.isValidIpAddress("0..1")==0);
	}
	
	@Test
	public void restoreIpAddressesCase1()
	{
		ArrayList<String> result = obj.restoreIpAddresses("25525511135");
		ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(
				"255.255.11.135", "255.255.111.35"));
		
		Assert.assertTrue(expectedResult.equals(result));
	}
	
	@Test
	public void restoreIpAddressesCase2()
	{
		ArrayList<String> result = obj.restoreIpAddresses("25311312");
		ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(
				"2.53.113.12", "25.3.113.12", "25.31.13.12", "25.31.131.2", "253.1.13.12", "253.1.131.2",
				"253.11.3.12", "253.11.31.2", "253.113.1.2"));
		
		Assert.assertTrue(expectedResult.equals(result));
	}
}
