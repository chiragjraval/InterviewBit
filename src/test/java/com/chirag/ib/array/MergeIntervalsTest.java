package com.chirag.ib.array;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chirag.ib.array.MergeIntervals;
import com.chirag.ib.array.MergeIntervals.Interval;

public class MergeIntervalsTest
{
	private MergeIntervals obj;
	
	@Before
    public void setUp()
	{
		obj = new MergeIntervals();
    }
	
	@Test
	public void testIntervalAdd()
	{
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(12,16));
		input.add(new Interval(1, 2));
		input.add(new Interval(6, 6));
		input.add(new Interval(3, 5));
		input.add(new Interval(8,10));
		Interval newInterval = new Interval(4, 9); 
		ArrayList<Interval> result = obj.insert(input, newInterval);
		
		ArrayList<Interval> expectedResult = new ArrayList<Interval>();
		expectedResult.add(new Interval(1, 2));
		expectedResult.add(new Interval(3, 10));
		expectedResult.add(new Interval(12, 16));
		
		boolean cmpResult = expectedResult.equals(result);
		Assert.assertTrue(cmpResult);
	}
}
