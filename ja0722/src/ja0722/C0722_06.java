package ja0722;

import java.util.Scanner;

public class C0722_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char alpha = input.charAt(0);
		
		if((alpha >='a' && alpha <='z') ||  (alpha >='A' && alpha <='Z')) {
			System.out.println("valid");
		} else { System.out.println("invalid");
			}
		}
	}
