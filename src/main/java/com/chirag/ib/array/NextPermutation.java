package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.chirag.ib.util.ArrayUtil;

public class NextPermutation {

	private void swap(ArrayList<Integer> a, int idx1, int idx2)
	{
		Integer temp = a.get(idx1);
		a.set(idx1, a.get(idx2));
		a.set(idx2, temp);
	}
	
	public void nextPermutation(ArrayList<Integer> a)
	{
		if(a==null || a.size()==0)
			return;
		
		int aLength = a.size();
		boolean permutationPossible = false;
		int permutationIdxFrom = 0, permutationIdxTo = 0;
		
		for(int i=aLength-1; i>0 && i>permutationIdxTo; i--)
		{
			Integer curNum = a.get(i);
			
			int j=i-1;
			while(j>=0 && a.get(j).compareTo(curNum)>0){
				j--;
			}
			
			if(j>=0 && (!permutationPossible || permutationIdxTo<j))
			{
				permutationPossible = true;
				permutationIdxFrom = i;
				permutationIdxTo = j;
			}
		}
		
		if(permutationPossible)
		{
			swap(a, permutationIdxFrom, permutationIdxTo);
			Collections.sort(a.subList(permutationIdxTo+1, aLength));
		}
		else
			Collections.sort(a);
	}
	
	public static void main(String[] args)
	{
		NextPermutation obj = new NextPermutation();

		ArrayList<Integer> /*input = new ArrayList<Integer>(Arrays.asList(1,2,3));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(3,2,1));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(1,1,5));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(20, 50, 113));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(20, 50, 113, 80));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(20, 50, 117, 113, 80));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);*/
		
		input = new ArrayList<Integer>(Arrays.asList(769, 533));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(237, 542));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(4, 1, 3, 2));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(1, 7, 5, 6, 3));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
		
		input = new ArrayList<Integer>(Arrays.asList(444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52));
		obj.nextPermutation(input);
		ArrayUtil.printList(input);
	}

}
