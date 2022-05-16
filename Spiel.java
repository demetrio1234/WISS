package carta_sasso_forbisi_extended;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import carta_sasso_forbisi_extended.SpielZuge.WAHL;
import carta_sasso_forbisi_extended.SpielZuge.RESULTAT;;

public class Spiel {
	
	private static Scanner in = new Scanner(System.in); //Das Objekt in der Klasse Scaner wird deklariert und instanziert
	
	private static Spieler benutzer; //Das Objekt benutzer der Klasse Spieler wird deklariert aber noch nicht instanziert  
	
	private static Computer computer = computerNameSetzen(); //Das Objekt computer der Klasse Computer wird deklariert, während die Instanzierung wird der Methode computerNameSetzen() delegiert
	
	private int schwierigkeit = 1; //schwierigkeit(in);
	
	/**
	 * Erlaubt dem Spieler die Schwierigkeit einzusetzen, dies geschieht durch den Aufruf einer anderen Methode (Delegation)
	 * @param
	 */
	public void setSchwierigkeit() {
		this.schwierigkeit = schwierigkeit(in);
	}
	
	private WAHL spielerWahl;
	private WAHL computerWahl;
	private RESULTAT resultat;

	private static int gewinne;
	private static int schlappe;
	private static int ununterschiede;
	
	static ArrayList<String> tabelle = new ArrayList<String>();

	static int hintereinandereVerloreneRunde = 0; //Ein static Zähler
	
	
	/*
	* Diese Methode eledigt den Auftrag einer anderen Methode (Delegation) und nimmt die Eingabe des Benutzers durch das Objekt in der Klasse Scanner ein
	* @param in
	*/
	public static int schwierigkeit(Scanner in) {
		
		System.out.println("Bitte wähl das Schwierigkeitsgrad (1 bis 9) : ");
		
		int level = 0;
		
		boolean istEineZahl = false;
		
		while((istEineZahl == false) && ((level < 1) || (level > 10))) {
			
			try {
				//Hier sollte man überprüfen ob die Zahl zwischen 1 und 10 liegt
				
				in = new Scanner(System.in);
				
				//in.nextLine();
				
				level = in.nextInt();
					
				istEineZahl = true;
				
				System.out.println("Deine ausgewählte Stufe ist: " + level
						+ "\nDass heisst, wenn du 3 Mal hintereinander verlierst,\n"
						+ "wird dir die Mögligkeit gegeben, eine Zahl zwischen 1 und \n"
						+ level +" einzugeben und wenn diese gleich wie \n"
						+ "die vom Computer gewählten Zahl ist, wird die Tabelle der\n"
						+ "Resultaten auf Null gesetzt\n\n");
					
			}catch (Exception e) {
					
				System.out.println("Bitte eine Zahl zwischen 1 und 10 eingeben");
					
				istEineZahl = false;
				
				//in.close();
				
			}
				
		}
		
		return level;
	}
	

	/**
	 * Ergänzt die Deklaration des Objekts Computer
	 * @return new Computer();
	 */
	public static Computer computerNameSetzen() {
		return new Computer();
	}
	
	/**
	 * Setzt den Nickname des Spielers ein, dies durch das Anwenden eines Objekt Scanner namens "in"
	 * und gibt ein Feedback in der Konsole mit den Namen der 2 Teilnehmern
	 * @param in
	 */
	public void nicknameEintippen(Scanner in) {
		
		System.out.println("Tipp mal deinen Nickname ein: ");
		
		String input = in.next();
		
		String nickname = input != null ?  input : "Spieler";
		
		benutzer = new Spieler(nickname);
		
		System.out.println("Willkommen " + benutzer.getNickname() + "! Du spielst heute gegen den " + computer.getNickname());		
		
	}
	
