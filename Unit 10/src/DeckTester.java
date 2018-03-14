/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks1 = {"King, Four, Queen"};
		String[] suits1 = {"Heart, Spade, Diamond"};
		int[] values1 = {13, 4, 12};
		
		Deck test = new Deck(ranks1, suits1, values1);
		System.out.println(test);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
