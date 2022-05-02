package composition_challenge;

public class Main {

	public static void main(String[] args) {
		
		Floor theFloor = new Floor(5, 4, 3.5);
		
		Lock theLock = new Lock("European");
		
		Door theDoor = new Door(theLock, "white");
		Window theWindow = new Window();
		Balcony theBalcony = new Balcony();
		
		
		Room room1 = new Room(theFloor, theDoor, theWindow, theBalcony);
		
		room1.theDoor.closeTheDoor();

	}

}
