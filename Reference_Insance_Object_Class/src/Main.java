
public class Main {

	public static void main(String[] args) {
		

	Rectangle rettangolo1 = new Rectangle(0, 0, 0, 0);
	Rectangle rettangolo2 = new Rectangle(0, 0, 0, 0);
	Rectangle rettangolo3 = new Rectangle(0, 0, 0, 0);
	Rectangle rettangolo4 = new Rectangle(0, 0, 0, 0);
	Rectangle rettangolo5 = new Rectangle(0, 0, 0, 0);
		
	
	/*These Output are syntactically correct but logically
	* useless since the variable is static, that means
	* the variable is always the same in memory
	*/
	System.out.println(rettangolo1.getRectangleCounter());
	
	System.out.println(rettangolo5.getRectangleCounter());
	
	
	//This is a syntactically and logically correct use of a static counter
	System.out.println(Rectangle.getRectangleCounter());
	
	
	/*
	 * A Scanner might also be declared as static, since it would be nice to
	 * use just one Scanner instead of instance every single time a new Scanner
	 */
	
		

	}
	
}
