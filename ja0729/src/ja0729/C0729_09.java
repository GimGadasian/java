package ja0729;

import java.util.Scanner;

public class C0729_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		int kor, eng, math, count, n = 0;
		String name = "";
		System.out.println("Student Score Program");
		
		
		
		loop: while (true) {
			System.out.println("1. Register");
			System.out.println("2. Quit");
			System.out.println("select number: ");
			int choice = sc.nextInt();
			switch(choice) {
		
			case 1:
				System.out.printf("name(%d): ", Stuscore.count+1);
				name = sc.next();
				System.out.print("\nKorean score: ");
				kor = sc.nextInt();
				System.out.print("English score: ");
				eng = sc.nextInt();
				System.out.print("Math score: ");
				math = sc.nextInt();
				s[Stuscore.count] = new Stuscore(name, kor, eng, math);
				
				break;
			default: break loop;
			}
		}
		 
		for(int i=0;i<Stuscore.count;i++) {
			
			System.out.printf("(%d) %-10s %3d %3d %3d %4d %6.2f\n",
				    s[i].n, s[i].name, s[i].kor, s[i].eng,
				    s[i].math, s[i].total, s[i].avr);

		}
		

	}

	
	

}
	