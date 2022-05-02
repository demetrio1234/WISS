
public class Banana extends Fruit {
	
	private String length;
	private String taste;
	
	
	public Banana(String color, String weightUnity, double price) {
		super(color, weightUnity, price);

	}

	public Banana(String color, String weightUnity) {
		super(color, weightUnity);

	}

	public Banana(String color) {
		super(color);

	}

	public Banana() {

	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

}
