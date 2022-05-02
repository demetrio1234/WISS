package inheritance;

public abstract class Animal {
	
	private String weightUnit;
	private String family;
	private String race;
	private String name;
	
	
	/**
	 * 
	 * @param name
	 * @param weightUnit
	 * @param family
	 * @param race
	 */
	public Animal(String name, String weightUnit, String family, String race) {	
		this.name = name;
		this.weightUnit = weightUnit;
		this.family = family;
		this.race = race;
	}


	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Metodo mangiare della superclasse Animal");
	}
	
	public void move(String speedUnit, int speed) {
		System.out.println("Metodo <- public void move() <- Animal \n @Parametri: String speedUnity: " + speedUnit + ", int speed: " + speed);
	}
	
	
	
	
	
	
	
	
}
