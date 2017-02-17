package com.hackerrank.cracking;

import java.util.Scanner;

public class ArrayRotationLeft {
	 public static void reverse(int[] arr, int start, int end){
	        int temp;
	            while(start < end){
	            temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++; end--;
	        }
	    }

	    public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        int n = in.nextInt();
//	        int k = in.nextInt();
//	        int a[] = new int[n];
//	        for(int a_i=0; a_i < n; a_i++){
//	            a[a_i] = in.nextInt();
//	        }
//
//	        reverse(a, 0, k - 1);
//	        reverse(a, k, n - 1);
//	        reverse(a, 0, n - 1);
//	        for (int i = 0; i < n; i++)
//	            System.out.print(a[i] + " ");
	        
	        String text = "Hurray!!#! It's Friday! finally...";
	        String[] words = text.split("!+");
	        for (String string : words) {
		        System.out.println(string);

			}


	    }
}
