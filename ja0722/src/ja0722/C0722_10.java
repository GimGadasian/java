package ja0722;

import java.util.Scanner;

public class C0722_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input strings: ");
		String input = sc.next();
		
		char ch = ' ';
		if (input !=null && !input.equals("")) {
			ch = input.charAt(0);
		}
		
		
		System.out.println("print: "+ch);
		
		
	}
}
