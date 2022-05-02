package polymorphism;

class Movie{
	
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "Plot of Jaws";
	}
}

class IndipendenceDay extends Movie{
	
	public IndipendenceDay() {
		super("IndipendenceDay");
	}
	
	public String plot() {
		return "Plot of Indipendence Day";
	}
	
}

class BladeRunner extends Movie{
	public BladeRunner() {
		super("Blade Runner");
	}
	
	public String plot() {
		return "Plot of Blade Runner";
	}
	
}

class StarWars extends Movie{
	
	public StarWars() {
		super("StarWars");
	}
	
	public String plot() {
		return "Plot of Star Wars";
	}
}


class Forgettable extends Movie{
	public Forgettable() {
		super("Forgettable");
	}
	
	//No plot();
}

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie # " + i + " is\t" + movie.getName() + "\nt\t" + movie.plot());
		}
	}

	public static Movie randomMovie() {
		
		int randomNumber = (int)(Math.random()*5 + 1);
		switch(randomNumber) {
		case 1 : return new Jaws();
		case 2 : return new IndipendenceDay();
		case 3 : return new BladeRunner();
		case 4 : return new StarWars();
		case 5 : return new Forgettable();
		}
		return null;
	}
	
}
