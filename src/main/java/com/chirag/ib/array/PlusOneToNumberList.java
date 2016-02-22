package com.chirag.ib.array;

import java.util.ArrayList;

public class PlusOneToNumberList
{
	public ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> a)
	{
		int i=0;
		while(a.get(i)==0) i++;
		
		return new ArrayList<Integer>(a.subList(i, a.size()));	
	}
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> a)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		int length = a.size();
		int carry = 1;
		
		for(int i=length-1; i>=0; i--)
		{
			int digit = a.get(i);
			int oDigit = digit + carry;
			carry = oDigit>9 ? 1 : 0;
			oDigit = carry>0 ? oDigit-10 : oDigit;
			
			output.add(0, oDigit);
		}
		
		if(carry>0)
			output.add(0, carry);
		
		output = this.removeLeadingZeros(output);
		
		return output;
	}
	
	public void printList(ArrayList<Integer> a)
	{
		System.out.print("\nNumber = [");
		for (Integer integer : a) {
			System.out.print(integer + ", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args)
	{
		PlusOneToNumberList obj = new PlusOneToNumberList();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(3);
		ArrayList<Integer> output = obj.plusOne(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(0); a.add(0); a.add(1); a.add(2); a.add(3);
		output = obj.plusOne(a);
		obj.printList(output);
		
		
		a = new ArrayList<Integer>();
		a.add(0); a.add(0); a.add(0); a.add(0); a.add(0);
		output = obj.plusOne(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(3); a.add(0); a.add(4); a.add(6); a.add(0);
		output = obj.plusOne(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(3); a.add(0); a.add(4); a.add(6); a.add(0);
		output = obj.plusOne(a);
		obj.printList(output);
		
		a = new ArrayList<Integer>();
		a.add(9); a.add(9); a.add(9); a.add(9); a.add(9);
		output = obj.plusOne(a);
		obj.printList(output);
	}

}
