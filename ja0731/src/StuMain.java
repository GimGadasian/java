import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Stuscore[] s = new Stuscore[10];
		int kor, eng, math, total =0;
		int n = 0;
		double avr = 0;
		String name = "";
		ArrayList list = new ArrayList();
		StuDeck sd = new StuDeck();
		System.out.println("Student Score Program");
		
		loop: while (true) {
			int choice = sd.menu_print();
			switch(choice) {
				
			case 1:
				sd.score_input(list);
				break;
			case 2:
				sd.score_output(list);
				break;
			default: break loop;
			}
		}
			 
	}

}

