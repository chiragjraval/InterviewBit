package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;

import com.chirag.ib.util.ArrayUtil;

public class PrintMatrixDiagonally
{
	
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a)
	{
		if(a==null || a.size()==0)
			return new ArrayList<ArrayList<Integer>>();
		
		int N = a.size();
		int N2 = (N<<1);
		int i=0, j=0, k=0;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(N);
		
		for(i=0; i<N2-1; i++)
		{
			if(i<N)
			{
				j=0;
				k=i;
			}
			else
			{
				j=(i+1)%N;
				k=N-1;
			}
				
			ArrayList<Integer> diagonalList = new ArrayList<Integer>(N);  
			for(;j<N && k>=0; j++,k--)
			{
				diagonalList.add(a.get(j).get(k));
			}
			result.add(diagonalList);
		}
		
		return result;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		PrintMatrixDiagonally obj = new PrintMatrixDiagonally();
		
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1 ,2, 3));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4 ,5, 6));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7 ,8, 9));
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>(Arrays.asList(row1, row2, row3));
		ArrayList<ArrayList<Integer>> result = obj.diagonal(input);
		for (ArrayList<Integer> resultRow : result)
			ArrayUtil.printList(resultRow);
		
		row1 = new ArrayList<Integer>(Arrays.asList(1 ,2));
		row2 = new ArrayList<Integer>(Arrays.asList(3 ,4));
		input = new ArrayList<ArrayList<Integer>>(Arrays.asList(row1, row2));
		result = obj.diagonal(input);
		for (ArrayList<Integer> resultRow : result)
			ArrayUtil.printList(resultRow);
	}
	
}
