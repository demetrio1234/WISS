package carta_sasso_forbisi_extended;

import java.util.Scanner;

public class Main {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
				
		Spiel spiel = new Spiel();
		
		spiel.nicknameEintippen(in);
		
		spiel.setSchwierigkeit();
		
		Anleitungen anleitungen = new Anleitungen();
		
		System.out.println(anleitungen.zeigAnleitungen());
		
		Spiel.spielAnfangen();
		
	}
	
}
