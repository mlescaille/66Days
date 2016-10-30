package programmingpearls.binarysearch;
/**
 * Implementation of the rotate array by n positions as describe in Programming pearls 
 * by Jon Bentley Column 2
 * Problem: Rotate a N-element {@code vector X} left by I positions in time proportional to N. 
 * @author erif
 *
 */
public class RotateArray {
	
	public static void rotateLeft(char[] arr, int positions){
		if(positions <= arr.length && positions >= 0){
			ReverseArray.reverse(arr, 0, positions - 1 );
			ReverseArray.reverse(arr, positions, arr.length - 1 );
			ReverseArray.reverse(arr);		
		}
	}

	public static void main(String[] args) {
		//Let's test the reverse functions first
		char arr[] = {'A', 'B', 'C', 'D', 'E', 'F'};
//		ReverseArray.reverseArray(arr, 0, arr.length - 1);
//		System.out.println(arr);
//		ReverseArray.reverseArray(arr);
		System.out.println(arr);
		rotateLeft(arr, 3);
		System.out.println(arr);

		


	}

}
