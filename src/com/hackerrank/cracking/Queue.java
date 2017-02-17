package com.hackerrank.cracking;

public class Queue {
	private static class Node{
		private int data;
		private Node next;
		private Node(int data){
			this.data = data;
		}
	}
	private Node head; //remove from the head
	private Node tail; //add to the tail
	
	public boolean isEmpty(){
		return head == null;
	}
	public int peek(){
		return head.data;
	}
	public void add(int data){
		Node node = new Node(data);
		if(isEmpty()){
			head = node;
			tail = node;
			return;			
		}
		tail.next = node;
		tail = node;
		
	}
	public int remove(){
		int data = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return data;		
	}

}
