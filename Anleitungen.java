package carta_sasso_forbisi_extended;

public class Anleitungen {
	
	//Hier werden die 3 Teile der Anleitungen deklariert aber noch nicht instanziert
	private Titel titel;
	private Absatz absatz;
	private TiefgestelltesZeichen tiefgestelltesZeichen;
	
	/**
	 * Constructor der Anleitungen, hier werden Titel, Absatz und TiefgestelltesZeichen instanziert. Hier geschieht die Comnposition der Anleitungen
	 */
	public Anleitungen() {
		this.titel = new Titel();
		this.absatz = new Absatz();
		this.tiefgestelltesZeichen = new TiefgestelltesZeichen();
	}
	
	/**
	 * Hiermit werden die Teile der Anleitungen verkettet und als String returniert
	 * d.h. den Wert muss denn entweder in eine Variable vom Typ String gespeichert
	 * oder direkt in die Console dargestellt werden
	 */
	public String zeigAnleitungen() {
		return titel.getInhalt() + absatz.getInhalt() + tiefgestelltesZeichen.getInhalt();
	}
	

}
