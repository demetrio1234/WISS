package carta_sasso_forbisi_extended;

import java.util.ArrayList;

public class StatisticsTabel {
	
	/**
	 * Gibt eine Tabelle mit allen Ergebnissen des Spiels aus
	 * @param tabelle
	 * @param i
	 */
	public static void resultsTable(ArrayList<String> tabelle, int i) {
		
		//String leftAlignFormat = "| %-5d | %-7s | %-3s | %-5s |%n";

		System.out.format("+───────+─────────+─────+───────+%n");
		System.out.format("| RUNDE | SPIELER | CPU | PATTE |%n");
		System.out.format("+───────+─────────+─────+───────+%n");
		
		//tabelle.forEach((n) -> System.out.print(n));
		
		System.out.print(tabelle.get(i));
		
		System.out.format("+───────+─────────+─────+───────+%n\t\t\t\t\t\t\t\t\t\t\tEin Spiel von: Topomedics AG \u00a9\n\n");

	}
	
	/**
	 * Gibt aus bei jeder Runde das entsprechende Ergebnis
	 * @param tabelle
	 */
	public static void resultsTable(ArrayList<String> tabelle) {

		System.out.format("+───────+─────────+─────+───────+%n");
		System.out.format("| RUNDE | SPIELER | CPU | PATTE |%n");
		System.out.format("+───────+─────────+─────+───────+%n");
		
		for(String listItem : tabelle){
	            System.out.print(listItem);
        	}
		
		System.out.format("+───────+─────────+─────+───────+%n\t\t\t\t\t\t\t\t\t\t\t\tEin Spiel von: Topomedics AG \u00a9\n\n");
	}
	
}
