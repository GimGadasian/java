package ja0728;

import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("소수를  입력: ");
		double num = sc.nextDouble();
		System.out.println("소수부 자릿수 입력: ");
		int round_point = sc.nextInt();
		
		Prime pr = new Prime();
		pr.round(num, round_point);
		pr.ceil(num, round_point);
		pr.floor(num, round_point);
		
		
	}

}
