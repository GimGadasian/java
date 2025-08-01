package ja0721;

import java.util.Scanner;

public class C0721_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("< your name >");
		String name = sc.nextLine();
		System.out.println("< your score >");
		System.out.println("#1 korean");
		int kor = sc.nextInt();
		System.out.println("#2 english");
		int eng = sc.nextInt();
		int total = kor + eng;
		System.out.println("#3 total: "+ total);
		double avg = total/3; // total은 int avg로 들어가면서 double로 형 변환
		System.out.println("#4 average: "+ avg);
		System.out.printf("average: %.3f\n", avg); // 소숫점 3자리 실수 형태로 포맷
		System.out.printf("average: %e \n", avg); // *지수 형태로 포맷
	}

}
