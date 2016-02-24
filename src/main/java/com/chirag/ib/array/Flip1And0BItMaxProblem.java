package com.chirag.ib.array;

import java.util.ArrayList;

import com.chirag.ib.util.ArrayUtil;

public class Flip1And0BItMaxProblem {

	static class MaxDiffSubArray implements Comparable<MaxDiffSubArray>, Cloneable
	{
		Integer startIndex;
		Integer endIndex;
		Long diff;
		
		public MaxDiffSubArray(Integer startIndex, Integer endIndex, Integer diff)
		{
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.diff = new Long(diff);
		}

		public int compareTo(MaxDiffSubArray o)
		{
			int res = this.diff.compareTo(o.diff);
			res = res!=0 ? res : this.startIndex.compareTo(o.startIndex)*-1;
			res = res!=0 ? res : this.endIndex.compareTo(o.endIndex)*-1;
			return res;
		}
		
		protected MaxDiffSubArray clone()
		{
			MaxDiffSubArray clone = new MaxDiffSubArray(this.startIndex, this.endIndex, this.diff.intValue());
		    return clone;
		}
		
		@Override
		public String toString()
		{
			return "[" + this.startIndex + ", " + this.endIndex + ", " + this.diff + "]";
		}
	}
	
	public ArrayList<Integer> flip(String A)
	{
		final char CHAR1 = '1'; 
		char[] a = A.toCharArray();
		
		if(a==null || a.length==0)
			return new ArrayList<Integer>();
		
		int index = 0; 
		while(index<a.length && a[index]==CHAR1) index++;
		
		if(a.length==index)
			return new ArrayList<Integer>();
		
		MaxDiffSubArray result = new MaxDiffSubArray(index, index, 1);
		MaxDiffSubArray currSubArray = new MaxDiffSubArray(index, index, 1);
		
		for(int i=index+1; i<a.length; i++)
		{
			char curChar = a[i];
			
			if(curChar==CHAR1)
			{
				currSubArray.endIndex++;
				currSubArray.diff--;
				
				if(currSubArray.diff<0)
				{
					i++; 
					while(i<a.length && a[i]==CHAR1) i++;
					
					if(a.length==i)
						break;
					
					currSubArray = new MaxDiffSubArray(i, i, 1);
				}
			}
			else
			{
				currSubArray.endIndex++;
				currSubArray.diff++;
			}
			
			if(result.compareTo(currSubArray) < 0)
				result = currSubArray.clone();
		}
		
		if(result.compareTo(currSubArray) < 0)
			result = currSubArray.clone();
		
		if(result.diff<0)
			return new ArrayList<Integer>();
		
		ArrayList<Integer> output = new ArrayList<Integer>(2);
		output.add(result.startIndex+1);
		output.add(result.endIndex+1);
		
		return output;
    }
	
	public static void main(String[] args)
	{
		Flip1And0BItMaxProblem obj = new Flip1And0BItMaxProblem();
		
		ArrayList<Integer> output = obj.flip("010");
		ArrayUtil.printList(output);
		
		output = obj.flip("111");
		ArrayUtil.printList(output);
		
		output = obj.flip("10001001");
		ArrayUtil.printList(output);
		
		output = obj.flip("00110000");
		ArrayUtil.printList(output);
		
		output = obj.flip("10011000011");
		ArrayUtil.printList(output);

		output = obj.flip("0111000100010");
		ArrayUtil.printList(output);
	}

}
