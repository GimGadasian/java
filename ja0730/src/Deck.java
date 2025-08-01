
public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"SPADE", "HEART", "DIA", "CLOVER"};
	
	Deck() { // constructor
		for (int i=0; i<52; i++) {
			c[i] = new Card(i%13+1,  shape[i/13]);
		}
	} // constructor

	void shuffle() { // shuffle
		Card temp = null;
		int rand = 0;
		for (int i=0; i<300; i++) {
			rand = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rand];
			c[rand] = temp;
		}
	} // shuffle
	
	
	Card draw_single() { // randomly
		int index = (int)(Math.random()*52);
		return c[index];
	}
	
	Card[] draw_5() {
		Card[] c_5 = new Card[5];
		for (int i=0; i<5; i++) {
			c_5[i] = c[i];
		} return c_5;
	}
	
	public void card_print() {
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i].getN_num()[c[i].getNumber()]+", "+c[i].getKind());
		}
	}
	
}
