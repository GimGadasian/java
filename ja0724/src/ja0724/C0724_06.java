package ja0724;

import java.util.Arrays;
import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		float[] avr = new float[3];
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		int count = 0;
		
		loop: while(true) {
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 나가기");
			System.out.print(">>> ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("이름:");
					name[count] = sc.next();
					for (int i=0; i<score[count].length; i++) {
						System.out.printf("%s: ", title[i+1]);
						score[count][i] = sc.nextInt();
						total[count] += score[count][i];
						}	
					avr[count] = total[count]/3.0F;
					count++;
					System.out.println();
					break;
					
				case 2:
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					} System.out.println("\n");
					
					for(int i=0;i<name.length;i++) {
						System.out.printf("%s\t",name[i]);
						for (int j=0; j<score[i].length; j++) {
							System.out.printf("%3d\t", score[i][j]);
							
						}
						System.out.printf("%3d\t", total[i]);
						System.out.printf("%3.2f\n", avr[i]);
					}
					System.out.println();
					break;
					
				case 3:
					System.out.printf("학생 검색: ");
					String search = sc.next();
					int temp = 0;
					for (int i=0; i<count; i++) {
						if(search.equals(name[i])) {
							System.out.printf("%s 학생의 현재 점수\n", name[i]);
							for (int j = 0; j < score[i].length; j++) {
					            System.out.printf("%s: %d\t", title[j + 1], score[i][j]);
					        	} 
							System.out.println();
							System.out.print("수정할 과목 번호 선택 (1:국어 2:영어 3:수학): ");
					        int sub_choice = sc.nextInt();
					        
					        switch(sub_choice) {
					        	case 1: case 2: case 3:
					        		System.out.printf("%s: ", title[sub_choice]);
					        		int new_score = sc.nextInt();
					        		score[i][sub_choice-1] = new_score;
					        		total[i] = score[i][0]+score[i][1]+score[i][2];
									avr[i] = total[i]/3.0F;
					        	}
					        temp = 1;
							}
					} if(temp==0) {
						System.out.printf("%s를 찾을 수 없음\n",search);
						System.out.println();
						}
					break;
					
				default:
					System.out.println("프로그램을 종료합니다");
					break loop;
			}
		}
	}

}
