package carta_sasso_forbisi_extended;

import java.util.Random;

import carta_sasso_forbisi_extended.SpielZuge.WAHL;

public class Computer extends Teilnehmer{
	
	private Random zufall; //Ein Objekt der Klasse Random wird deklariert aber noch nicht instanziert 
	
	/**
	 * Kein Parameter, weil der Name immer Computer ist und die andere Parametern auf 0 gesetzt werden
	 */
	public Computer() {
		
		super("Computer", 0, 0, 0); //Dem Superconstructor werden immer diese 4 Parametern zugewiesen
		
		zufall = new Random(); //Das Objekt in der Klasse Random wird instanziert
	}
	
	/*
	 * Hiermit wird die Wahl des Computers erarbeitet und als WAHL returniert
	 */
	public WAHL getWahl(){
		
		int wahl = 1  + zufall.nextInt(3);
		
		switch (wahl) {
			case 1 : return WAHL.SCHERE;
			case 2 : return WAHL.STEIN;
			}
			
			//Damit die Methode über der return verfügt, falls keine der beiden CASE btroffen seien sollten
			return WAHL.PAPIER;
	}
	
}
