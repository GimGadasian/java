import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String name;
	String address;
	int money; 
	int bonusPoint;
	// Product[] cart = new Product[10];
	
	ArrayList list  = new ArrayList(); // object array
	Buyer(){
		
	}
	
	Buyer(String id, String name, int money, int bonusPoint) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//cart[i++] = p;
		list.add(p);
	}
}
