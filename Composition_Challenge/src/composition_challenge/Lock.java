package composition_challenge;

public class Lock {

	public String typeOfKey; //european, usa and so on

	/**
	 * @param typeOfKey
	 */
	public Lock(String typeOfKey) {
		this.typeOfKey = typeOfKey;
	}

	public String getTypeOfKey() {
		return typeOfKey;
	}
	
	public void insertTheKey() {
		
	}
	
	public void turnTheKey(boolean direction) {
		
		String senseOfTurn = direction == true ? "right" : "left";
		
		System.out.println("The key has been turned " + senseOfTurn);
	}
	
	
}
