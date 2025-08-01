
public class Buyer {
	String id;
	String pw;
	String buyerName;
	String address;
	String tel;
	int money = 1000000000;
	int bonusPoint = 0;
	/*
	void buy(Tv t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	
	void buy(Audio a) {
		money -= a.price;
		bonusPoint += a.bonusPoint;
	}
	
	void buy(Computer c) {
		money -= c.price;
		bonusPoint += c.bonusPoint;
	}
	*/
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
	
}
