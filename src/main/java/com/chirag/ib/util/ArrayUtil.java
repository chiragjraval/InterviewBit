package com.chirag.ib.util;

import java.util.ArrayList;

public class ArrayUtil
{
	public static void printList(ArrayList<Integer> a)
	{
		System.out.print("\n[");
		for (int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i));
			if(i<a.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
}
