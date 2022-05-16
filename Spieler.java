package carta_sasso_forbisi_extended;

import java.util.Scanner;

import carta_sasso_forbisi_extended.SpielZuge.WAHL;

public class Spieler extends Teilnehmer{
	
	Scanner in;
	
	/**
	 * Constructor der Klasse Spieler
	 * @param nickname
	 */
	public Spieler(String nickname) {
		super(nickname, 0, 0, 0); //Hier wird dem SuperConstructor den Parameter Nickname übergeben und die andere 3 Werte werden auf 0 gesetzt
		in = new Scanner(System.in);
	}
	
	
	public WAHL getWahl(){
		
		System.out.println("Wähl deinen nächsten Zug (Schere / Stein / Papier)");
	
		String spielerWahl = in.nextLine().trim().toUpperCase();
			
		switch (spielerWahl) {
			//return funktioniert gleich wie ein break in einer Methode
			case "SCHERE" : 
				return WAHL.SCHERE;
			case "STEIN" :
				return  WAHL.STEIN;
			case "PAPIER" : 
				return  WAHL.PAPIER;
		}
			
		//falls keine der oben beschriebene Situationen betroffen seien sollte, man geht davon aus, dass diese eine ungultige Eingabe seien muss
		System.out.println("Ungultige Eingabe!");
	
		//mit folgendem Befehl wird die Methode erneut gestartet
		return getWahl();
	}

		//GETTER UND SETTER
		
		//TODO Methoden irgendwo nutzen
		@Override
		public String getNickname() {
			//Hier wird die entsprechende Methode der Superklasse overridden
			return super.getNickname();
		}


		@Override
		public int getGewinne() {
			//Hier wird die entsprechende Methode der Superklasse overridden
			return super.getGewinne();
		}


		@Override
		public void setGewinne(int gewinne) {
			//Hier wird die entsprechende Methode der Superklasse overridden
			super.setGewinne(gewinne);
		}


		@Override
		public int getSchlappe() {
			//Hier wird die entsprechende Methode der Superklasse overridden
			return super.getSchlappe();
		}


		@Override
		public void setSchlappe(int schlappe) {
			//Hier wird die entsprechende Methode der Superklasse overridden
			super.setSchlappe(schlappe);
		}


		@Override
		public int getPatte() {
			//Hier wird die entsprechende Methode der Superklasse overridden
			return super.getPatte();
		}


		@Override
		public void setPatte(int patte) {
			//Hier wird die entsprechende Methode der Superklasse overridden
			super.setPatte(patte);
		}
	
}
