package com.chirag.ib.level5.checkpoint;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestConsecutiveSequenceTest
{
	private LongestConsecutiveSequence obj;
	
	@Before
	public void setUp()
	{
		obj = new LongestConsecutiveSequence();
	}
	
	@Test
	public void longestConsecutiveCase10()
	{
		List<Integer> inList = Arrays.asList(100, 4, 200, 1, 3, 2);
		Assert.assertTrue(obj.longestConsecutive(inList)==4);
	}
	
	@Test
	public void longestConsecutiveCase11()
	{
		List<Integer> inList = Arrays.asList(100, 4, 200, 5, 1, 3, 2);
		Assert.assertTrue(obj.longestConsecutive(inList)==5);
	}
}
