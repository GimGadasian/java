package ja0723;

import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		long add = (long)input1 + input2;
		*/
		
		System.out.println("add program");
		System.out.println("1. Less than or equal to 2.1 billion");
		System.out.println("2. more than or equal to 2.1 billion");
		System.out.println();
		
		int choice = sc.nextInt();
		System.out.print("1st number: ");
		int input1 = sc.nextInt();
		System.out.print("2nd number: ");
		int input2 = sc.nextInt();
		
		
		switch(choice) {
		case 1: 
			int add_1 = input1 + input2;
			System.out.print(add_1);
			break;
		case 2:
			long add_2 = (long) input1 + input2;
			System.out.print(add_2);
			break;
		}
		

	}

}
