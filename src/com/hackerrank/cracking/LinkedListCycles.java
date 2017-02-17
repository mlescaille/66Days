package com.hackerrank.cracking;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycles {
	
	boolean hasCycle(Node head) { //Tortoise and the hare
	    if(head == null){
	        return false;
	    }
	    if(head.next == null){
	        return false;
	    }
	    Node fast = new Node();
	    Node slow = new Node();
	    fast = head.next;
	    slow = head;
	    while(fast != null && slow.next != null && fast.next != null){
	        if( slow == fast){
	            return true;
	        }
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return false;
	        

	    
	}
	boolean hasCycleWithSet(Node head) {
	    Node traverse = head;
	    if(traverse == null )
	        return false;
	    Set<Node> visited = new HashSet<Node>();
	    while(traverse != null){
	        visited.add(traverse);
	        traverse = traverse.next;  
	        if(visited.contains(traverse))
	            return true;
	    }
	    return false;
	}

}
