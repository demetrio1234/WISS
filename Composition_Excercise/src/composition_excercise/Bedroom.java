package composition_excercise;

public class Bedroom {
	
	//Wall Ceiling Bed Lamp
	
	private String name;
	
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	
	private Ceiling ceiling;
	
	private Bed bed;
	
	private Lamp lamp;

	/**
	 * @param name
	 * @param wall1
	 * @param wall2
	 * @param wall3
	 * @param wall4
	 * @param ceiling
	 * @param bed
	 * @param lamp
	 */
	public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	
	public Lamp getLamp() {
		return new Lamp(null, false, 0);
	}
	
	public void makeBed(){
		System.out.println("The bed is being made");
		bed.make();
	}
	
	

}
