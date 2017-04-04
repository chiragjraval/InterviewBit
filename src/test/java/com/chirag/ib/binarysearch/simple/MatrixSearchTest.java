package com.chirag.ib.binarysearch.simple;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixSearchTest
{
	private MatrixSearch obj;
	
	@Before
	public void setUp()
	{
		obj = new MatrixSearch();
	}
	
	@Test
	public void searchMatrix10()
	{
		ArrayList<ArrayList<Integer>> in = new ArrayList<ArrayList<Integer>>(9);
		in.add(new ArrayList<Integer>(Arrays.asList(3)));
		in.add(new ArrayList<Integer>(Arrays.asList(29)));
		in.add(new ArrayList<Integer>(Arrays.asList(36)));
		in.add(new ArrayList<Integer>(Arrays.asList(63)));
		in.add(new ArrayList<Integer>(Arrays.asList(67)));
		in.add(new ArrayList<Integer>(Arrays.asList(72)));
		in.add(new ArrayList<Integer>(Arrays.asList(74)));
		in.add(new ArrayList<Integer>(Arrays.asList(78)));
		in.add(new ArrayList<Integer>(Arrays.asList(85)));
		
		Assert.assertTrue(obj.searchMatrix(in, 41)==0);
	}
}
