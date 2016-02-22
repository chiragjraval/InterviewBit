package com.chirag.ib.array;

import java.util.ArrayList;

public class PascalTriangleRowProblem
{
	public ArrayList<Integer> getRow(int a)
	{
		if(a<0)
			return new ArrayList<Integer>();
			
		Integer row = a;
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		Integer curNumber = 1;
		for(int i=0; i<=row; i++)
		{
			output.add(curNumber);
			curNumber = curNumber * (row-i) / (i+1); 
		}
		
		return output;
	}
	
	public void printList(ArrayList<Integer> a)
	{
		System.out.print("\nNumber = [");
		for (int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i));
			if(i<a.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args)
	{
		PascalTriangleRowProblem obj = new PascalTriangleRowProblem();
		
		ArrayList<Integer> output = obj.getRow(5);
		obj.printList(output);
		
		output = obj.getRow(6);
		obj.printList(output);
		
		output = obj.getRow(7);
		obj.printList(output);
		
		output = obj.getRow(8);
		obj.printList(output);
		
		output = obj.getRow(9);
		obj.printList(output);
		
		output = obj.getRow(10);
		obj.printList(output);
	}
}
