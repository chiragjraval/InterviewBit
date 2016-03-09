package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.chirag.ib.util.ArrayUtil;

public class WaveArray
{
	private void swap(ArrayList<Integer> a, int idx1, int idx2)
	{
		Integer temp = a.get(idx1);
		a.set(idx1, a.get(idx2));
		a.set(idx2, temp);
	}
	
	public ArrayList<Integer> wave(ArrayList<Integer> a)
	{
		if(a==null || a.size()==0)
			return a;
		
		Collections.sort(a);
		int aLength = a.size();
		
		for(int i=0; i<aLength; i+=2)
		{
			if(i+1==aLength)
				break;
			else
				swap(a, i, i+1);
		}
		
		return a;
	}
	
	public static void main(String[] args)
	{
		WaveArray obj = new WaveArray();
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 1, 2, 3, 4));
		ArrayList<Integer> output = obj.wave(input);
		ArrayUtil.printList(output);
		
		input = new ArrayList<Integer>(Arrays.asList(5, 1, 2, 3, 4, 6, -1));
		output = obj.wave(input);
		ArrayUtil.printList(output);
		
		input = new ArrayList<Integer>(Arrays.asList(5));
		output = obj.wave(input);
		ArrayUtil.printList(output);
		
		input = new ArrayList<Integer>();
		output = obj.wave(input);
		ArrayUtil.printList(output);
	}
}
