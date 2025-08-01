package ja0723;

import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		for (i=2; i<=9; i++) {
			System.out.println("\n"+ i+"단");
			for (j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				}
				
			}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("start: ");
		int start = sc.nextInt();
		System.out.print("end: ");
		int end = sc.nextInt();
		
		if (start > end) {
			int bin = 0;
			bin = start;
			start = end;
			end = bin;
			System.out.println("start, end switched");
		}
		
		for (i=start; i<=end; i++) {
			System.out.println("\n"+ i+"단");
			for (j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				}
				
			}
		
		} // main()
	} // class