	/**
	 * Hier wird überprüft, ob der Spieler bereit zu spielen ist oder die Anleitungen noch ein Mal lesen will
	 */
	public static void spielAnfangen(){
		
		System.out.println("Willkommen bei Schere Stein Papier der Topomedics AG \u00a9,\n\nWillst du schon spielen oder die Anleitungen lesen?\n\n"
				+ "Typp mal \"Anleitungen\" oder \"a\" um diese zu lesen, \"spielen\" oder \"s\" wenn du spielen willst.");
		
		String anfang = in.next().trim().toUpperCase();
		
		boolean bereitZuSpielen = false;
		
		while(bereitZuSpielen == false) {
			
			switch (anfang) {
			
			case "A" : case "ANLEITUNGEN" : 
				
				Anleitungen a = new Anleitungen();
				
				System.out.println(a.zeigAnleitungen());
				
				break;
				
			case "S" : case "SPIELEN" : 
				
				bereitZuSpielen = true;
				
				//startSpielen(in) ;
				
				break;
				
			default : System.out.println("Ungultige Eingabe!");
				
				System.out.println("Noch mal, willst du spielen oder die Anleitungen lesen?");
				
				anfang = in.next().toUpperCase();
				
				//break;
			}
		
			System.out.println("Bist du bereit zu spielen? (J/N)");
			bereitZuSpielen = (in.next().toUpperCase().trim().charAt(0) == 'J') ? true : false;
		}
		
		System.out.println("Du bist bereit zu spielen, geh'mir los! ");
			
		startSpielen(in);
		
	}
	
	//TODO Methode umbenennen, es ist verwirrend, da diese Methode sich eigentlich weiterSpielen heissen sollte
	/**
	 * Diese Methode startet im Tat das Spiel (nach Delegation der oberen Methode)
	 * @param in
	 */
	public static void startSpielen(Scanner in) {
		
		//Scanner in = new Scanner(System.in);
		
		Spiel spiel = new Spiel();
		
		char schluss = ' ';
		
		while (schluss != 'J'){
		
			spiel.weiterSpielen();
			
			System.out.println("Willst du das Spiel enden? J/N");
			
			schluss = in.next().toUpperCase().charAt(0);

		}
		
		ausgabeResulatatenSammlung();
	
	}
	
	//TODO Methode umbenennen
	/**
	 * Mit dieser Methode wird am Ende jeder Runde überprüft, ob der Spieler/Benutzer noch eine Runde spielen will
	 */
	public  void weiterSpielen(){
		spielerWahl = benutzer.getWahl();
		computerWahl = computer.getWahl();
		resultat = getResultat();
		rundenAusgeben();
		resultatenSammeln();
	}
	
	/**
	 * Mit dieser Methode werden die Ergebnisse bei jeder Runde überprüft und als RESULTAT returniert
	 * @return RESULTAT
	 */
	private RESULTAT getResultat(){
		if (computerWahl == spielerWahl) {
			return RESULTAT.UNUNTERSCHIED;
		}
		
		switch (spielerWahl){	
		case STEIN : 
			return (computerWahl == WAHL.SCHERE ? RESULTAT.GEWONNEN : RESULTAT.VERLOREN);
		
		case PAPIER :
			return (computerWahl == WAHL.STEIN ? RESULTAT.GEWONNEN : RESULTAT.VERLOREN);
		
		case SCHERE :
			return (computerWahl == WAHL.PAPIER ? RESULTAT.GEWONNEN : RESULTAT.VERLOREN);
		}
		
		//Es kommt niemals vor, dient nur dem Compiler als erforderlichen return, um die Methode korrekt compilieren zu können
		return RESULTAT.VERLOREN;
	}
	
	/**
	 * Hier wird das Ergebnis der Runde in der Console dargestellt
	 */
	public void rundenAusgeben(){
		switch (resultat){
			case GEWONNEN : System.out.println(spielerWahl + " gewinnt gegen " + computerWahl + ". Spieler hat gewonnen.");
			break;
		
			case VERLOREN : System.out.println(spielerWahl + " verliert gegen " + computerWahl + ". Computer hat gewonnen.");
			break;
		
			case UNUNTERSCHIED : System.out.println(spielerWahl + " ist gleich stark wie " + computerWahl + ". Niemand hat gewonnen.");
			break;
		}
	}
	
