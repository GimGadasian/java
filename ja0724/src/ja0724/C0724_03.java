package ja0724;

import java.util.Scanner;

public class C0724_03 {
	public static void main(String[] args) {
		// generate list and allocate numbers in it
		int[] num = new int[45];
		for (int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		// shuffle 
		int rnum =0;
		int temp = 0;
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;	
		} 
		
		// input your guess
		Scanner sc = new Scanner(System.in);
		int guess[] = new int[6];
		for (int i=0; i<6; i++) {
			System.out.printf("guess 6 numbers from 1 to 45(%d/6): ", i+1);
			int g = sc.nextInt();
			guess[i] = g;
		}
		
		// print your guess
		System.out.print("guess sheet: ");
		for (int i=0; i<6; i++) {
			System.out.printf("%d ", guess[i]);
		}
		
		System.out.println("");	
		
		// print answer from shuffled list
		System.out.print("answer sheet: ");
		for (int i=0; i<6; i++) {
			System.out.printf("%d ", num[i]);
		}
	}
}
