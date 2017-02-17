package com.hackerrank.cracking;

import java.util.EmptyStackException;

public class Stack {
	private static class Node{
		private int data;
		private Node next;

		private Node(int data){
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty(){
		return top == null;
	}
	public int peek(){
		int data;
		if(!isEmpty()){
			data = top.data;
		}
		else
			throw new EmptyStackException();
		return data;
	}
	public void push(int data){
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	public int pop(){
		int data = top.data;
		top = top.next;
		return data;
	}

}
