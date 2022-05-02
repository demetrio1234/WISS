package composition_challenge;

public class Door {

	public Lock theLock;
	public String colour;
	/**
	 * @param theLock
	 * @param colour
	 */
	public Door(Lock theLock, String colour) {
		this.theLock = theLock;
		this.colour = colour;
	}
	public Lock getTheLock() {
		return theLock;
	}
	public String getColour() {
		return colour;
	}
	
	public void openTheDoor() {
		theLock.insertTheKey();
		theLock.turnTheKey(false);
		System.out.println("The door has been opened");
	}
	
	public void closeTheDoor() {
		theLock.insertTheKey();
		theLock.turnTheKey(true);
		System.out.println("The door has been closed");
	}
	
}
