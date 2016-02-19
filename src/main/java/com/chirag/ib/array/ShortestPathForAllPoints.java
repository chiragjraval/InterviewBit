package com.chirag.ib.array;

import java.util.ArrayList;

public class ShortestPathForAllPoints
{
	static class PointWithDist
	{
		int pointIdx;
		int dist;
		
		public PointWithDist(int pointIdx, int dist)
		{
			this.pointIdx = pointIdx;
			this.dist = dist;
		}
		
	}
	
	private int getLeftBottomMostPointIndex(Integer[] x, Integer[] y)
	{
		int leftBottomIdx = 0;
		
		for(int i=1; i<x.length; i++)
			if(x[i]<x[leftBottomIdx] || (x[i]==x[leftBottomIdx] && y[i]<y[leftBottomIdx]))
				leftBottomIdx = i;
		
		return leftBottomIdx;
	}
	
	private PointWithDist getNearestUnvistiedNodeIndex(Integer[] x, Integer[] y, boolean[] isVisited, int pointIdx)
	{
		PointWithDist retPoint = new PointWithDist(0, Integer.MAX_VALUE);
		
		for(int i=0; i<isVisited.length; i++)
		{
			if(i!=pointIdx && !isVisited[i])
			{
				int dist = Math.max(Math.abs(x[i]-x[pointIdx]), Math.abs(y[i]-y[pointIdx]));
				if(dist<retPoint.dist)
				{
					retPoint.pointIdx = i;
					retPoint.dist = dist;
				}
			}
		}
		
		return retPoint;
	}
	
	private int findShortestDistForPoints(ArrayList<Integer> x, ArrayList<Integer> y)
	{
		if(x.size()!=y.size() || x.size()==0 || y.size()==0)
			return -1;
		
		Integer[] xCo = x.toArray(new Integer[0]);
		Integer[] yCo = y.toArray(new Integer[0]);
		boolean[] isVisited = new boolean[xCo.length];
		
		int totalDist = 0;
		int startPointIdx = getLeftBottomMostPointIndex(xCo, yCo);
		isVisited[startPointIdx] = true;
		System.out.println("Coordinate :: (" + xCo[startPointIdx] + ", " + yCo[startPointIdx] + ")" + " Dist=" + 0 + " TotalDist=" + totalDist);
		
		for(int i=1; i<isVisited.length; i++)
		{
			PointWithDist nextPoint = getNearestUnvistiedNodeIndex(xCo, yCo, isVisited, startPointIdx);
			totalDist += nextPoint.dist;
			isVisited[nextPoint.pointIdx] = true;
			System.out.println("Coordinate :: (" + xCo[nextPoint.pointIdx] + ", " + yCo[nextPoint.pointIdx] + ")" + " Dist=" + nextPoint.dist + " TotalDist=" + totalDist);
			
			startPointIdx = nextPoint.pointIdx;
		}
		
		for(int i=0; i<isVisited.length; i++)
			if(!isVisited[i])
				return -1;
		
		return totalDist;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		//A : [ 4, 8, -7, -5, -13, 9, -7, 8 ]
		//B : [ 4, -15, -10, -3, -13, 12, 8, -8 ]
		
		x.add(4); x.add(8); x.add(-7); x.add(-5); x.add(-13); x.add(9); x.add(-7); x.add(8);
		y.add(4); y.add(-15); y.add(-10); y.add(-3); y.add(-13); y.add(12); y.add(8); y.add(-8);
		
		ShortestPathForAllPoints obj = new ShortestPathForAllPoints();
		System.out.println(obj.findShortestDistForPoints(x, y));
	}
}
