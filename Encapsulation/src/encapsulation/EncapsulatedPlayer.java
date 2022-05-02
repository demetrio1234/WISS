package encapsulation;

public class EncapsulatedPlayer {

	private String name;
	private String weapon;
	private int health = 100;
	
	
	/**
	 * @param name
	 * @param weapon
	 * @param health
	 */
	public EncapsulatedPlayer(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		if (health>0 && health<=100) {
			this.health = health;
		}else {
			System.out.println("Invalid value, since then you'll get a randomized value for your health...");
			this.health = (int)(Math.random()*100);
		}
	}
	
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
