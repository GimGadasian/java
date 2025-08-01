package ja0730;

public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE", "HEART", "DIA", "CLOVER"};
	
	
	Deck() { //default constructor
		for (int i=0; i<CARD_NUM; i++) {
			c[i] = new Card(i % 13 + 1, shape[i / 13]);
		}
	} //default constructor
	
	void shuffle() { // shuffle
		Card temp = null;
		int rnum = 0;
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;	
		}
	} // shuffle
	
	//카드1장 뽑기: 지정
		Card pick(int index) {
			if(index>52 || index<0) {
				return c[0];
			}else {
				return c[index]; // 100
			}
		}
		
		//카드1장 뽑기: 랜덤
		Card pick() {
		   int index = (int)(Math.random()*52);
		   return c[index];
		}
	
	void deck_print() {
	    for (int i = 0; i < CARD_NUM; i++) {
	        //System.out.printf("[%s, %s]\n", c[i].number, c[i].kind);
	    	System.out.println(c[i]);

	    }
	} // print
	
	
}

