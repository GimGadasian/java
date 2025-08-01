package ja0728;

import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Bingo\n2. Lottery\n3. time table");
		Scanner sc = new Scanner(System.in);
		Process pro = new Process();
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1. Bingo");
			pro.rand();
			break;
		case 2:
			System.out.println("2. Lottery");
			int[] myNo = new int[6];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0; // return required
			
			count = pro.lottery(count, myNo, lotto, okNo);
			System.out.printf("\n matched %d time(s)!" ,count);
			break;
		case 3:
			System.out.println("3. time table");
			pro.timeTable();
			break; 
		}
		
	}

}
