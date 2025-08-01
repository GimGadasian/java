package ja0724;

import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1-dimension 
		int[] num = new int[25];
		for (int i=0; i<num.length; i++) {
			num[i] = i+1; // 1, 2, 3, 4 ... , 24, 25
		}
		// 5x5 matrix
		int[][] mat = new int[5][5];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				mat[i][j] = 0;
			}
		}
		
		// shuffle
		int temp = 0;
		int ran = 0;
		
		for (int i=0; i<100; i++) {
			ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}

		// print
		int index = 0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				// allocate shuffled numbers
				mat[i][j] = num[index];
				System.out.printf("%2d   ", mat[i][j]);
				index++;
			} System.out.println("\n");	
		}
		
		// bingo game
		while(true) {
		    System.out.print("number select: ");
		    int input = sc.nextInt();

		    boolean found = false;
		    for (int i = 0; i < 5; i++) {
		        for (int j = 0; j < 5; j++) {
		            if (mat[i][j] == input) {
		                mat[i][j] = 0;  // 빙고판에서 숫자 제거
		                found = true;
		                break;
		            }
		        }
		        if (found) break;
		    }
		    // bingo print
		    
		    for (int i = 0; i < 5; i++) {
		        for (int j = 0; j < 5; j++) {
		            if (mat[i][j] == 0) {
		                System.out.print(" X   ");  
		            } else {
		                System.out.printf("%2d   ", mat[i][j]);
		            }
		        }
		        System.out.println("\n");
		    }
		    System.out.println();
		}
				
	}

}
