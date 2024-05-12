package finalCodingProject;

import java.util.*;

public class Player {
	
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();
	
	
	
	
	public Player(String name, int score) {
		this.name  = name;
		this.score = score;
		
	}
	
	
	public Card flip() {
		Card card = hand.remove(0);
		return card;

		
	}
	public void incrementScore() {
		this.score ++;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
}
