package carta_sasso_forbisi_extended;

public class Absatz{
	
	private String inhalt;

	/**
	 * Constructor des Absatzes der Anleitungen
	 */
	public Absatz() {
		this.inhalt = "\n--START ANLEITUNGEN-- \n"
				+ "\n"
				+ "Regeln: \n"
				+ "\n"
				+ "Das Ziel der Spieler:innen liegt darin, eine höherwertige Geste als der Gegner zu spielen. So ist die Rangfolge: \n"
				+ "\n"
				+ " \n"
				+ "\n"
				+ "Stein schlägt Schere (Denn der Stein kann die Schere schleifen.) \n"
				+ "\n"
				+ "Schere schlägt Papier (Denn die Schere kann das Papier schneiden.) \n"
				+ "\n"
				+ "Papier schlägt Stein (Denn das Papier kann den Stein einwickeln.) \n"
				+ "\n"
				+ " \n"
				+ "\n"
				+ "Jedes Symbol verliert oder gewinnt gegen jeweils ein anderes Symbol. Hier entscheidest du zunächst, wie viele Runden gespielt werden sollten und am Schluss wird der Spieler mit den meisten Siegen als Gewinner bezeichnet! \n"
				+ "\n"
				+ "Viel Glück, und vor allem, viel Spass! \n"
				+ "\n"
				+ "--ENDE ANLEITUNGEN--\t\t\t";
	}
	
	/**
	 * wird benutzt um den Absatz der Anleitungen zu returnieren (um die Composition der Anleitungen zu ermöglichen)
	 * @return String value
	 */
	public String getInhalt() {
		return inhalt;
	}
	
}