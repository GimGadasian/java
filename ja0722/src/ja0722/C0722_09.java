package ja0722;

import java.util.Scanner;

public class C0722_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input string: ");
		String input = sc.next();
		String str1 = "c";
		char ch = 'c';
		
		if(input.equals(str1)) { // String 참조형 객체변수
			System.out.println("it's c.");
		} else {
			System.out.println("it's not c.");
		}
		
		if(input.equalsIgnoreCase(str1)) { // 대소문자 구
			System.out.println("it's c.");
		} else {
			System.out.println("it's not c.");
		}
	}
}
