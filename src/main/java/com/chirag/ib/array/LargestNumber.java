package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber
{
	static class NumString implements Comparable<NumString>
	{
		Integer val;
		String valStr;
		
		public NumString(Integer val)
		{
			this.val = val;
			this.valStr = String.valueOf(val);
		}

		public int compareTo(NumString o)
		{
			String thisStartString = this.valStr + o.valStr;
			String oStartString = o.valStr + this.valStr;
			
			return thisStartString.compareTo(oStartString);
		}
		
		public String toString()
		{
			return "NumString[" + this.val + "]";
		}
	}
	
	private void addToBucket(ArrayList<NumString> bucket, NumString numString)
	{
		int bucketSize = bucket.size();
		for(int i=0; i<bucketSize; i++)
		{
			if(numString.compareTo(bucket.get(i))>0)
			{
				bucket.add(i, numString);
				return ;
			}
		}
		bucket.add(numString);
	}
	
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a)
	{
		if(a==null || a.size()==0)
			return "";
		
		int aSize = a.size();
		
		ArrayList<ArrayList<NumString>> buckets = new ArrayList<ArrayList<NumString>>(10);
		for(int i=0; i<10; i++)
			buckets.add(new ArrayList<NumString>());
		
		for(int i=0; i<aSize; i++)
		{
			Integer curVal = a.get(i);
			NumString curNumString = new NumString(curVal);
			ArrayList<NumString> bucket = buckets.get(curNumString.valStr.charAt(0)-48);
			addToBucket(bucket, curNumString);
		}
		
		StringBuilder strBuilder = new StringBuilder();
		boolean allZeros = false;
		for(int i=buckets.size()-1; i>=0; i--)
		{
			ArrayList<NumString> bucket = buckets.get(i);
			int bucketSize = bucket.size();
			
			if(i==0 && strBuilder.length()==0)
				allZeros = true;
			else
			{
				for(int j=0; j<bucketSize; j++)
					strBuilder.append(bucket.get(j).val);
			}
		}
		
		return allZeros ? "0" : strBuilder.toString();
	}
	

	public static void main(String[] args)
	{
		LargestNumber obj = new LargestNumber();
		
		ArrayList<Integer> input /*= new ArrayList<Integer>(Arrays.asList(1, 2, 0));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input */= new ArrayList<Integer>(Arrays.asList(3, 30, 34, 5, 9));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(949, 94));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(94, 949));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(12, 121));
		System.out.println("Largest Num = " + obj.largestNumber(input));
		
		input = new ArrayList<Integer>(Arrays.asList(121, 12));
		System.out.println("Largest Num = " + obj.largestNumber(input));
	}
	
}
