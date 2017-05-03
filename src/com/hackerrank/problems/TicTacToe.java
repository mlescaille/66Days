/**
 * 
 */
package com.hackerrank.problems;

/**
 * @author lescm008
 * Problem in CMB interview: Find the winner of a tic tac toe game of nxn board
 *  x wins, 0 wins or No one wins are the acceptable answers
 *  To win u have to have the same symbol in either the row, the column or the diagonal
 *
 */
public class TicTacToe {

	public enum Player{
		
		PLAYER_X('x'),
		PLAYER_NONE('f'),
		PLAYER_O('0');
		private char move;
		
		Player(char move){
			this.move = move;
		}
		
		public char move(){
			return move;
		}	
	}
	private static Player hasWonRow(Player[][] board) {
		Player current = board[0][0];
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length - 1; col++){
				if(current.move != board[row][col + 1].move){
					break;
				}
				if(col == board[board.length - 1].length - 1){
					return board[row][col];
				}
			}
		}
		return Player.PLAYER_NONE;
	}
	
	private static Player hasWonCol(Player[][] board) {
		Player current = board[0][0];
		for(int row = 0; row < board.length - 1; row++){
			for(int col = 0; col < board[row].length ; col++){
				if(current.move != board[row + 1][col].move){
					break;
				}
				if(col == board[board.length - 1].length - 1){
					return board[row][col];
				}
			}
		}
		
		return Player.PLAYER_NONE;
	}
	
	private static Player hasWonDiag(Player[][] board) {
		
		Player current = board[0][0];
		//Move from the first one row down + one column right
		//First diagonal
		for(int row = 0; row < board.length - 1; row++){
				if(current.move != board[row + 1][row + 1].move){
					return Player.PLAYER_NONE;
				}
				if(row == board.length -1 ){
					int col = board[board.length - 1].length - 1;
					return board[row][col];
				}
			
		}
		//Second diagonal
		int lastCol = board[board.length - 1].length - 1;
		current = board[0][lastCol];
		for(int row = 0; row < board.length; row ++){
			for(int col = board[row].length - 1; col >= 0; col--){
				if(current.move != board[row][col].move){
					return Player.PLAYER_NONE;
				}
				if((row == board.length - 1) && (col == 0)){
					return board[row][col];
				}
			}
		}
		
		return Player.PLAYER_NONE;
	}
	public static String ticTacToe(Player[][] board){
		Player winner;
		
		if(hasWonRow(board) != Player.PLAYER_NONE){
			winner = hasWonRow(board);
			return winner.move + " wins";	
		}
		else if(hasWonCol(board) != Player.PLAYER_NONE){
			winner = hasWonCol(board);
			return winner.move + "wins";
		}
		else if(hasWonDiag(board) != Player.PLAYER_NONE){
			winner = hasWonDiag(board);
			return winner.move + "wins";
		}
		else
			return "No one wins";
		
	}
	
	
	public static void main(String[] args) {
		Player[][] board = new Player[][]{
				{Player.PLAYER_X, Player.PLAYER_O, Player.PLAYER_X}, 
				{Player.PLAYER_O, Player.PLAYER_X, Player.PLAYER_O}, 
				{Player.PLAYER_O, Player.PLAYER_O, Player.PLAYER_X}
		};
		
		System.out.println(ticTacToe(board));
		
	}

}
