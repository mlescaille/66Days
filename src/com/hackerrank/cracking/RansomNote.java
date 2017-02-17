package com.hackerrank.cracking;

import java.util.Hashtable;
import java.util.Scanner;

public class RansomNote {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
			int m = in.nextInt();
			int n = in.nextInt();
			Hashtable<String, Integer> magazineWords = new Hashtable<>();
			for(int magazine_i=0; magazine_i < m; magazine_i++){
	            String magazineW = in.next();
	            Integer previous = magazineWords.get(magazineW);
	            if(previous != null){
	                     magazineWords.put(magazineW, ++previous);
	                }
	                else{
	                   magazineWords.put(magazineW, 1);

	                }
			}
			for(int ransom_i=0; ransom_i < n; ransom_i++){
				String ransomWord = in.next();
	            Integer previous = magazineWords.get(ransomWord);
	            if(previous == null){
	                System.out.println("No");
	                return;
	            }
	            else{
	                previous--;
	                if(previous < 0){
	                 System.out.println("No");
	                return;
	                }
	                else{
	                magazineWords.put(ransomWord, previous);
	                }

	            }

				
			}
			Integer sum = 0;
			for(Integer value: magazineWords.values()){
				sum += value;
	            
			}

	        if(sum == (m - n)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");

			}
		}
}
