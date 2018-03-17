package com.chirag.ib.heapmaps;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DistinctNumberInWindowTest {

	private DistinctNumberInWindow obj = new DistinctNumberInWindow();
	
	@Test
	public void test1() {
		List<Integer> input = Arrays.asList(1, 2, 1, 3, 4, 3);
		List<Integer> expected = Arrays.asList(2, 3, 3, 2);
		List<Integer> result = obj.dNums(input, 3);
		Assert.assertEquals(expected, result);
	}
}
