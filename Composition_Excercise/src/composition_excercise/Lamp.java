package composition_excercise;

public class Lamp {

	private String style;
	private boolean battery;
	private int globRating;
	
	/**
	 * @param style
	 * @param battery
	 * @param globRating
	 */
	public Lamp(String style, boolean battery, int globRating) {
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}

	public void turnOn() { 
		System.out.print("The lamp is on");
	}
	
	public String getStyle(){
		return this.style;
	}
	
	public boolean isBattery() {
		return this.battery;
	}
	
	public int getGlobRating(){
		return this.globRating;
	}
}
