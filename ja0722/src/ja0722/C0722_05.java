package ja0722;

import java.util.Scanner;

public class C0722_05 {
	public static void main(String[] args) {
		int share = 10/8;
		int remain = 10%8;
		System.out.println("share, remain: "+share+" ,"+remain);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input number: ");
		int input = sc.nextInt();
		if (input%10 < 0) {
			System.out.println("smaller than 10");
		} else {
			System.out.println("bigger than 10");
		}
		
	}
}
