package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConcentricRectangularPatternTest
{
	private ConcentricRectangularPattern obj;
	
	@Before
	public void setUp()
	{
		obj = new ConcentricRectangularPattern();
	}
	
	@Test
	public void prettyPrint2()
	{
		ArrayList<ArrayList<Integer>> computedResult = obj.prettyPrint(2);
		ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<ArrayList<Integer>>(3);
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(2, 2, 2)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(2, 1, 2)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(2, 2, 2)));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
	
	@Test
	public void prettyPrint3()
	{
		ArrayList<ArrayList<Integer>> computedResult = obj.prettyPrint(3);
		ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<ArrayList<Integer>>(5);
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(3, 2, 2, 2, 3)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 2, 3)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(3, 2, 2, 2, 3)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3)));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
	
	@Test
	public void prettyPrint4()
	{
		ArrayList<ArrayList<Integer>> computedResult = obj.prettyPrint(4);
		ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<ArrayList<Integer>>(7);
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 4, 4, 4, 4, 4, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 3, 3, 3, 3, 3, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 3, 2, 2, 2, 3, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 3, 2, 1, 2, 3, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 3, 2, 2, 2, 3, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 3, 3, 3, 3, 3, 4)));
		expectedResult.add(new ArrayList<Integer>(Arrays.asList(4, 4, 4, 4, 4, 4, 4)));
		Assert.assertTrue(expectedResult.equals(computedResult));
	}
}
