package programmingpearls.binarysearch;

import java.util.Arrays;

/**
 * BinarySearch class provides code for linear finite search 
 * of an integer in a sorted array of integers
 * @author erif
 *
 */
public class BinarySearch {
	/**
	 * @param arr the array of integers, must be sorted in ascending order	
	 * @param key the search key
	 * @return index of key in array {@code arr} if present; {@code -1 } otherwise 
	 * 
	 */
	public static int indexOf(int[] arr, int key){
		int lo = 0;
		int high = arr.length - 1;
		while(lo <= high){//exit condition
			System.out.println("Pass " + lo + " high " + high);
			//Key is in arr[lo..high] or not present
			int mid = lo + (high - lo)/2;
			if(key < arr[mid])
				high = mid - 1;
			else if(key > arr[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] whitelist = {100, 10,21,20,30,45,66,80,90};
		Arrays.sort(whitelist);
		int key = 20;
		if(indexOf(whitelist, key) != -1)
			System.out.println(key);
		
	} 
	
	
	
	
	
	

}
