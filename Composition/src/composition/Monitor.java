package composition;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	
	/**
	 * @param model
	 * @param manufacturer
	 * @param size
	 * @param resolution
	 */
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String colour) {
		System.out.println("The choosen colour is "+ colour + ", and it'll be shown at position on the monitor: \n X:"+ x + "\n Y:" + y);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	
	
	
	
	
	
	
	
	
}
