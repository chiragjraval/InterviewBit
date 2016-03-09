package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;

import com.chirag.ib.util.ArrayUtil;

public class SetMatrixZeros
{
	public void markRowZero(ArrayList<ArrayList<Integer>> matrix, int row, int totalRow, int totalCol)
	{
		for(int i=0; i<totalCol; i++)
			matrix.get(row).set(i, 0);
	}
	
	public void markColZero(ArrayList<ArrayList<Integer>> matrix, int col, int totalRow, int totalCol)
	{
		for(int i=0; i<totalRow; i++)
			matrix.get(i).set(col, 0);
	}
	
	public void setZeroes(ArrayList<ArrayList<Integer>> a)
	{
		if(a==null || a.size()==0 || a.get(0).size()==0)
			return;
		
		int N = a.size();
		int M = a.get(0).size();
		boolean firstRowZero = false, firstColZero = false;
		
		for(int i=0; i<N; i++)
		{
			if(a.get(i).get(0).equals(0))
			{
				firstColZero = true;
				break;
			}
		}
		
		for(int i=0; i<M; i++)
		{
			if(a.get(0).get(i).equals(0))
			{
				firstRowZero = true;
				break;
			}
		}
		
		for(int i=0; i<N; i++)
		{
			ArrayList<Integer> row = a.get(i);
			for(int j=0; j<M; j++)
			{
				if(row.get(j).equals(0))
				{
					a.get(0).set(j, -1);
					a.get(i).set(0, -1);
				}
			}
		}
		
		for(int i=1; i<M; i++)
		{
			if(a.get(0).get(i).equals(-1))
				markColZero(a, i, N, M);
		}
		
		for(int i=1; i<N; i++)
		{
			if(a.get(i).get(0).equals(-1))
				markRowZero(a, i, N, M);
		}
		
		if(firstRowZero) markRowZero(a, 0, N, M);
		if(firstColZero) markColZero(a, 0, N, M);
	}
	

	public static void main(String[] args)
	{
		SetMatrixZeros obj = new SetMatrixZeros();
		
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>(3);
		output.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
		output.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1)));
		output.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
		obj.setZeroes(output);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
		
		output = new ArrayList<ArrayList<Integer>>(2);
		output.add(new ArrayList<Integer>(Arrays.asList(0, 0)));
		output.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
		obj.setZeroes(output);
		for (ArrayList<Integer> arrayList : output) {
			ArrayUtil.printList(arrayList);
		}
	}

}
