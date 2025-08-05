import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0805_03 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		int stuNo, kor, eng, math, total, rank = 0;
		double avr = 0;
		String name = "";
		FileReader fr = new FileReader("c:/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i = 0;
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
		}
		
		loop: while(true) {
			System.out.println("1. register");
			System.out.println("2. scoreboard");
			System.out.println("3. save");
			System.out.println("0. quit");
			
			int choice = sc.nextInt();
			
				switch(choice) {
				case 1:
					System.out.println("student name: ");
					name = sc.next();
					System.out.printf("korean score: ");
					kor = sc.nextInt();
					System.out.printf("english score: ");
					eng = sc.nextInt();
					System.out.printf("math score: ");
					math = sc.nextInt();
					list.add(new Student(name, kor, eng, math));
					break;
				case 2: 
					for(i=0; i<list.size(); i++) {
						System.out.printf("(%d) %4s\t%3d\t%3d\t%3d\t%3d\t%5.2f\t%d\n", 
							list.get(i).getStuNo(), 
							list.get(i).getName(), 
							list.get(i).getKor(), 
							list.get(i).getEng(), 
							list.get(i).getMath(), 
							list.get(i).getTotal(), 
							list.get(i).getAvr(),
							list.get(i).getRank()
							);
						}
					break;
				case 3: 
					
					
					// 파일저장 - true:이어쓰기, false:덮어쓰기
					FileWriter fw = new FileWriter("c:/aaa/student.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					for(i=0;i<list.size();i++) {
						Student s = list.get(i);
						String st = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
						s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
						s.getTotal(),s.getAvr(),s.getRank());
						bw.write(st);
					}
					bw.close();
					fw.close();
					System.out.println("파일저장 완료!");
					break;
				default: break loop;
				}
			}
	}
}
