package finalCodingProject;

import java.util.Scanner;

public class App {
	
	Card c = new Card();
	Scanner sc = new Scanner(System.in);
	static String name1 = "Jordan";
	static String name2 = "Mike";
	
	public static void main(String[] args) {
	
		//Create a new deck
		Deck deck = new Deck();
		
		//Shuffle deck
		deck.shuffle();
		
		//Create 2 new players
		Player ply1 = new Player(name1, 0);
		Player ply2 = new Player(name2, 0);
		
		//Create players hand
		for (int i = 0; i< 26; i++) {
			ply1.getHand().add(deck.draw());
			ply2.getHand().add(deck.draw());
		}
		
		System.out.println("********************************\n");
		System.out.println("******** WELCOME TO WAR ********\n");
		System.out.println("********************************\n");
		
		for (int i =0; i < 26; i++) {
			System.out.println("\tROUND: " + (i + 1) + "\n");
			
			Card p1Card = ply1.flip();
			p1Card.describe();
			Card p2Card = ply2.flip();
			p2Card.describe();
			
			if(p1Card.getValue() > p2Card.getValue()) {
				System.out.println("\n\t" + ply1.getName() + " WINS THIS ROUND!\n");
				ply1.incrementScore();
			} else if(p1Card.getValue() < p2Card.getValue()) {
				System.out.println("\n\t" + ply2.getName() + " WINS THIS ROUND!\n");
				ply2.incrementScore();
			} else {
				System.out.println("You both lose this round!\n");
			}
			System.out.println("\n*******************************\n"
					+ "***** MIKE & JORDAN GAMES *****"
					+ "\n*******************************\n");
			
		}//.End of for loop
		
		if(ply1.getScore() > ply2.getScore()) {
			System.out.println(ply1.getName() + " WINS THIS WAR!\n");
		} else if(ply1.getScore() < ply2.getScore()) {
			System.out.println(ply2.getName() + " WINS THIS WAR!\n");
			
		} else {
			System.out.println("IN WAR NOBODY WINS\n");
		}
		System.out.println(ply1.getName() + "'s Score: " + ply1.getScore() + "   " + ply2.getName() +  "'s Score: "+ ply2.getScore());
		System.out.println("\n*************************************************************************");
		System.out.println("\n******************** (C) 2024 Mike and Jordan Games *********************");
		System.out.println("\n*************************************************************************");
	}	
}
