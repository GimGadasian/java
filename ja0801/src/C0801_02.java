
public class C0801_02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		if (s1.equals(s2)) {
			System.out.println("Same person");
		} else {
			System.out.println("Different person");
		}
		
		if (s1 != s2) {
		    System.out.println("Different memory addresses");
		} else {
		    System.out.println("Same memory address");
		}

		
		
		
//		Person p1 = new Person();
//		p1.id = 9903264247638L;
//		p1.name = "홍길동";
//		p1.address = "서울";
//		Person p2 = new Person(9903264247638L, "홍길동", "서울");
//		
//		if (p1 == p2) { // 참조변수 주소
//			System.out.println("주소가 같습니다");
//		} else {
//			System.out.println("주소가 다릅니다");
//		}
		
		
		
		
//		String str1 = new String("aaa"); // 자바 기본 클래스
//		String str2 = new String("aaa");
//		
//		if (str1 == str2) { // 참조변수 주소
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
//		
//		if (str1.equals(str2)) {// 값
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
	}
}
