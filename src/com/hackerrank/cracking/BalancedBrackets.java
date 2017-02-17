package com.hackerrank.cracking;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {
	public static boolean isBalanced(String expression){
		int i = 0;
		Deque<Character> bracket = new ArrayDeque<>();
		boolean balanced = true;
		if (expression.length() == 0 || expression.length() == 1){
			return false;
		}
		while(i < expression.length()){
			switch (expression.charAt(i)) {
			case '{':
				bracket.push(expression.charAt(i));
				break;
			case '[':
				bracket.push(expression.charAt(i));
				break;
			case '(':
				bracket.push(expression.charAt(i));
				break;
			case ')':
				if(bracket.isEmpty()  || (bracket.pop() != '(')){
					return false;
				}
				break;
			case ']':
				if(bracket.isEmpty() || (bracket.pop() != '[')){
					return false;
				}
				
				break;
			case '}':
				if(bracket.isEmpty()  || (bracket.pop() != '{')){
					return false;
				}
				break;
			default:
				break;
			}
			i++;

		}
		
		return bracket.isEmpty() && balanced;
		
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}
