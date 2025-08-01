package ja0723;

import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum1=0;
		int sum2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("your number: ");
		int end = sc.nextInt();
		
		while (i<end) {
			i++;
			// even sum
			if (i%2 == 0) {	
				sum1 += i;	
			} else { // odd sum
				sum2 += i;	
			} 	
		}
		System.out.println("even_total: "+sum1);
		System.out.println("odd_total: "+sum2);
	} 

}
