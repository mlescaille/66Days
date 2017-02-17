package com.hackerrank.problems;


public class Node {
	 int data;
     Node left;
     Node right;
    public Node(){}
 	public Node(int data){
 		this.data = data;
 	}
 	
 	public int getData(){
 		return data;
 	}
 	
 	public Node left(){
 		return left;
 	}
 	public Node right(){
 		return right;
 	}
}
