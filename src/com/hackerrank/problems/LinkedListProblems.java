package com.hackerrank.problems;

import com.hackerrank.cracking.* ;

/**
 * Created by lescm008 on 5/3/17.
 */
public class LinkedListProblems {
    /*
  Print elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.
    void Print(com.hackerrank.cracking.Node head) {
    	com.hackerrank.cracking.Node temp = head;
        if(temp == null)
            return;
        while( temp != null){
            System.out.println(temp.getData());
            temp = temp.next();
        }

    }
    


}
