package programmingpearls.binarysearch;

public class ReverseArray {
	public void reverseArray(char[] arr, int start, int end){
		while(start < end){
			
		}
	}


	public void reverseArray(char[] arr ){
		for (int i = 0; i <= (arr.length - 2)/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}

	}

}
