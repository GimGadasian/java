package ja0728;

import java.util.Scanner;

public class C0728_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		double result = 0;
		
	
		System.out.print("1st num: ");
		int x = sc.nextInt();
		System.out.print("2nd num: ");
		int y = sc.nextInt();
		
		System.out.println("1. add\n2. subtract\n3. multiply\n4. divide");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			
			result = c.add(x, y);
			result = (int)result;
			
			break;
		case 2: 
			System.out.println("2. subtract");
			result = c.subt(x, y);
			result = (int)result;
			break;
		case 3:
			System.out.println("3. multiply");
			result = c.mult(x, y);
			result = (long)result;
			break;
		case 4:
			System.out.println("4. division");
			result = c.div(x, y);
			result = Math.round(result * 100) / 100.0;

			break;
		
		}
		System.out.println(result);
		
			
		
	}

}
