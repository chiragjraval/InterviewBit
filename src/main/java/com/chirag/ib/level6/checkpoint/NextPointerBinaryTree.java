package com.chirag.ib.level6.checkpoint;

import java.util.LinkedList;
import java.util.List;

public class NextPointerBinaryTree
{
	static class TreeLinkNode
	{
		public TreeLinkNode left;
		public TreeLinkNode right;
		public TreeLinkNode next;
		
		public TreeLinkNode(TreeLinkNode left, TreeLinkNode right, TreeLinkNode next)
		{
			this.left = left;
			this.right = right;
			this.next = next;
		}
	}
	
	private void populateNextPointer(List<TreeLinkNode> nodesList)
	{
		for(int i=0; i+1<nodesList.size(); i++)
			nodesList.get(i).next = nodesList.get(i+1);
	}
	
	private List<TreeLinkNode> getChildNodesList(List<TreeLinkNode> nodesList)
	{
		List<TreeLinkNode> childNodesList = new LinkedList<TreeLinkNode>();
		for (TreeLinkNode parentNode : nodesList)
		{
			if(parentNode.left!=null) childNodesList.add(parentNode.left);
			if(parentNode.right!=null) childNodesList.add(parentNode.right);
		}
		return childNodesList;
	}
	
	public void connect1(TreeLinkNode root)
	{
        if(root==null)
        	return;
        
        List<TreeLinkNode> curLevelNodes = new LinkedList<TreeLinkNode>();
        curLevelNodes.add(root);
        
        while(curLevelNodes.size()!=0)
        {
        	curLevelNodes = getChildNodesList(curLevelNodes);
        	populateNextPointer(curLevelNodes);
        }
    }
	
	public void connect(TreeLinkNode root)
	{
        if(root==null)
        	return;
        
        TreeLinkNode nextRowStart = root;
        
        while(nextRowStart.left!=null && nextRowStart.right!=null)
        {
        	TreeLinkNode curNode = nextRowStart;
        	nextRowStart = curNode.left;
        	
        	while(curNode!=null)
        	{
        		curNode.left.next = curNode.right;
        		if(curNode.next!=null) curNode.right.next = curNode.next.left;
        		curNode = curNode.next;
        	}
        }
    }
}
