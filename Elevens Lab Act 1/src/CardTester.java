/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test1 = new Card("Jack", "Diamonds", 11);
		Card test2 = new Card("Queen", "Hearts", 12);
		Card test3 = new Card("King", "Clubs", 13);

		System.out.println("Card one matches Card two: " + test1.matches(test2));
		
		System.out.println(test3.rank());
		
		System.out.println(test3.suit());
		
		System.out.println(test3.pointValue());
		
		System.out.println(test3.toString());
		

		
	}
}
