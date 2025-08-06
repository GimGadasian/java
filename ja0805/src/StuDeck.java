import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("4. delete");
		System.out.println("5. save");
		System.out.println("6. sort");
		System.out.println("7. rank");
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
			System.out.printf("(%02d) %5s\t%3d\t%3d\t%3d\t%3d\t%6.2f\t   %d\n", 
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
	
	void update(ArrayList<Student> list) {
		System.out.print("name: ");
	    name = sc.next();
	    int temp = 0;
	    int index = -1; 

	    for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getName().equals(name)) {
	            System.out.printf("update %s's score\n", list.get(i).getName());
	            temp = 1;
	            index = i;
	            break;
	        }
	    }

	    if (temp == 0) {
	        System.out.println("student not found");
	    }

	    System.out.println("choose the subject to update");
	    System.out.println("1. korean");
	    System.out.println("2. english");
	    System.out.println("3. math");
	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.printf("current korean score: %d\n", list.get(index).getKor());
	            System.out.print("new korean score: ");
	            list.get(index).setKor(sc.nextInt());
	            break;
	        case 2:
	            System.out.printf("current english score: %d\n", list.get(index).getEng());
	            System.out.print("new english score: ");
	            list.get(index).setEng(sc.nextInt());
	            break;
	        case 3:
	            System.out.printf("current math score: %d\n", list.get(index).getMath());
	            System.out.print("new math score: ");
	            list.get(index).setMath(sc.nextInt());
	            break;
	        default:
	            System.out.println("Invalid subject choice.");
	            break;
	    }
	    list.get(index).setTotal(list.get(index).getKor()+list.get(index).getEng()+
				list.get(index).getMath());
	    list.get(index).setAvr(list.get(index).getTotal() / 3.0);
	    
	}
	
	void delete(ArrayList<Student> list) {
		System.out.print("name: ");
	    name = sc.next();
	    int temp = 0;
	    int index = -1; // invalid index

	    for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getName().equals(name)) {
	            System.out.printf("delete %s's score\n", list.get(i).getName());
	            temp = 1;
	            index = i;
	            break;
	        }
	    }

	    if (temp == 0) {
	        System.out.println("student not found");
	    }
	    
	    if (temp == 1) {
	    	list.remove(index);
	    	System.out.println("student deleted");
	    }
	}
	
	void sort(ArrayList<Student> list) {
		System.out.println("sorting criteria");
		System.out.println("1. name(alphabet)");
		System.out.println("2. total");
		System.out.println("3. number");
		String sel = ""; 
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. name(alphabet)");
			System.out.println("sequential or reverse?(s/r)");
			sel = sc.next();
			
			if (sel.equals("s")) {
		        // 오름차순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		                return o1.getName().compareTo(o2.getName());
		            }
		        });
		    } else if (sel.equals("r")) {
		        // 내림차순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		                return o2.getName().compareTo(o1.getName());
		            }
		        });
		    } else {
		        System.out.println("Invalid input");
		    }
		    break;

		case 2:
			System.out.println("2. total");
			System.out.println("sequential or reverse?(s/r)");
			sel = sc.next();
			
			if (sel.equals("s")) {
		        // 높은 순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		                return o2.getTotal() - o1.getTotal();
		            }
		        });
		    } else if (sel.equals("r")) {
		        // 낮은 순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		            	return o1.getTotal() - o2.getTotal();
		            }
		        });
		    } else {
		        System.out.println("Invalid input");
		    }
			break;
			
		case 3:
			System.out.println("3. number");
			System.out.println("sequential or reverse?(s/r)");
			sel = sc.next();
			
			if (sel.equals("s")) {
		        // 오름차순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		                return o1.getStuNo() - o2.getStuNo();
		            }
		        });
		    } else if (sel.equals("r")) {
		        // 내림차순 정렬
		        list.sort(new Comparator<Student>() {
		            @Override
		            public int compare(Student o1, Student o2) {
		            	return o2.getStuNo() - o1.getStuNo();
		            }
		        });
		    } else {
		        System.out.println("Invalid input");
		    }
			break;
		default: 
			System.out.println("invalid choice");
		}
	}
	
	void rank(ArrayList<Student> list) {
		System.out.println("ranking process start");
		for (int i=0; i<list.size(); i++) {
			int count = 1;
			for (int j=0; j<list.size(); j++) {
				if (list.get(i).getTotal()<list.get(j).getTotal()) {
					count++;	
				}list.get(i).setRank(count);
			} // for
		}
		System.out.println("ranked successfully");
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
