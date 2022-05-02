package composition_challenge;
public class Room {
	
	//--essentials--
		public Floor theFloor;
		public Door theDoor;
		public Window theWindow;
		public Balcony theBalcony;
//
//	//--furniture--
//		public Cupboard theCupboard;
//		public Couch theCouch;
//		public Bookcase theBookcase;
//		public Shelf theShelf;
//
//	//--accessories--
//		public Paint thePaint;
//		public Telefon theTelefon;
//		public Television theTelevision;
//		public Speaker theSpeaker;
//		public Amplifier theAmplifier;
//		public PC thePc;
//		public Printer thePrinter;
//		public Modem theModem;
		
/**
 * @param theFloor
 * @param theDoor
 * @param theWindow
 * @param theBalcony
 */
public Room(Floor theFloor, Door theDoor, Window theWindow, Balcony theBalcony) {
	this.theFloor = theFloor;
	this.theDoor = theDoor;
	this.theWindow = theWindow;
	this.theBalcony = theBalcony;
}
		
public void openTheDoor() {
	theDoor.openTheDoor();
}

}
