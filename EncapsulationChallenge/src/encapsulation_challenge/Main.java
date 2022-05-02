package encapsulation_challenge;

public class Main {

	public static void main(String[] args) {
		
		Printer printer = new Printer(100, false);
		
		printer.getIsDuplex();
		
		printer.getTonerPercentage();
		
		printer.fillUpToner();
		
		printer.print(99);
		
		printer.getPrintedPages();
		
		printer.getTonerPercentage();
		
	}

}
