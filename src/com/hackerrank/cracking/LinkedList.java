package com.hackerrank.cracking;

public class LinkedList {
	Node head;
	int size;
	
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
			size++;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next();
		}
		current.next = new Node(data);
		
		
	}
	
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public boolean isEmpty(){
		if (head == null)
			return true;
		return false;
	}
	
	public void insert(int pos, int data){
		
	}
	
	public void remove(int data){
		if(isEmpty())
			return;
		Node current = head;
		if(head.data == data){
			head = head.next;
			return;
		}
		while (current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
	
	public void clear(){
		head = null;
		
	}
	 
	public int length(){
		return size;
	}
}
