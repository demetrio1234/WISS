package composition_challenge;

public class Shelf {
	
	public int numberOfShelfs;

	/**
	 * @param numberOfShelfs
	 */
	public Shelf(int numberOfShelfs) {
		this.numberOfShelfs = numberOfShelfs;
	}

	public int getNumberOfShelfs() {
		return numberOfShelfs;
	}
	
	public void putTakeAbook(boolean putTake) {
		String text = putTake == true ? "insert in " : "taken from" ;
		System.out.println("An object has been " + text + "the shelf");		
	}
	
	

}
