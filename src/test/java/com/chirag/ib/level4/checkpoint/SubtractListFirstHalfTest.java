package com.chirag.ib.level4.checkpoint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chirag.ib.level4.checkpoint.SubtractListFirstHalf.ListNode;

public class SubtractListFirstHalfTest
{
	private SubtractListFirstHalf obj;
	
	@Before
	public void setUp()
	{
		obj = new SubtractListFirstHalf();
	}
	
	@Test
	public void subtractCase10()
	{
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		
		node1 = obj.subtract(node1);
		Assert.assertTrue(node1.val==4 && node1.next.val==2);
	}
	
	@Test
	public void subtractCase11()
	{
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(5,node6);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		
		node1 = obj.subtract(node1);
		Assert.assertTrue(node1.val==5 && node1.next.val==3 && node1.next.next.val==1);
	}
	
	@Test
	public void subtractCase12()
	{
		ListNode node3 = new ListNode(98);
		ListNode node2 = new ListNode(15,node3);
		ListNode node1 = new ListNode(88,node2);
		
		node1 = obj.subtract(node1);
		Assert.assertTrue(node1.val==10 && node1.next.val==15 && node1.next.next.val==98);
	}
}
