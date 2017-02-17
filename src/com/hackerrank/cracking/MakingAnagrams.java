package com.hackerrank.cracking;

import java.util.Scanner;

public class MakingAnagrams {
	static int LETTERS = 27;
    public static int numberNeeded(String first, String second) {
        int[] firstOccu = new int[LETTERS];
        int[] secondOccu = new int[LETTERS];
        for(int i = 0; i < LETTERS; i++ ){
            firstOccu[i] = 0;
            secondOccu[i] = 0;
        }

        
        int result = 0;

      char[] firstOne = first.toCharArray();
      char[] secondOne = second.toCharArray();
       
        for(int i = 0; i < firstOne.length; i++ ){
            firstOccu[firstOne[i]- 'a']++;
        }
        for(int i = 0; i < secondOne.length; i++ ){
            secondOccu[secondOne[i] - 'a' ] ++;
        }
        for(int i = 0; i < LETTERS; i++ ){
            result += Math.abs(firstOccu[i] - secondOccu[i]);
        }
            
        return result;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
