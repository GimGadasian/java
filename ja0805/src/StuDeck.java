import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner sc = new Scanner(System.in);
	private int stuNo, kor, eng, math, total, rank = 0;
	private double avr = 0;
	private String name = "";
	
	public void stuFileRead(ArrayList<Student> list) throws Exception{
		FileReader fr = new FileReader("c:/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			String[] str = line.split(",");
			stuNo = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avr = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Student(stuNo, name, kor, eng, math, total, avr, rank));
		} // while
	}
	
	int display() {
		
		System.out.println("1. register");
		System.out.println("2. scoreboard");
		System.out.println("3. update");
		System.out.println("4. save");
		System.out.println("5. delete");
		System.out.println("6. sort");
		System.out.println("0. quit");
		
		int choice = sc.nextInt();
		return choice;
	}
	
	void register(ArrayList<Student> list) {
		System.out.println("student name: ");
		name = sc.next();
		System.out.printf("korean score: ");
		kor = sc.nextInt();
		System.out.printf("english score: ");
		eng = sc.nextInt();
		System.out.printf("math score: ");
		math = sc.nextInt();
		list.add(new Student(name, kor, eng, math));
	}
	
	void scoreBoard(ArrayList<Student> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.printf("(%02d) %5s\t%3d\t%3d\t%3d\t%3d\t%5.2f\t%d\n", 
				list.get(i).getStuNo(), 
				list.get(i).getName(), 
				list.get(i).getKor(), 
				list.get(i).getEng(), 
				list.get(i).getMath(), 
				list.get(i).getTotal(), 
				list.get(i).getAvr(),
				list.get(i).getRank()
				);// printf
		}// for
	}
	
	public void save(ArrayList<Student> list) throws Exception{
		FileWriter fw = new FileWriter("c:/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			String st = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
			s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
			s.getTotal(),s.getAvr(),s.getRank());
			bw.write(st);
		}// for
		bw.close();
		fw.close();
		System.out.println("saved successfully");
	}
	
}
