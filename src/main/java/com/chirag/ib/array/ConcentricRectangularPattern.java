package com.chirag.ib.array;

import java.util.ArrayList;

public class ConcentricRectangularPattern
{
	private ArrayList<ArrayList<Integer>> getResultArrayList(int a)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(a);
		for(int i=0; i<a; i++)
		{
			ArrayList<Integer> row = new ArrayList<Integer>(a);
			for(int j=0; j<a; j++)
				row.add(0);
			result.add(row);
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> prettyPrint(int a)
	{
		if(a<=0)
			return new ArrayList<ArrayList<Integer>>();
		
		int rows = (a<<1)-1, cols = rows;
		ArrayList<ArrayList<Integer>> result = getResultArrayList(rows);
		
		int rowStart=0, colStart=0;
		int rowEnd=rows-1, colEnd=cols-1;
		
		for(int i=a; i>0; i--)
		{
			for(int j=colStart; j<=colEnd; j++)
				result.get(rowStart).set(j, i);
			
			for(int j=rowStart; j<=rowEnd; j++)
				result.get(j).set(colEnd, i);
			
			for(int j=colEnd; j>=colStart; j--)
				result.get(rowEnd).set(j, i);
			
			for(int j=rowEnd; j>=rowStart; j--)
				result.get(j).set(colStart, i);
			
			rowStart++; colStart++;
			rowEnd--; colEnd--;
		}
		
		return result;
	}
}
