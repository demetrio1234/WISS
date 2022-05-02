package composition_challenge;

public class Floor {
	
	//typeOfFloor //i.e. parquet, hardFloor and so on....
	
	public double width;
	public double length;
	public double height;
	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public Floor(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getHeight() {
		return height;
	}
	
	

}
