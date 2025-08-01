package ja0724;

import java.util.Arrays;
import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		float[] avr = new float[3];
		
		int i = 0;
		
		for (i=0; i<name.length; i++) {
			System.out.println("name: ");
			String n = sc.next();
			
			System.out.println("korean score: ");
			int k = sc.nextInt();
			
			System.out.println("english score: ");
			int e = sc.nextInt();
			
			int t = k+e;
			float a = (float)t/2f;
			
			name[i] = n;
			kor[i] = k;
			eng[i] = e;
			total[i] = t;
			avr[i] = a;
			
			System.out.printf("%s's score: ",name[i]);
			System.out.printf("%d(kor)\t%d(eng)\t%d(total)\t%.2f(average)\n\n", kor[i], eng[i], total[i], avr[i]);
		} System.out.printf(Arrays.toString(name));
	}

}
