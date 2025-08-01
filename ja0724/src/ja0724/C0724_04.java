package ja0724;

import java.util.Scanner;

public class C0724_04 {
	public static void main(String[] args) {
		// 5x5 matrix
		int[][] mat = new int[5][5]; // 5x5 
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length;j++) {
				mat[i][j] = 5*i+j+1;
				System.out.printf("%2d ", mat[i][j]);
			}System.out.println("");
		}
		
		// score board
		// input score
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"이름", "국어","영어","수학"};
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> \n",i+1);
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> \n",i+1,title[j+1]);
				score[i][j] = scan.nextInt();
			}
		}
		
		// print score board
		for (int i=0; i<4; i++) {
			System.out.printf("%3s ", title[i]);
		} System.out.println("");
		
		for (int i=0; i<score.length; i++) {
			System.out.printf("%3s ", name[i]);
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%3d ", score[i][j]);
			}System.out.println("");
		}
		
	}
}
