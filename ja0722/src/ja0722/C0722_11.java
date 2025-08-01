package ja0722;

import java.util.Scanner;

public class C0722_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		boolean pow = false;
//		if (!pow) {
//			pow = true;
//		}
//		
//		int input = sc.nextInt();
		
		/*
		int rnum = (int)(Math.random()*100)+1;
		System.out.println(rnum);
		*/
		
		/*
		int rnum1 = (int)(Math.random()*10)+1;
		System.out.println(rnum1);
		// 0.0*10 <= Math.random()*10 < 1*10
		*/
		
		/*
		if (input == rnum1) {
			System.out.println(":D");
		} System.out.println(":(");
		*/
		
		// rock(0) scissors(1) paper(2)
		String result ="";
		int rsp = (int)(Math.random()*3);
		System.out.print("0/1/2: ");
		int my_rsp = sc.nextInt();
		
		switch (rsp - my_rsp) {
	    case 0:
	        result = ":|"; 
	        break;
	    case -2 :case 1:
	        result = ":D"; 
	        break;
	    default:
	        result = ":("; 
	        break;
	}
		
		System.out.println(rsp);
		System.out.println(result);
	}
	
}
