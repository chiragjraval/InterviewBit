package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.List;

import com.chirag.ib.util.ArrayUtil;

public class FindElemOccuringTwiceProblem
{

	public ArrayList<Integer> repeatedNumber(final List<Integer> a)
	{
		if(a==null || a.size()<=0)
			return new ArrayList<Integer>();
		
		int size = a.size();
		Long expectedSum = new Long(0);
		Long listSum = new Long(0);
		Long expectedSquareSum = new Long(0);
		Long listSquareSum = new Long(0);
		Integer A = 0, B = 0;
		
		for(int i=1; i<=size; i++)
		{
			Integer curNum = a.get(i-1);
			
			expectedSum = Math.addExact(expectedSum, i);
			listSum = Math.addExact(listSum, curNum);
			
			expectedSquareSum = Math.addExact(expectedSquareSum, i*i);
			listSquareSum = Math.addExact(listSquareSum, curNum*curNum);
		}
		
		Long sumDiff = Math.subtractExact(listSum, expectedSum);
		Long squareSumDiff = Math.subtractExact(listSquareSum, expectedSquareSum);
		
		Long BPlusA = Math.floorDiv(squareSumDiff,sumDiff);
		Long BMinusA = sumDiff;
		
		A = Math.toIntExact((Math.addExact(BPlusA, BMinusA)>>1)); 
		B = Math.toIntExact(Math.subtractExact(A, BMinusA));
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(A);
		output.add(B);
		
		return output;
	}
	
	
	public static void main(String[] args)
	{
		FindElemOccuringTwiceProblem obj = new FindElemOccuringTwiceProblem();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3); a.add(1); a.add(2); a.add(3); a.add(5);
		ArrayList<Integer> output = obj.repeatedNumber(a);
		ArrayUtil.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(7866); a.add(7866);
		for(int i=1; i<=100000; i++)
			if(i!=7866 && i!=9873) a.add(i);
		output = obj.repeatedNumber(a);
		ArrayUtil.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(99999); a.add(99999);
		for(int i=1; i<=100000; i++)
			if(i!=99999 && i!=1) a.add(i);
		output = obj.repeatedNumber(a);
		ArrayUtil.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(1); a.add(1);
		for(int i=1; i<=100000; i++)
			if(i!=99999 && i!=1) a.add(i);
		output = obj.repeatedNumber(a);
		ArrayUtil.printList(output);
	}
}
