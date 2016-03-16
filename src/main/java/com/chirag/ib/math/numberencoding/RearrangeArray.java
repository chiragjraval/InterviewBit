package com.chirag.ib.math.numberencoding;

import java.util.ArrayList;

public class RearrangeArray
{
	public void rearrangeArray(int[] a)
	{
		if(a==null || a.length<=1)
			return;
		
		for(int i=0; i<a.length; i++)
			a[i] += (a[a[i]]%a.length)*a.length;
		
		for(int i=0; i<a.length; i++)
			a[i] /= a.length;
	}
	
	public void arrange(ArrayList<Integer> a)
	{
		if(a==null || a.size()<=1)
			return;
		
		int aLength = a.size();
		
		for(int i=0; i<aLength; i++)
		{
			Integer curNum = a.get(i); 
			a.set(i, curNum+((a.get(curNum)%aLength)*aLength));
		}
		
		for(int i=0; i<aLength; i++)
			a.set(i, a.get(i)/aLength);
	}
}
