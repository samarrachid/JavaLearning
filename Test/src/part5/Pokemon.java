package part5;

public class Pokemon {
	private final String Pokemon = "Here is a Pokemon :P";
	
	private int health = 600;
	private int attack = 3;
	private int movement = 5;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	private String color = "Yellow";
	
	public String name = "Pokemon";
	
	public int getHealth() {
		
		return health;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() { 
		return movement;
	}
	
	public int getxPosition() {
		return xPosition;
	}
	
	public int getyPosition() {
		return yPosition;
	}
	
	public void setHealth (int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public void setHealth (double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public Pokemon(int newHealth, int newAttack, int newMovement) {
		health = newHealth;
		this.attack = newAttack;
		movement = newMovement;
		
	}
	
	public Pokemon() {
		
	}
	
	public static void main(String[] args) {
		Pokemon Pokemon = new Pokemon();
		System.out.println("the" + Pokemon.name +"attack is: " + Pokemon.attack);
	}
}
