package composition_challenge;

public class Printer {

	private String model;
	private String manufacturer;
	private String refill;
	//toner
	
	/**
	 * @param model
	 * @param manufacturer
	 * @param refill
	 */
	public Printer(String model, String manufacturer, String refill) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.refill = refill;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getRefill() {
		return refill;
	}
	
	public void print(){
		System.out.println("Print some page");
	}
	
	
	
}
