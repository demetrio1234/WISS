package polymorphism_excercise;

public class Holden extends Car{
    public Holden(){
        //int cilinders, String name
        super(6,"Holden");
    }
    
    @Override
    public String startEngine(){
	    return getClass().getSimpleName() + "'s engine has been started";
	}
    @Override
    public String accelerate(){
	    return getClass().getSimpleName() + " is accelerating";
	}
	@Override
	public String brake(){
		return getClass().getSimpleName() + " is slowing down";
	}
}