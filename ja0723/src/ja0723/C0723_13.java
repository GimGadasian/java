package ja0723;

import java.util.Scanner;

public class C0723_13 {
	public static void main(String[] args) {
		int[] guesses = new int[5];
		long rand = (int)(Math.random()*5+1);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < guesses.length; i++) {
		    System.out.println("guess the number.");
		    int guess = sc.nextInt();
		    guesses[i] = guess;
		    count++;
		    if (guess == rand) {
		        System.out.println("Bingo!");
		        break;
		    }
		}
		System.out.print("Your guesses: ");
		for (int i = 0; i < count; i++) {
		    System.out.printf("%d, ", guesses[i]);
		    
		} System.out.printf("\nTried %d times\n", count);
	}
}
