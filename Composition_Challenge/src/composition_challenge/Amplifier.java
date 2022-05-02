package composition_challenge;

public class Amplifier {

	public String powerSupply;
	public int numberOfChannel;
	
	/**
	 * @param powerSupply
	 * @param numberOfChannel
	 */
	public Amplifier(String powerSupply, int numberOfChannel) {
		this.powerSupply = powerSupply;
		this.numberOfChannel = numberOfChannel;
	}
	
	public String getPowerSupply() {
		return powerSupply;
	}
	
	public int getNumberOfChannel() {
		return numberOfChannel;
	}
	
	public void turnOnOff(boolean on_off) {
		String switched = on_off == true ? "green" : "red";
		System.out.println("Turn the led " + switched);
	}
	
	
	
}
