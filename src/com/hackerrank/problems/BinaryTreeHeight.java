package com.hackerrank.problems;

public class BinaryTreeHeight {

	static int getHeight(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 0;
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		return (leftHeight > rightHeight ? leftHeight  : rightHeight ) + 1;

	}

}
