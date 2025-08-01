package ja0728;

public class C0728_03 {
	public static void main(String[] args) {
		Stuscore hong = new Stuscore();
		hong.name = "Gildong";
		hong.kor = 100;
		hong.eng = 100;
		hong.math = 100;
		hong.total = hong.kor+ hong.eng + hong.math;
		
		Stuscore you = new Stuscore();
		you.name = "Gwansoon";
		you.kor = 100;
		you.eng = 90;
		you.math = 90;
		you.total = you.kor+ you.eng + you.math;
		
		System.out.println("score board");
		System.out.printf("%s\t\t%3d\t%3d\t%3d\t%3d\n", hong.name, hong.kor, hong.eng, hong.math, hong.total);
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\n", you.name, you.kor, you.eng, you.math, you.total);
	}
}
