package inheritance;

public class Dog extends Animal{

	
	private String tipo;
	private int peso;
	
	/**
	 * 
	 * @param name
	 * @param weightUnit
	 * @param family
	 * @param race
	 * @param tipo
	 * @param peso
	 */
	public Dog(String name, String weightUnit, String family, String race,String tipo, int peso) {
		super(name, weightUnit, family, race);
		
		this.tipo = tipo;
		this.peso = peso;
		
	}

	private void masticare() {
		System.out.println("Metodo privato masticare della classe figlia Dog");
	}
	
	@Override
	public void eat() {
		System.out.println("Metodo eat pubblico sovrascrittore del Metodo eat della classe figlia Dog");
		this.masticare();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Metodo pubblico <- walk() <- classe Dog");
		move("Km/h", 10);
	}
	
	public void run() {
		System.out.println("Metodo pubblico <- run() <- classe Dog");
		move("Km/h", 5);
	}
	
	
	
	
	
	
	
	
	

}
