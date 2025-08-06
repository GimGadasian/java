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
		
		int stuNo = 0;
		int kor, eng, math, total, rank = 0;
		int temp;
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
				case 3:
					sd.update(list);
				    break;
				case 4: 
					sd.delete(list);
					break;
				case 5: 
					sd.save(list);
					break;
				case 6: 
					// sort by total
					sd.sort(list);
					break;
				case 7: 
					// rank
					sd.rank(list);
					break;
					
				default: break loop;
				}
			}
		}

	}

