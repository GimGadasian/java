package ja0722;

import java.util.Scanner;

public class C0722_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		String jumin = "010101-4000000";
		String jumin2 = "020202-3000000";
		
		System.out.print("your jumin: ");
		String your_jumin = sc.next();
		char ch = your_jumin.charAt(7);
		if (ch%2 == 0) {
			System.out.println("female");
		} else {System.out.println("male");
			}
		*/
		System.out.print("your score: ");
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90) {
			
			result = ("A");
			if(score>=97) {result += "+";}
		} else if (score >= 80) {
			result = ("B");
			if(score>=87) {result += "+";}
		} else if (score >= 70) {
			result = ("C");
			if(score>=77) {result += "+";}
		} else if (score >= 60) {
			result = ("D");
			if(score>=67) {result += "+";}
		}	else  {
			result = ("F");
		}
		
		System.out.println(result);
	}
	
}