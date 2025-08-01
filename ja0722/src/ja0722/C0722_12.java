package ja0722;

import java.util.Scanner;

public class C0722_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("local tel: ");
		String tel = sc.next();
		
		String result = "";
		switch(tel) {
		case "02":
			result = "Seoul";
			break;
		case "031":
			result = "Gyeounggi";
			break;
		}
		System.out.print(result);
	}

}
