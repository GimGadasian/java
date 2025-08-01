
public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.shuffle();
		
		Card c_one = d.draw_single();
		System.out.println(c_one);
		
		Card[] player1 = d.draw_5();
		System.out.print("player1: ");
		for(int i=0;i<player1.length;i++) {
			System.out.print(player1[i].getN_num()[player1[i].getNumber()]+","+
					player1[i].getKind()+"  ");
		}
			
		d.card_print();
	}
}


