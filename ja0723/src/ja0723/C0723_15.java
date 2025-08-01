package ja0723;

import java.util.Scanner;

public class C0723_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		int[] kors = new int[5];
		int[] engs = new int[5];
		int[] mats = new int[5];
		int[] totals = new int[5];
		double[] avrs = new double[5];
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		for (i=0; i<names.length; i++) {
			System.out.printf("name: ");
			String name = sc.next();
			
			System.out.printf("korean: ");
			int kor = sc.nextInt();
			
			System.out.printf("english: ");
			int eng = sc.nextInt();
			
			System.out.printf("math: ");
			int mat = sc.nextInt();
			
			int total = kor+eng+mat;
			double avr = (double)total/3;
			
			names[i] = name;
			kors[i] = kor;
			engs[i] = eng;
			mats[i] = mat;
			totals[i] = total;
			avrs[i] = avr;
		} 
		
		for (i=0; i<names.length; i++) {
			System.out.printf("\n%s's score(total: %d/average: %.2f)\n", names[i], totals[i], avrs[i]);
			System.out.println("korean: "+ kors[i]);
			System.out.println("english: "+ engs[i]);
			System.out.println("math: "+ mats[i]+"\n");
			}

		}
}
