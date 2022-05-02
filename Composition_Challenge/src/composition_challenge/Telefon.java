package composition_challenge;

public class Telefon {
	
	public String telefonNumber;

	/**
	 * @param telefonNumber
	 */
	public Telefon(String telefonNumber) {
		this.telefonNumber = telefonNumber;
	}

	public String getTelefonNumber() {
		return telefonNumber;
	}
	
	public void call(String telefonnumber) {
		System.out.println("You're calling the number: " + telefonnumber);
	}

}
