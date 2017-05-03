/**
 * 
 */
package com.hackerrank.problems;

/**
 * @author lescm008
 * Coding problem for EatClub, calculate the hamming distance for the binary representation of 2 int numbers
 */
//Hamming distance
//cat
//hat
//1

//101 (5)
//1 (1)
//1

//101  (5)
//11  (3)
//2

//11111 (31)
// 11 (3)
//3

//10 01  (9)
//00 11  (3)
//2

//hammingDistance(5,3) => 2
//hammingDistance(5,1) => 1
//1011
// 0

/**
 * 
 * @author lescm008
 * Could also be solved counting the one in a XOR between the two numbers. XOR returns true only when the inputs differ.
 * The hamming distance can be seen also in problems of type: "Write a method that return the number of bits that will need to be changed in order to 
 * convert an integer X, into another integer Y and viceversa."
 */
public class HammingDistance {
	public static int hammingDistanceImproved(int x, int y){

		int bitCount = 0;
		int z = x ^ y;  //XOR x and y

		while (z != 0)
		{
			//increment count if last binary digit is a 1:
			bitCount += z & 1; 
			z = z >> 1;  //shift Z by 1 bit to the right
		}

		return bitCount;
	}
	
	public static int hammingDistance(int a, int b){
		String first = Integer.toBinaryString(a);
		String second = Integer.toBinaryString(b);
		char[] longestArr = first.length() > second.length() ? first.toCharArray() : second.toCharArray();
		first.toCharArray(); 
		char[] shortestArr = first.length() <= second.length() ? first.toCharArray() : second.toCharArray();

		int count = 0;

		for(int i = shortestArr.length - 1; i >= 0; i--){

			if(longestArr[i] != shortestArr[i]){
				count++;
			}

		}
		// 111 11
		//     11
		//shortestArr.length - 1 = 1
		int n = longestArr.length - shortestArr.length;
		for(int i = 0; i < n; i++){
			if(longestArr[i] == '1'){
				count++;
			}
		}

		return count;
	}
	public static void main(String[] args) {
		System.out.println(hammingDistance(5, 3));  // 2
		System.out.println(hammingDistance(9, 3));  // 2
		System.out.println(hammingDistance(0, 0));  // 0
		System.out.println(hammingDistance(7, 3));  // 1
		System.out.println(hammingDistance(31, 3)); // 3
		System.out.println(hammingDistance(3, 9)); // 2
	}

}
