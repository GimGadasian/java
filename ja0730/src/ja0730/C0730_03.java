package ja0730;

public class C0730_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.shuffle();
		Card c_one = d.pick(34);
		System.out.println("34번 지정 : "+c_one);
		System.out.println();
		c_one = d.pick();
		System.out.println("랜덤 : "+c_one);
	}

}