	/**
	 * Mit dieser Methode werden die Ergebnisse in eine ArrayList gespeichert
	 */
	private void resultatenSammeln(){
		
		String spieler = "";
		String cpu = "";
		String patte = "";
		
		
		if (resultat == RESULTAT.GEWONNEN){
			
			gewinne ++;
			
			spieler = "X";
			
			tabelle.add("|   "+(gewinne+schlappe+ununterschiede)+"   |    "+spieler+"    |     |       |\n");
			
			hintereinandereVerloreneRunde = 0;
			
		}else if (resultat == RESULTAT.VERLOREN){
			
			schlappe ++;
			
			cpu = "X";
			
			tabelle.add("|   "+(gewinne+schlappe+ununterschiede)+"   |         |  "+cpu+"  |       |\n");
			
			hintereinandereVerloreneRunde ++;
			
		}else {
			
			ununterschiede ++;
		
			patte = "X";
			
			tabelle.add("|   "+(gewinne+schlappe+ununterschiede)+"   |         |     |    "+patte+"  |\n");
			
			hintereinandereVerloreneRunde = 0;
		}
		
		benutzer.setGewinne(gewinne);
		
		computer.setGewinne(schlappe);
		
		benutzer.setSchlappe(schlappe);
		
		computer.setSchlappe(gewinne);
		
		benutzer.setPatte(ununterschiede);
		
		computer.setPatte(ununterschiede);
		
		StatisticsTabel.resultsTable(tabelle,((gewinne+schlappe+ununterschiede-1)));
		
		if(hintereinandereVerloreneRunde == 1) { //TODO Schwierigkeit anstatt 1 codieren
			
			Random bombe;
			
			hintereinandereVerloreneRunde = 0;
			
			int salz = 0;
			
			System.out.println("Gib mal eine Zahl zwischen 1 und " + schwierigkeit + " ein, wenn du diese rätst werden alle verlorene und gewonne Runden auf Null gesetzt!");
				
			bombe = new Random();
				
			boolean istEineZahl = false;
				
			while((istEineZahl == false) && ((salz < 1) || (salz > 10))) {
					
				try {
						
					salz = in.nextInt();
						
					istEineZahl = true;
					
					System.out.println("Deine ausgewählte Zahl ist: " + salz);
						
				}catch (Exception e) {
						
					System.out.println("Bitte eine Zahl zwischen 1 und "+ salz +" eingeben");
						
					istEineZahl = false;
						
				}
					
			}
			
			
			//random.nextInt(max - min + 1) + min TODO diese Zeile auf dem Nutzen überprüfen
			
			int zufallZahl = (bombe.nextInt(schwierigkeit+1));
			
			System.out.println("Deine Zahl ist " + salz + " und die vom Computer ausgewählte Zahl ist " + zufallZahl);
			
			if (salz == zufallZahl) {
				
				benutzer.setGewinne(0);
					
				computer.setGewinne(0);
					
				benutzer.setSchlappe(0);
					
				computer.setSchlappe(0);
					
				benutzer.setPatte(0);
					
				computer.setPatte(0);
				
				gewinne = 0;
				
				schlappe = 0;
				
				ununterschiede = 0;
				
				tabelle.clear();

			}
		}
	}
	
	/**
	 * Diese Methode zeigt am Ende des Spiels wer gewonnen hat und stellt die Tabelle der Ergebnisse in die Console dar
	 */
	public static void ausgabeResulatatenSammlung(){
		
		StatisticsTabel.resultsTable(tabelle);
		
		String ausgabe = gewinne < schlappe ? "Ich habe gewonnen!!!!" : gewinne == schlappe ? "Patte, niemand hat gewonnen!!!!" : "Du hast gewonnen!!!!";
		
		System.out.println("FERTIG! " + ausgabe);
		
		System.out.println("Du hast " + benutzer.getGewinne() + " Mal gewonnen, "+ benutzer.getSchlappe() + " Mal verloren und " + benutzer.getPatte() + " Mal eine Patte gemacht\n");
		
		System.out.println("Dein Gegner hat " + computer.getGewinne() + " Mal gewonnen, "+ computer.getSchlappe() + " Mal verloren und " + computer.getPatte() + " Mal eine Patte gemacht\n");
		
	}

}
