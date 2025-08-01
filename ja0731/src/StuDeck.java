import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	private int kor, eng, math = 0;
	private String name = "";
	Scanner sc = new Scanner(System.in);
	
	int menu_print() {
		
		System.out.println("1. Register score");
		System.out.println("2. View score board");
		System.out.println("0. Quit");
		System.out.println("select number: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	void score_output(ArrayList list) {
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.printf("(%d) %s's score: %3d\t%3d\t%3d\t%4d\t%5.2f\n\n",
				    s.getN(), s.getName(), s.getKor(), s.getEng(),
				    s.getMath(), s.getTotal(), s.getAvr());
		}
	}
	
	void score_input(ArrayList list) {
		System.out.printf("name(%d): ", Stuscore.count+1);
		name = sc.next();
		System.out.print("\nKorean score: ");
		kor = sc.nextInt();
		System.out.print("English score: ");
		eng = sc.nextInt();
		System.out.print("Math score: ");
		math = sc.nextInt();
		//s[Stuscore.count] = new Stuscore(name, kor, eng, math);
		list.add(new Stuscore(name, kor, eng, math));
		System.out.printf("%s's score is registered successfully!\n\n", name);
		
	}
}
