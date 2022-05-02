public class Fruit {

	private String color;
	private String weightUnity;
	private double price;
	
	/**
	 * 
	 * @param color
	 * @param weightUnity
	 * @param price
	 */
	public Fruit(String color, String weightUnity, double price) {
		this.color = color;
		this.weightUnity = weightUnity;
		this.price = price;
	}

	public Fruit(String color, String weightUnity) {
		this(color, weightUnity, 0.0);
	}
	
	public Fruit(String color) {
		this(color, "Kg", 0.0);
	}
	
	public Fruit() {
		this("Green", "Kg", 1.0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public String getWeightUnity() {
		return weightUnity;
	}

	/**
	 * 
	 * @param weightUnity
	 */
	public void setWeightUnity(String weightUnity) {
		this.weightUnity = weightUnity;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
