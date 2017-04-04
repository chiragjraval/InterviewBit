package com.chirag.ib.util;

import java.util.ArrayList;

public class ArrayUtil
{
	public static <T extends Object> void printList(ArrayList<T> a)
	{
		System.out.print("\n[");
		for (int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i));
			if(i<a.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static <T extends Object> void printList(ArrayList<T> a, int startIdx, int endIdx)
	{
		System.out.print("\n[");
		for (int i=startIdx; i<=endIdx; i++)
		{
			System.out.print(a.get(i));
			if(i<a.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
}
