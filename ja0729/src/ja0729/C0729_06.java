package ja0729;

import java.util.Scanner;

public class C0729_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		int kor, eng, math, count = 0;
		
		System.out.println("Student Score Program");
		System.out.println("Student name: ");
		name = sc.next();
		System.out.println("Korean score: ");
		kor = sc.nextInt();
		System.out.println("English score: ");
		eng = sc.nextInt();
		System.out.println("Math score: ");
		math = sc.nextInt();
		Stuscore stu = new Stuscore(name, kor, eng, math); // object
		
		
		
		System.out.println("Student name: "+stu.name);
		System.out.println("Korean score: "+stu.kor);
		System.out.println("English score: "+stu.eng);
		System.out.println("Math score: "+stu.math);
		System.out.println("total score: "+stu.total);
		System.out.println("average score: "+stu.avr);
	}

}
