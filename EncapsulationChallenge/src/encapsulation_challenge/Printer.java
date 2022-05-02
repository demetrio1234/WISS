package encapsulation_challenge;

public class Printer {

	private int tonerPercentage;
	private int printedPages;
	private boolean duplex;
	
	/**
	 * @param tonerPercentage
	 * @param duplex
	 */
	public Printer(int tonerPercentage, boolean duplex) {
		this.tonerPercentage = (tonerPercentage < 0 || tonerPercentage > 100) ? -1 : tonerPercentage ;
		this.printedPages = 0;
		this.duplex = duplex;
	}
	
	public int refillToner(int tonerAmount) {
		if ((tonerAmount > 0 && tonerAmount <= 100) && (this.tonerPercentage+tonerAmount <= 100 )) {
			return this.tonerPercentage += tonerAmount;
		}else {
			System.out.println("Invalid value");
			return -1;
		}
	}
	
	
	public void fillUpToner() {
		if (this.tonerPercentage == 0 || this.tonerPercentage <= 10) {
			this.tonerPercentage = 100;
		}else {
			System.out.println("You've got still enough toner, please be eco-friendly :) ");
		}
	}
	
	/**
	 * print()
	 * it assumes that every printed page will consume 1% of the toner
	 * @param numberOfPages
	 */
	public void print(int numberOfPages) {
		if (this.tonerPercentage - numberOfPages <= 0 ) {
			System.out.println("The toner isn't enough for this task, please refill the printer before");
		}else if (this.duplex){
			numberOfPages = (numberOfPages / 2) + (numberOfPages % 2);
			this.tonerPercentage-=numberOfPages;
			this.printedPages+=numberOfPages;
		}else if (!this.duplex) {
			this.tonerPercentage-=numberOfPages;
			this.printedPages+=numberOfPages;
		};
	}

	public void getTonerPercentage() {
		System.out.println("Your toner percentage is " + this.tonerPercentage + "%");
	}

	public void getPrintedPages() {
		System.out.println("You've printed " + this.printedPages + " pages");
	}

	public void getIsDuplex() {
		if (duplex) {
			System.out.print("This is a duplex printer ");
		}else {
		System.out.print("This is NOT a duplex printer ");
		}
	}
	
	
}
