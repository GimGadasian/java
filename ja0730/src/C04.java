
public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.id = "aaa";
		b.pw = "1111";
		b.buyerName = "hong";
		
		Tv t = new Tv();
		b.buy(t);
		
		b.buy(new Computer());
		System.out.println("잔액: "+b.money);
		System.out.println("적립금: "+b.bonusPoint);
	}

}
