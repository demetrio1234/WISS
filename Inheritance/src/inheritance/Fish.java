package inheritance;

public class Fish extends Animal {

	private String fins;
	private String gills;
	
	
	public Fish(String name, String weightUnit, String family, String race) {
		super(name, weightUnit, family, race);
		
	}
	
	
	public void rest() {
		
	}
	
	
	public void swim() {
		move("m/s", 2);
	}
	

}
