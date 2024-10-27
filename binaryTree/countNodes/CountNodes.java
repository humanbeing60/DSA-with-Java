package com.cdac.binaryTree.countNodes;

import com.cdac.binaryTree.BTNode;

public class CountNodes {
	private BTNode root;
	
	public CountNodes() {
		root = null;
	}
	
	public void createHardCodedBinaryTree() {
			
		BTNode n1 = new BTNode(10);
		BTNode n2 = new BTNode(5);
		BTNode n3 = new BTNode(4);
		BTNode n4 = new BTNode(3);
		BTNode n5 = new BTNode(2);
		BTNode n6 = new BTNode(7);
		BTNode n7 = new BTNode(9);
		BTNode n8 = new BTNode(8);
		BTNode n9 = new BTNode(6);
		BTNode n10 = new BTNode(15);
		BTNode n11 = new BTNode(12);
		BTNode n12 = new BTNode(11);
		BTNode n13 = new BTNode(17);
		BTNode n14 = new BTNode(4);
		
		n1.left = n2;
		n1.right = n3;
		
		n2.left = n4;
		n2.right = n5;
		
		n3.left = n6;
		n3.right = n7;
		
		n4.left = n14;
		n4.right = n8;
		
		n5.left = n9;
		n5.right = null;
		
		n6.left = n10;
		n6.right = n11;
		
		n7.left = null;
		n7.right = n12;
		
		n8.left = null;
		n8.right = null;
		
		n9.left = null;
		n9.right = null;
		
		n10.left = null;
		n10.right = null;
		
		n11.left = n13;
		n11.right = null;
		
		n12.left = null;
		n12.right = null;
		
		n13.left = null;
		n13.right = null;
		
		root = n1;
	}
	
	private int cntNodes(BTNode root) {
		if(root == null) {
			return 0;
		}
				
		int NodeCnt = 0;
		
		if(root.left != null) {
			NodeCnt += cntNodes(root.left);
		}
		
		if(root.right != null) {
			NodeCnt += cntNodes(root.right);
		}
		
		return 1 + NodeCnt;
	}	
	
	public int countNodes() {
		return cntNodes(root);
	}
}