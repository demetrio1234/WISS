package encapsulation;

public class Main {

	public static void main(String[] args) {
	
//		Player player1 = new Player();
//		
//		player1.name = "Jimmy";
//		player1.health = 20;
//		player1.weapon = "Machinegun";
//		
//		int damage = 10;
//		player1.loseHealth(damage);
//		
//		System.out.println("Remaining health: " + player1.health);
//		
//		damage ++;
//		
//		player1.loseHealth(damage);
//		System.out.println("Remaining health: " + player1.health);
//		

		EncapsulatedPlayer player = new EncapsulatedPlayer("Tommy", "Sword", 0);
		
		System.out.println(player.returnRemainingHealth());
		
		
	}

}
