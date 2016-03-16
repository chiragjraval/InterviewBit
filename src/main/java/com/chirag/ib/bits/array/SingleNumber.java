package com.chirag.ib.bits.array;

import java.util.ArrayList;

public class SingleNumber
{
	public Integer singleNumber(ArrayList<Integer> a)
	{
		if(a==null || a.isEmpty())
			return null;
		
		Integer result = 0;
		for (Integer inNum : a)
			result ^= inNum;
		
		return result;
	}
}
