package com.hackerrank.problems;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	void LevelOrder(Node root)
    {
       if(root == null)
           return;
       Queue<Node> nextToVisit = new ArrayDeque<Node>();
       LinkedList<Integer> levelTraversal = new LinkedList<Integer>();
       nextToVisit.add(root);
       while(!nextToVisit.isEmpty()){
           Node node = nextToVisit.remove();
           levelTraversal.add(node.data);
           if(node.left != null)
               nextToVisit.add(node.left);
           if(node.right != null)
               nextToVisit.add(node.right);
               
       }
       Iterator iterator = levelTraversal.iterator();
       while(iterator.hasNext()){
           System.out.print((iterator.next()) + " ");
       }
      
    }

}
