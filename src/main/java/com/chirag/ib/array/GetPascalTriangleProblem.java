package com.chirag.ib.array;

import java.util.ArrayList;

import com.chirag.ib.util.ArrayUtil;

public class GetPascalTriangleProblem {

	public ArrayList<ArrayList<Integer>> generate(int a)
	{
		int rows = a;
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		
		if(rows<=0) return output;
		
		ArrayList<Integer> firstRow = new ArrayList<Integer>(1);
		firstRow.add(1);
		output.add(firstRow);
		ArrayList<Integer> prevRow = firstRow;
		
		for(int i=1; i<rows; i++)
		{
			ArrayList<Integer> curRow = new ArrayList<Integer>(i+1);
			for(int j=0; j<=i; j++)
			{
				if(j==0 || j==i)
					curRow.add(1);
				else
					curRow.add(prevRow.get(j-1)+prevRow.get(j));
			}
			output.add(curRow);
			prevRow = curRow;
		}
		
		return output;
	}
	
	public static void main(String[] args)
	{
		GetPascalTriangleProblem obj = new GetPascalTriangleProblem();
		ArrayList<ArrayList<Integer>> output = obj.generate(5);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
		
		output = obj.generate(1);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
		
		output = obj.generate(0);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
		
		output = obj.generate(-1);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
		
		output = obj.generate(10);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
	}

}
