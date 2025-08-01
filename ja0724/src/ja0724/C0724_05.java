package ja0724;

import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어","영어","수학"};
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> \n",i+1);
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> \n",i+1,title[j]);
				score[i][j] = scan.nextInt();
				//total[i] += score[i][j];
			}
			total[i] = score[i][0]+score[i][1]+score[i][2];
			avg[i] = total[i]/3.0;
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("----------------------------------------");
		
		for(int i=0;i<score.length;i++) {
			// name
			System.out.printf("%s\t",name[i]);
			for(int j=0;j<score[i].length;j++) {
				// score
				System.out.printf("3%d\t",score[i][j]);
			}
			System.out.printf("%3d\t",total[i]);
			System.out.printf("%3.2f\t",avg[i]);
			
			System.out.println();
		}
	}
	
}
