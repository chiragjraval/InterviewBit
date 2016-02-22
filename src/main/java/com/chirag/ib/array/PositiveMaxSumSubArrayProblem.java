package com.chirag.ib.array;

import java.util.ArrayList;

public class PositiveMaxSumSubArrayProblem
{
	static class MaxSumSubArray implements Comparable<MaxSumSubArray>
	{
		Integer startIndex;
		Integer endIndex;
		Long sum;
		
		public MaxSumSubArray(Integer startIndex, Integer endIndex, Integer sum)
		{
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.sum = new Long(sum);
		}

		public int compareTo(MaxSumSubArray o)
		{
			int res = this.sum.compareTo(o.sum);
			res = res!=0 ? res : this.startIndex.compareTo(o.startIndex)*-1;
			res = res!=0 ? res : this.endIndex.compareTo(o.endIndex);
			return res;
		}
		
		@Override
		public String toString()
		{
			return "[" + this.startIndex + ", " + this.endIndex + ", " + this.sum + "]";
		}
	}
	
	
	public ArrayList<Integer> maxset(ArrayList<Integer> a)
	{
		if(a==null || a.size()==0)
			return new ArrayList<Integer>();
		
		int index = 0; 
		while(index<a.size() && a.get(index)<0) index++;
		
		if(a.size()==index)
			return new ArrayList<Integer>();
		
		MaxSumSubArray result = new MaxSumSubArray(index, index, a.get(index));
		MaxSumSubArray currSubArray = new MaxSumSubArray(index, index, a.get(index));
		
		for(int i=index+1; i<a.size(); i++)
		{
			Integer curInt = a.get(i);
			
			if(curInt<0)
			{
				if(result.compareTo(currSubArray) < 0)
					result = currSubArray;
				
				i++; 
				while(i<a.size() && a.get(i)<0) i++;
				
				if(a.size()==i)
					break;
				
				currSubArray = new MaxSumSubArray(i, i, a.get(i));
			}
			else
			{
				currSubArray.endIndex++;
				currSubArray.sum +=curInt;
			}
		}
		
		if(result.compareTo(currSubArray) < 0)
			result = currSubArray;
		
		if(result.sum<0)
			return new ArrayList<Integer>();
		
		int outListSize = result.endIndex - result.startIndex + 1;
		ArrayList<Integer> output = new ArrayList<Integer>(outListSize);
		for(int i=result.startIndex; i<=result.endIndex; i++)
			output.add(a.get(i));
		
		return output;
	}
	
	
	public void printList(ArrayList<Integer> a)
	{
		System.out.print("\nNumber = [");
		for (int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i));
			if(i<a.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args)
	{
		PositiveMaxSumSubArrayProblem obj = new PositiveMaxSumSubArrayProblem();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(5); a.add(-7); a.add(2); a.add(3);
		ArrayList<Integer> output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(5); a.add(-7); a.add(2); a.add(2); a.add(4);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(-1);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(-1); a.add(1); a.add(2); a.add(5); a.add(-1); a.add(2); a.add(2); a.add(4); a.add(-1);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(-1); a.add(1); a.add(2); a.add(5); a.add(-1); a.add(2); a.add(2); a.add(5); a.add(-1);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(0); a.add(0); a.add(-1); a.add(0);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(-1); a.add(-1);
		output = obj.maxset(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(1967513926); a.add(1540383426); a.add(-1303455736); a.add(-521595368);
		output = obj.maxset(a);
		obj.printList(output);
	}

}
