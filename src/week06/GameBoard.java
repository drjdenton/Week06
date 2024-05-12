package week06;

//import java.util.*;

public class GameBoard {
	/*
	 *Private fields to hold game initialization values
	 */
	private String [] gameBoard = new String [9];
	
	/*
	 * This initalizes the game board and asks for number of 
	 * players playing the game.
	 */
	public void initalize() {
		for (int i = 1; i <= 9; i++) {
			this.gameBoard[i - 1] = String.valueOf(i);
		}
	}
	
	public void display() {
		System.out.println("       +---+---+---+");
		System.out.println("       | " + this.gameBoard[0] + " | " + this.gameBoard[1] + " | " +  this.gameBoard[2] + " | ");
		System.out.println("       +---+---+---+");
		System.out.println("       | " + this.gameBoard[3] + " | " + this.gameBoard[4] + " | " +  this.gameBoard[5] + " | ");
		System.out.println("       +---+---+---+");
		System.out.println("       | " + this.gameBoard[6] + " | " + this.gameBoard[7] + " | " +  this.gameBoard[8] + " | ");
		System.out.println("       +---+---+---+");
	}

	public boolean ifValidSetSquare(int squareNumber, String readInput, String player) {
		if (this.gameBoard[squareNumber - 1].equals(readInput)) {
			this.gameBoard[squareNumber - 1] = player;
			return true;
		} else {
			return false;
		}
		
	}
		
}
