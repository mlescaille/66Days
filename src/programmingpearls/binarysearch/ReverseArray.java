package programmingpearls.binarysearch;

import java.util.Arrays;

public class ReverseArray {
	public static void reverse(char[] arr, int start, int end){
		char temp;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		Arrays.sort(arr);
	}


	public static void reverse(char[] arr ){
		for (int i = 0; i <= (arr.length - 2)/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}

	}

}
