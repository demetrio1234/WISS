package carta_sasso_forbisi_extended;

public  class Teilnehmer {
		
	private String nickname;
	private int gewinne;
	private int schlappe;
	private int patte;
	
	/*
	* Constructor der Klasse Teilnehmer
	* @param String nickname
	* @param int gewinne
	* @param int schlappe
	* @param int ununterschiede
	*/
	public Teilnehmer(String nickname, int gewinne, int schlappe, int patte) {
		this.nickname = nickname;
		this.gewinne = gewinne;
		this.schlappe = schlappe;
		this.patte = patte;
	}
	
	
	/**
	 * Getter für das Attribut Nickname
	 * @return
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Getter für das Attribut gewinne
	 * @return gewinne
	 */
	public int getGewinne() {
		return gewinne;
	}
	
	/**
	 * Setter für das Attribut gewinne
	 * @param gewinne
	 */
	public void setGewinne(int gewinne) {
		this.gewinne = gewinne;
	}
	
	/**
	 * Getter für das Attribut schlappe
	 * @return
	 */
	public int getSchlappe() {
		return schlappe;
	}

	/**
	 * Setter für das Attribut schlappe
	 * @param schlappe
	 */
	public void setSchlappe(int schlappe) {
		this.schlappe = schlappe;
	}
	
	/**
	 * Getter für das Attribut patte
	 * @return
	 */
	public int getPatte() {
		return patte;
	}
	
	/**
	 * Setter für das Attribut patte
	 * @param patte
	 */
	public void setPatte(int patte) {
		this.patte = patte;
	}

}
