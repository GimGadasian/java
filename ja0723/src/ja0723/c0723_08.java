package ja0723;

import java.util.Scanner;

public class c0723_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int ii = 2;
		
		
		while (ii <= 9) {
			System.out.printf("%d 단\t\t", ii);
			ii++;
		} System.out.println("");
		
		while (i < 9) {
			i++;
			int j = 2;
			while (j <= 9) {
				System.out.printf("%d x %d = %2d\t", j, i, i*j );
				j++;
			} System.out.println("");	
		} 
		System.out.println("");	
		
		
		
	} 

}
