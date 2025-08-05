import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		int stuNo, kor, eng, math, total, rank = 0;
		double avr = 0;
		String name = "";

		StuDeck sd = new StuDeck();
		sd.stuFileRead(list);
		
		loop: while(true) {
			int choice = sd.display();
				switch(choice) {
				case 1:
					sd.register(list);
					break;
				case 2: 
					sd.scoreBoard(list);
					break;
				case 4: 
					sd.save(list);
					break;
				case 5: 
					// delete
					break;
				case 6: 
					// sort
					break;
					
				default: break loop;
				}
			}
		}

	}

