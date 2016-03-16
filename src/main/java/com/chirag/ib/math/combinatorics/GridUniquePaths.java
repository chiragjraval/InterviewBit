package com.chirag.ib.math.combinatorics;

public class GridUniquePaths
{
	public int uniquePaths(int a, int b)
	{
		if(a<=1 && b<=1)
			return 1;
		
		int[][] uniquePaths = new int[a][b];
		
		for(int i=0;i<a;i++)
			uniquePaths[i][0] = 1;
		
		for(int i=0;i<b;i++)
			uniquePaths[0][i] = 1;
		
		for(int i=1; i<a; i++)
		{
			for(int j=1; j<b; j++)
				uniquePaths[i][j] = uniquePaths[i][j-1] + uniquePaths[i-1][j];
		}
		
		return uniquePaths[a-1][b-1];
	}
}
