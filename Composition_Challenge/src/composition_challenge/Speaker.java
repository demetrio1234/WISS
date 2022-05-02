package composition_challenge;

public class Speaker {

	public int numberDriver;
	public String powerSupply;
	/**
	 * @param numberDriver
	 * @param powerSupply
	 */
	public Speaker(int numberDriver, String powerSupply) {
		this.numberDriver = numberDriver;
		this.powerSupply = powerSupply;
	}
	
	public int getNumberDriver() {
		return numberDriver;
	}
	
	public String getPowerSupply() {
		return powerSupply;
	}
	
	public void playSomeMusic() {
		System.out.println("Some music is being played");
		
		double  music = (int)(Math.random()*4);
		
		String mType = music < 1 ? TypeOfMusic.CLASSIC.name() : music < 2 ? TypeOfMusic.ROCK.name() : music < 3 ? TypeOfMusic.DANCE.name() : TypeOfMusic.TECHNO.name() ;
		
		System.out.println("This type of music: " + mType);
	}
	
}

		//String year = credits < 30 ? "freshman" : credits <= 59 ? "sophomore" : credits <= 89 ? "junior" : "senior";
