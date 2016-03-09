package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumConsecutiveGap {

	public int maximumGap(final List<Integer> a)
	{
		if(a==null || a.size()<2)
			return 0;
		
		Integer[] inputData = a.toArray(new Integer[0]);		
		Arrays.parallelSort(inputData);
		
		int maxGap = inputData[1]-inputData[0];
		for(int i=2; i<inputData.length; i++)
			maxGap = Math.max(maxGap, inputData[i]-inputData[i-1]);
		
		return maxGap;
	}
	
	public static void main(String[] args)
	{
		MaximumConsecutiveGap obj = new MaximumConsecutiveGap();
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 10, 5));
		System.out.println("Maximum Consecutive Gap = " + obj.maximumGap(input));
		
		input = new ArrayList<Integer>(Arrays.asList(1, 10, 7, 5));
		System.out.println("Maximum Consecutive Gap = " + obj.maximumGap(input));
	}

}
