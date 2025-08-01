package ja0723;

import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("your score: ");
		
		int score = sc.nextInt();
		String plus = "";
		
		if (score >= 90) {
			if (score >= 95) {
				plus = "+";
			} System.out.println("A"+plus);
		}
		
		else if (score >= 80) {
			if (score >= 85) {
				plus = "+";
			} System.out.println("B"+plus);
		}
		
		else if (score >= 70) {
			if (score >= 75) {
				plus = "+";
			} System.out.println("C"+plus);
		}
		
		else if (score >= 60) {
			if (score >= 65) {
				plus = "+";
			} System.out.println("D"+plus);
		}
		
		else {System.out.println("F");}
		
		
		System.out.print("month: ");
		
		int month = sc.nextInt();
		String season = "";
		
		switch(month) {
		case 12: case 1: case 2:
			season = ("Winter");
			break;
		case 3: case 4: case 5:
			season = ("Spring");
			break;
		case 6: case 7: case 8:
			season = ("Summer");
			break;
		case 9: case 10: case 11:
			season = ("Autamn");
			break;
		default:
			System.out.println("1 to 12");
			break;
		}

		System.out.println(season);
	}
}
