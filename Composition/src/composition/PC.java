package composition;

public class PC {
	
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotherboard;
	
	
	/**
	 * @param theCase
	 * @param theMonitor
	 * @param theMotherboard
	 */
	public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}

	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
		
	}


	private void drawLogo() {
		theMonitor.drawPixelAt(150, 150, "BLUE");
		System.out.println("SUPER_PiPpO_PC \ua009");
		
	}
	
	
	
	
	
	
	
}
