package ja0722;

import java.util.Scanner;

public class C0722_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("month: ");
		int month = sc.nextInt();
		
		String season = "";
		switch(month) {
		case 12: case 1: case 2:
			season = "Winter";
			break;
		case 3: case 4: case 5:
			season = "Spring";
			break;
		case 6: case 7: case 8:
			season = "Summer";
			break;
		case 9: case 10: case 11:
			season = "Autamn";
			break;
		}
		System.out.print(season);
	}

}
