package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;

import com.chirag.ib.util.ArrayUtil;

public class RotateMatrix {

	/*public void rotate(ArrayList<ArrayList<Integer>> a)
	{
		if(a==null || a.size()==0 || a.get(0).size()==0 || a.size()!=a.get(0).size())
			return;
		
		int n = a.size();
		
		int i=n-1, j=n-1;
		int k=0, l=0;
		
		
		while(k<=i && l<=j)
		{
			Integer prevVal = a.get(k).get(l);
			Integer temp;
			
			for(int m=l; m<=j; m++)
			{
				temp = a.get(k).get(m);
				a.get(k).set(m, prevVal);
				prevVal = temp;
			}
			
			for(int m=k+1; m<=i; m++)
			{
				temp = a.get(m).get(j);
				a.get(m).set(j, prevVal);
				prevVal = temp;
			}
			
			for(int m=j-1; m>=l; m--)
			{
				temp = a.get(i).get(m);
				a.get(i).set(m, prevVal);
				prevVal = temp;
			}
			
			for(int m=i-1; m>=k; m--)
			{
				temp = a.get(m).get(l);
				a.get(m).set(l, prevVal);
				prevVal = temp;
			}
			
			k++;j--;i--;l++;
		}
		
	}*/
	
	public void rotate(ArrayList<ArrayList<Integer>> a)
	{
		if(a==null || a.size()==0 || a.get(0).size()==0 || a.size()!=a.get(0).size())
			return;
		
		int n = a.size();
		
		int i=n-1, j=n-1;
		int k=0, l=0;
		
		while(k<i && l<j)
		{
			for(int m=0; m<j-l; m++)
			{
				Integer temp = a.get(k).get(l+m);
				a.get(k).set(l+m, a.get(i-m).get(l));
				a.get(i-m).set(l, a.get(i).get(j-m));
				a.get(i).set(j-m, a.get(k+m).get(j));
				a.get(k+m).set(j, temp);
			}
			k++;j--;i--;l++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		RotateMatrix obj = new RotateMatrix();
		
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1 ,2));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4 ,3));
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>(Arrays.asList(row1, row2));
		obj.rotate(input);
		for (ArrayList<Integer> resultRow : input)
			ArrayUtil.printList(resultRow);
		
		row1 = new ArrayList<Integer>(Arrays.asList(1 ,2, 3));
		row2 = new ArrayList<Integer>(Arrays.asList(8 ,9, 4));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7 ,6, 5));
		input = new ArrayList<ArrayList<Integer>>(Arrays.asList(row1, row2, row3));
		obj.rotate(input);
		for (ArrayList<Integer> resultRow : input)
			ArrayUtil.printList(resultRow);
		
		row1 = new ArrayList<Integer>(Arrays.asList(1 ,2, 3, 4));
		row2 = new ArrayList<Integer>(Arrays.asList(12 ,13, 14, 5));
		row3 = new ArrayList<Integer>(Arrays.asList(11 ,16, 15, 6));
		ArrayList<Integer> row4 = new ArrayList<Integer>(Arrays.asList(10 ,9, 8, 7));
		input = new ArrayList<ArrayList<Integer>>(Arrays.asList(row1, row2, row3, row4));
		obj.rotate(input);
		for (ArrayList<Integer> resultRow : input)
			ArrayUtil.printList(resultRow);
	}

}
