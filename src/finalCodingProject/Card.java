package finalCodingProject;

//import java.util.List;

public class Card {
	
	//Private fields to encapsulate data.
	private String name = "";
	private String field ="";
	private int value = 0;
	
	//Constructor for Card class
	public Card(String name, String field, int value) {
		this.name = name;
		this.setField(field);
		this.value = value;
	}
	
	public Card() {
		// TODO Auto-generated constructor stub
	}

	public void describe() {
		System.out.println(this.name + " of " + this.field + " -- " + this.value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
	
}
