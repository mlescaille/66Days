package com.hackerrank.problems;

public class TopView {
	void topViewHelper(Node root, boolean go){
        if(root == null)
            return;
        if(go){//no right child
           topViewHelper(root.left, go);
            System.out.print( root.data + " ");
        }
        else{
            System.out.print( root.data + " ");
            topViewHelper(root.right, go);
        }
        
    }
    void top_view(Node root){
        if(root != null){
            topViewHelper(root.left, true);
            System.out.print( root.data + " ");
            topViewHelper(root.right, false);
    }
    }
}
