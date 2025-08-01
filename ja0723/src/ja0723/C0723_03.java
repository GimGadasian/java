package ja0723;

import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long rand = (int)(Math.random()*10+1); // only double, long
		System.out.print("guess random number from 1 to 10: ");
		int guess = sc.nextInt();
		
		if (rand == guess) {
			System.out.println("Bingo! :D");
		} else {
			if (rand > guess) {
				System.out.println("Smaller! :(");
			} else {
				System.out.println("Bigger! :(");
			}
		} System.out.println("your guess: "+guess);
		  System.out.println("answer: "+rand);
		
		  
		  // repeat 10 times
		  for(int i=1; i<11;i++) {
			  System.out.print("guess random number from 1 to 10: ");
			  int guess1 = sc.nextInt();
			  System.out.println("Attempt."+i);
			  System.out.println("your guess: "+guess1);
			  
			  if (rand == guess1) {
					System.out.println("Bingo! :D");
					System.out.printf("your record: %d times!", i);
					break;
				} else {
					if (rand > guess1) {
						System.out.println("Smaller! :(\n");
					} else {
						System.out.println("Bigger! :(\n");
					}
				} 
		  }
	}

}
