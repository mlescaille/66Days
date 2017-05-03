package com.hackerrank.problems;

public class TreeTraversals {//Orders point of reference for naming is the root. Preorder mean root first, inorder, root in the middle and postorder
	// procese root last
	void preOrder(Node root) {
		if(root != null){

			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	//Inorder traversal for a binary tree
	void inOrder(Node root) {
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	//PostOrder traversal for a binary tree
	void postOrder(Node root) {
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
}
