package com.chirag.ib.level4.checkpoint;

public class SubtractListFirstHalf
{
	static class ListNode
	{
		public int val;
		public ListNode next;
		ListNode(int x) { val = x; next = null; }
		ListNode(int x, ListNode next) { val = x; this.next = next; }
	}
	
	public ListNode reverseList(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		
		ListNode cur = head;
		ListNode next = head.next;
		ListNode temp = next.next;
		
		cur.next = null;
		while(temp!=null)
		{
			next.next = cur;
			cur = next;
			next = temp;
			temp = temp.next;
		}
		next.next = cur;
		
		head = next;
		return head;
	}
	
	public ListNode subtract(ListNode a)
	{
		if(a==null || a.next==null)
			return a;
		
		ListNode subtractNode = a;
		ListNode frwd = a.next;
		
		while(frwd.next!=null && frwd.next.next!=null)
		{
			subtractNode = subtractNode.next;
			frwd = frwd.next.next;
		}
		
		if(frwd.next==null)
			subtractNode = subtractNode.next;
		else
			subtractNode = subtractNode.next.next;
		
		ListNode cur = a;
		ListNode subtractList = reverseList(subtractNode);
		subtractNode = subtractList;
		while(subtractNode!=null)
		{
			cur.val = subtractNode.val - cur.val;
			cur = cur.next;
			subtractNode = subtractNode.next;
		}
		reverseList(subtractList);
		
		return a;
	}
	
	public ListNode subtractUtil(ListNode cur, ListNode frwdPointer)
	{
		ListNode subtractNode = null;
		
		if(frwdPointer.next!=null && frwdPointer.next.next!=null)
			subtractNode = subtractUtil(cur.next, frwdPointer.next.next);
		
		if(frwdPointer.next==null)
		{
			cur.val = cur.next.val - cur.val;
			return cur.next.next;
		}
		else if(frwdPointer.next.next==null)
		{
			cur.val = cur.next.next.val - cur.val;
			return cur.next.next.next;
		}
		
		cur.val = subtractNode.val - cur.val;
		return subtractNode.next;
	}
}
