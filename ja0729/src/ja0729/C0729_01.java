package ja0729;

import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 10;
		double[] all = new double[4];
		Calc c = new Calc();
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.println("5. print all");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			c.add(a, b);
			break;
		case 2:
			c.subt(a, b);
			break;
		case 3:
			c.mult(a, b);
			break;
		case 4:
			c.div(a, b);
			break;
		case 5:
			c.all(a, b, all);
			break;
		}

	}

}
