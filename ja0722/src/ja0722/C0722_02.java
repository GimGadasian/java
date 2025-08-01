package ja0722;

import java.util.Scanner;

public class C0722_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your name: ");
		String name = sc.next(); //nextLine
		
		System.out.print("your Korean score: ");
		double kor = sc.nextDouble();
		
		System.out.print("your English score: ");
		double eng = sc.nextDouble();
		
		System.out.print("your Math score: ");
		double mat = sc.nextDouble();
		
		
		double total = kor+eng+mat;
		double avg = total/3;

		System.out.println("\nyour total score: "+total);
		System.out.printf("your average score: %.2f\n", avg);

	}

}
