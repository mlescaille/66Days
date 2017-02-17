package com.hackerrank.cracking;

public class NodeBST {
	NodeBST left, right;
	int data;
	public NodeBST(int data){
		this.data = data;
	}
	
	public void insert(int value){
		if(value <= data){
			if (left == null){
				left = new NodeBST(value);
				}
			else{
				left.insert(value);
			}			
		}
		else{
			if(right == null){
				right = new NodeBST(value);
			}
			else
				right.insert(value);
		}
	}
	
	public boolean contains(int value){
		if(value == data)
			return true;
		if(value < data){
			if(left == null)
				return false;
			else{
				return left.contains(value);
			}
		}
		else{
			if(right == null)
				return false;
			else{
				return right.contains(value);
			}
			
		}
	}
	
	public void printInOrder(){
		if(left != null)
			left.printInOrder();
		System.out.println(data);
		if(right != null)
			right.printInOrder();   
	}
}
