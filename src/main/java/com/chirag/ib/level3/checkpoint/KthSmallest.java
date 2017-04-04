package com.chirag.ib.level3.checkpoint;

import java.util.List;

public class KthSmallest
{
	private static class MaxHeap
	{
		private int[] data;
		private int SIZE;
		
		public MaxHeap(int size)
		{
			this.SIZE = size;
			this.data = new int[size];
			
			for(int i=0; i<size; i++)
				this.data[i] = Integer.MAX_VALUE;
		}
		
		public int peek()
		{
			if(this.SIZE>0)
				return this.data[0];
			else
				return Integer.MAX_VALUE;
		}
		
		public void insert(int num)
		{
			this.data[0] = num;
			heapify(0);
		}
		
		private void heapify(int idx)
		{
			int leftChild = (idx<<1)+1;
			int rightChild = (idx<<1)+2;
			int largest = idx;
			
			if(leftChild<this.SIZE && this.data[leftChild]>this.data[largest])
				largest = leftChild;
			
			if(rightChild<this.SIZE && this.data[rightChild]>this.data[largest])
				largest = rightChild;
			
			if(idx!=largest)
			{
				swap(idx, largest);
				heapify(largest);
			}
		}
		
		private void swap(int idx1, int idx2)
		{
			int temp = this.data[idx1];
			this.data[idx1] = this.data[idx2];
			this.data[idx2] = temp;
		}
	}
	
	
	public int kthsmallest(final List<Integer> a, int k) 
	{
		MaxHeap maxHeap = new MaxHeap(k);
		
		for (Integer num : a)
		{
			if(num<maxHeap.peek())
				maxHeap.insert(num);
		}
		
		return maxHeap.peek();
	}
}
