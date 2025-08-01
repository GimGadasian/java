import java.util.Scanner;
public class C0731_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Buyer b1 = new Buyer("hong", "Gildong", 10000000, 1000);
		System.out.println("Shopping Mall");
		System.out.printf("Welcome, %s!\n", b1.name);
		loop:while (true) {
			System.out.printf("Your left over money: %d, your bonus point: %d\n", b1.money, b1.bonusPoint);
			System.out.println("1. Tv\n2.Audio\n3. Computer\n4. Cart\n0. Quit");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				b1.buy(new Tv());
				System.out.println("Bought a Tv!");
				
				break;
			case 2:
				b1.buy(new Audio());
				System.out.println("Bought a Audio!");
				
				break;
			case 3:
				b1.buy(new Computer());
				System.out.println("Bought a Computer!");
				
				break;
			case 4:
				System.out.println("Cart");
				for (int i = 0; i < b1.list.size(); i++) {  
				    //System.out.printf("%s - %d($)\n", b1.cart[i].name, b1.cart[i].price);
					System.out.printf("%s - %d($)\n", ((Product)b1.list.get(i)).name, ((Product)b1.list.get(i)).price);
				}

				if (b1.list.isEmpty()) {
				    System.out.println("Your cart is empty.");
				}
				break;

			default:
				System.out.println("Thank you for Shopping!");
				break loop;
			}
		}
		
	}

}
