package com.hackerrank.problems;

public class HuffmanDecoding {
	void decode(String S, Node root){
		StringBuilder builder = new StringBuilder();
	    Node head = root;

		for(int i = 0; i < S.length(); i++){
			switch(S.toCharArray()[i]){
			case '0'://move left
				if(root.left != null){
                    root = root.left;
				}
				break;
			case '1':
				if(root.right != null){
                    root = root.right;
				}
				break;
        
			}
            if(root.left == null && root.right == null){//we are sure is a leaf node
				builder.append(root.data);
				root = head; //back to head
		
            }
		}
		
		System.out.println(builder.toString());
	}

}
