package polymorphism_excercise;

public class Car {

    private int wheels;
	private String name;
	private boolean engine;
	private int cilinders;

    public Car(int cilinders, String name){
			this.cilinders = cilinders;
			this.name = name;
			this.wheels = 4;
			this.engine = true;
	}
	
	public String startEngine(){
	    return getClass().getSimpleName() + "'s engine has been started";
	}
	
	public String accelerate(){
	    return getClass().getSimpleName() + " is accelerating";
	}
	
	public String brake(){
		return getClass().getSimpleName() + " is slowing down";
	}
	
	public int getCilinders(){
	    return this.cilinders;
	}
	
	public String getName(){
	    return this.name;
	}
}