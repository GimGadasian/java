import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abcabccanadacafehotcococatchmeifyoucan";
//		int count = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//		    if (str.charAt(i) == 'c') {
//		        count++;
//		    }
//		}
//		System.out.println("c개수: " + count + "개");

		
		String str1 = "hong, you, lee, gang, goo";
		String[] names = str1.split(",");
		
		String str2 = "1,hong,100,100,100,300,100.0";
		String[] hscore  = str2.split(",");
		System.out.println(Arrays.toString(hscore));
		
		int stuNo = Integer.parseInt(hscore[0]);
		int kor = Integer.parseInt(hscore[2]);
		int eng = Integer.parseInt(hscore[3]);
		int math = Integer.parseInt(hscore[4]);
		int total = Integer.parseInt(hscore[5]);
		double avr = Double.parseDouble(hscore[6]);
		
		Student hong = new Student(stuNo, hscore[1], kor, eng, math);
		System.out.println(hong.getStuNo());
		System.out.println(hong.getName());
		System.out.println(hong.getKor());
		System.out.println(hong.getEng());
		System.out.println(hong.getMath());
		System.out.println(hong.getTotal());
		System.out.println(hong.getAvr());
		
	}

}


