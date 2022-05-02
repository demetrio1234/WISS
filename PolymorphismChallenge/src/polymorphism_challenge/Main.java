package polymorphism_challenge;

//Create a base class called Car
	 class Car{
		
		private String motto = "I'm a sort of vehicle used by people to drive from point A to point B";
		private String name;
		private int wheels;
		private int doors;
		private boolean engine;
		private int cilinders;

//		Constructor should initialize cylinders (number of) and name, and set wheels to 4
//		and engine to true. Cylinders and names would be passed parameters.

		/**
		 * @param cilinders
		 * @param name
		 * @param doors
		 */
		public Car(int cilinders, String name, int doors){
			this.cilinders = cilinders;
			this.name = name;
			this.wheels = 4;
			this.engine = true;
			this.doors = doors;
		}
		
		
//		Create appropriate getters
		
		public String getName(){
			return this.name;
		}
		
		public int getCilinders(){
			return this.cilinders;
		}
		
		public boolean getEngine(){
			return this.engine;
		}
		
		public int getWheels(){
			return this.wheels;
		}
		
		public int getDoors(){
			return this.doors;
		}
		
		public void motto() {
			System.out.println(this.motto);
		}
			
//		Create some methods like startEngine, accelerate, and brake
//		show a message for each in the base class

		public void startEngine(){
			this.engine = true;
			System.out.println("The engine is on");
		}

		public void accelerate(){
			System.out.println("The car is accelerating");
		}

		public void brake(){
			System.out.println("The car is slowing down");
		}

	}


//		Now create 3 sub classes for your favorite vehicles.

//		Override the appropriate methods to demonstrate polymorphism in use.

	class Lancia extends Car {
		private String motto = "Italian Rallye Queen";
		
		public Lancia() {
			super(4, "Delta", 5);
		}
		
		@Override
		public void motto() {
			System.out.println(this.motto);
		}
		
	}


	class AlfaRomeo extends Car {
		private String motto = "I'm built for the Sunday car driver";
		
		public AlfaRomeo() {
			super(6, "Giulia", 5);
		}
		
		@Override
		public void motto() {
			System.out.println(this.motto);
		}

	}

	class Ferrari extends Car {
		private String motto = "I'm red and FUCKING expencive";
		
		public Ferrari() {
			super(10, "Testarossa", 3);
		}
		
		@Override
		public void motto() {
			System.out.println(this.motto);
		}
	}
	
	
	class Mitsubishi extends Car {
		private String motto = "Oriental Rallye winner";
		
		public Mitsubishi() {
			super(4, "Lancer", 5);
		}
		
		@Override
		public void motto() {
			System.out.println(this.motto);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public class Main {
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 10) {	
			final Car manufacturer = selectManufacturer();
			System.out.println(manufacturer.getName());
			manufacturer.motto();
			manufacturer.accelerate();
			manufacturer.brake();

			i++;
			
			System.out.println(manufacturer.getClass().getSimpleName());
			
		}

		
		
		
		
	}
	
	public static Car selectManufacturer() {	
		int selector = (int)(Math.random()*3+1);		
		if ((selector > 0 ) && ( selector < 4)){
			switch (selector) {
			case 1 : return new Lancia();
			case 2 : return new AlfaRomeo();
			case 3 : return new Ferrari();
			}
			System.out.println("Invalid selector");
		}
		return null;
		
	}
	
}
