package ja0728;

import java.util.Arrays;
import java.util.Scanner;

public class Process {
	Scanner sc = new Scanner(System.in);
	void rand() {
		int[] input = new int[10];
		int answer = (int)(Math.random()*100)+1;
		for (int i=0; i<input.length; i++) {
			System.out.print("guess a number from 1 to 100 in 10 times: ");
			input[i] = sc.nextInt();
			if (answer > input[i]) {
				System.out.printf("Down(%d/10)\n", i+1);
			} else if (answer == input[i]) {
				System.out.printf("You did it in %d time(s)!", i+1);
				break;
			} else {
				System.out.printf("Up(%d/10)\n", i+1);
			}
		} // for
	} // rand
	
	int lottery(int count, int myNo[], int lotto[], int okNo[]) {
		for (int i=0; i<myNo.length; i++) {
			myNo[i] = sc.nextInt();
			lotto[i] = (int)(Math.random()*45)+1;
			}
		
		for (int i=0; i<myNo.length; i++) {
			for (int j=0; j<lotto.length; j++) {
				if(myNo[i] == lotto[j]) {
					okNo[count] = myNo[i];
					count++;
				} 
			} // for j
		} // for i
		System.out.println("your input: "+Arrays.toString(myNo));
		System.out.println("lottery numbers: "+Arrays.toString(lotto));
		System.out.print("matching numbers: ");
		for (int i=0; i<count; i++) {
			System.out.println(okNo[i] + "");
		}
		
		return count;
	}
	
	void timeTable() {
		System.out.print("starting number: ");
		int start = sc.nextInt();
		System.out.print("ending number: ");
		int end = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			for (int j=start; j<=end; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			} System.out.println();
		}// for
	}// timeTable
}
 