package ja0722;

import java.util.Scanner;

public class C0722_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int x = -10;
		int absX = x>=0?x:-x;
		System.out.println(absX);
		
		String result = x%2==0?"even":"odd";
		System.out.println(result);
		*/
		
		System.out.print("your score: ");
		int score = sc.nextInt();
		
		String pf = score>=60?"pass":"fail";
		//System.out.println(pf);
		
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int maxVal = (score>score2)?((score>score3)?score:score3):(score2>score3?score2:score3);
		
		System.out.println("biggest: "+maxVal);
	}
}
