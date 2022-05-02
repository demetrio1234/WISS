package polymorphism_excercise;

public class Mitsubishi extends Car{
    public Mitsubishi(){
        //int cilinders, String name
        super(4,"Mitsubishi");
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