package ja0723;

import java.util.Scanner;

public class C0723_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		for (i=1;i<10+1;i++) {
			System.out.printf("attempt %d: ", i);
			sum += i;
			System.out.println(sum);
		}
		System.out.println("\ntotal: "+sum);
		
		//  total between 2 inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("starting number: ");
		int start = sc.nextInt();
		System.out.print("ending number: ");
		int end = sc.nextInt();
		
		if (start > end) {
			System.out.println("now switching");
			int bin = 0;
			bin = start;
			start = end;
			end = bin;
			System.out.printf("starting with %d, ending with %d", start, end);
		}
		
		
		int total = 0;
		i = 0;
		
		for (i=start;i<end+1;i++) {
			total += i;
		}
		System.out.println("\ntotal: "+total);
	}

}
