package polymorphism_excercise;

public class Main {

	public static void main(String[] args) {

		Ford ford = new Ford();
		
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		System.out.println(ford.getCilinders());
		System.out.println(ford.getName());
		

	}

}
