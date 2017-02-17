package com.hackerrank.cracking;

import java.util.*;
public class RunningMedian {
	public static void main(String[] args) {
        
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    PriorityQueue<Double> pqMax = new PriorityQueue<Double>(n/2, Collections.reverseOrder());

	    PriorityQueue<Double> pqMin = new PriorityQueue<Double>();
	        for(int a_i=0; a_i < n; a_i++){
	     // Step 1: Add next item to one of the heaps
	            Double next = in.nextDouble();
	            if(pqMax.size() != 0 && next < pqMax.peek()){
	                pqMax.add(next);
	            }
	        else{
	            pqMin.add(next);
	        }
	            //balance the heaps
	        if(pqMin.size() - pqMax.size() > 1){
	            pqMax.add(pqMin.poll());
	        }
	        if(pqMax.size() - pqMin.size() > 1){
	            pqMin.add(pqMax.poll());
	        }
	        //Calculate median
	        if(pqMax.size() == pqMin.size())
	            {
	            Double median = (pqMax.peek() + pqMin.peek())/2;
	            System.out.println(median);
	        }
	        else{
	            if(pqMax.size() > pqMin.size())
	                  System.out.println(pqMax.peek()); 
	            else
	                 System.out.println(pqMin.peek()); 

	        }
	    }
	    }
}
