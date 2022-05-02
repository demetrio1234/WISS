/**
 * 
 */

/**
 * @author demia
 *
 */
public class Rectangle extends Shape {
	
	public double lenght;
	public double width;
	
	public static int rectangleCounter = 0;
	
	/**This is the real Constructor on which every other Constructor should rely to instance new Objects
	 * @param x
	 * @param y
	 * @param lenght
	 * @param width
	 */
	public Rectangle(double x, double y, double lenght, double width) {
		super(x, y);
		this.lenght = lenght;
		this.width = width;
		rectangleCounter++;
	}

	/**This Constructor is relying on the first Constructor to instance a new Object with all parameters
	 * @param x
	 * @param y
	 * @param length
	 * @param width
	 */
	public Rectangle(double x, double y) {
		this(x, y,10.0,10.0);

	}

	public static int getRectangleCounter() {
		return rectangleCounter;
	}

	public static void setRectangleCounter(int rectangleCounter) {
		Rectangle.rectangleCounter = rectangleCounter;
	}

	
	
	
	
	
}
