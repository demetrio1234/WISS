package composition;

public class Main {

	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(15, 35, 45);
		Case theCase = new Case("ROG", "NVidia", "European 220V", dimensions);
		
		
		//Resolution(int width, int height)
		
		//String model, String manufacturer, int size, Resolution nativeResolution
		Monitor theMonitor = new Monitor("Star 24", "Samsung", 24, new Resolution(1920,1200));
		
		Motherboard theMotherboard = new Motherboard("XT-9080", "Asus", 4, 6, "Pippo_BIOS");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		
		//thePC.getTheMonitor().drawPixelAt(128, 546, "red");
		
		//thePC.getTheMotherboard().loadProgram("SUPER_PIPPO");
		
		//thePC.getTheCase().pressPowerButton();
		
		thePC.powerUp();
		
		
		
	}

}
