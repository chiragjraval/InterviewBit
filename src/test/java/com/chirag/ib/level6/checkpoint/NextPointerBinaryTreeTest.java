package com.chirag.ib.level6.checkpoint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chirag.ib.level6.checkpoint.NextPointerBinaryTree.TreeLinkNode;

public class NextPointerBinaryTreeTest
{
	private NextPointerBinaryTree obj;
	
	@Before
	public void setUp()
	{
		obj = new NextPointerBinaryTree();
	}
	
	@Test
	public void connectCase10()
	{
		TreeLinkNode node3 = new TreeLinkNode(null, null, null);
		TreeLinkNode node2 = new TreeLinkNode(null, null, null);
		TreeLinkNode node1 = new TreeLinkNode(node2, node3, null);
		
		obj.connect(node1);
		Assert.assertTrue(node1.next==null && node2.next==node3 && node3.next==null);
	}
	
	@Test
	public void connectCase11()
	{
		TreeLinkNode node7 = new TreeLinkNode(null, null, null);
		TreeLinkNode node6 = new TreeLinkNode(null, null, null);
		TreeLinkNode node5 = new TreeLinkNode(null, null, null);
		TreeLinkNode node4 = new TreeLinkNode(null, null, null);
		TreeLinkNode node3 = new TreeLinkNode(node6, node7, null);
		TreeLinkNode node2 = new TreeLinkNode(node4, node5, null);
		TreeLinkNode node1 = new TreeLinkNode(node2, node3, null);
		
		obj.connect(node1);
		Assert.assertTrue(node1.next==null && node2.next==node3 && node3.next==null
				&& node4.next==node5 && node5.next==node6
				&& node6.next==node7 && node7.next==null);
	}
}
