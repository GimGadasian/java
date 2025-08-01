package ja0723;

import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		System.out.print("starting number: ");	
		int start = sc.nextInt();
		System.out.print("ending number: ");	
		int end = sc.nextInt();
		i = 0;
		
		
		while (i < 9) {
			i++;
			j = start;
			while (j <= end) {
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
				j++;
			} System.out.println("");
		}
	}

}
