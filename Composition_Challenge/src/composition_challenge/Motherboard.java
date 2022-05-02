package composition_challenge;

public class Motherboard {

	private String model;
	private String manufacturer;
	private int ramSlots;
	private int pciSlots;
	private String biosName;
	
	/**
	 * @param model
	 * @param manufacturer
	 * @param ramSlots
	 * @param pciSlots
	 * @param biosName
	 */
	public Motherboard(String model, String manufacturer, int ramSlots, int pciSlots, String biosName) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.pciSlots = pciSlots;
		this.biosName = biosName;
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}


	public int getRamSlots() {
		return ramSlots;
	}

	public int getPciSlots() {
		return pciSlots;
	}
	
	public String getBiosName() {
		return biosName;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Your program " + programName + " is loading... Please wait");
	}
	
}
