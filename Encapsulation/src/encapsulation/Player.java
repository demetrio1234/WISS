package encapsulation;

public class Player {

	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		this.health -= damage;
		if (health <= 0) {
			System.out.println("Player knocked out");
			//number of lifes has to be reduced			
		}
	}
	
	public int returnRemainingHealth() {
		return this.health;
	}
	
}
