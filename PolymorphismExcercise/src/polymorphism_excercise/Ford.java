package polymorphism_excercise;

public class Ford extends Car{
    public Ford(){
        //int cilinders, String name
        super(5,"Ford");
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