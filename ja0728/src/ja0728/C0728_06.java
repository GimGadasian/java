package ja0728;

public class C0728_06 {

	public static void main(String[] args) {
		// object declaration
		Card c = new Card();
		c.kind = "spade";
		c.number = 1;
		
		Card c2= new Card();
		c2.kind = "spade";
		c2.number = 2;
		
		// .. 52 times
		
		// array declaration
		String[] shape = {"spade", "dia", "heart", "clover"};
		Card[] card = new Card[52];
		for (int i=0; i< card.length; i++) {
			card[i] = new Card();
			card[i].kind = shape[i%4];
			card[i].number = (i % 13) + 1;
		}
		
		// print cards
		for (int i = 0; i < card.length; i++) {
			System.out.printf("%6s: %2d\t", card[i].kind, card[i].number);
			if ((i+1)%4 == 0) {
				System.out.println();
			}
		}

	}

}
