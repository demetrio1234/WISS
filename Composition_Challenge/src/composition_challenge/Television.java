package composition_challenge;

public class Television {

	public Resolution nativeResolution;
	public double weight;
	public double width;
	public double height;
	public double depth;
	public String manufacturer;
	public String model;

	
	/**
	 * @param nativeResolution
	 * @param weight
	 * @param width
	 * @param height
	 * @param depth
	 * @param manufacturer
	 * @param model
	 */
	public Television(Resolution nativeResolution, double weight, double width, double height, double depth,
			String manufacturer, String model) {
		this.nativeResolution = nativeResolution;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.manufacturer = manufacturer;
		this.model = model;
	}
	
	
	
	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	public double getWeight() {
		return weight;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getDepth() {
		return depth;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	
	public void turnOnOff(boolean on_off) {
		String switched = on_off == true ? "turned on" : "turned off";
		System.out.println("The TV is actually " + switched);
	}
		
	
}
