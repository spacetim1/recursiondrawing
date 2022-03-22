/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king", "ace"};
		String[] suits = {"club", "spade", "heart", "diamond"};
		int[] pointValues = {10,11,12,1};
		Deck test1 = new Deck(ranks, suits, pointValues);
		
		System.out.println(test1.isEmpty());
		System.out.println(test1.size());
		
		for(int i = 0; i < (ranks.length)*(suits.length); i++) {
			System.out.println(test1.deal());
		}


	}
}
