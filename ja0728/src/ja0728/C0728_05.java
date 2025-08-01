package ja0728;

public class C0728_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuscore[] ss = new Stuscore[3];
		ss[0]  =  new Stuscore();
		ss[0].name = "hong";
		ss[0].kor = 100;
		ss[0].eng = 100;
		ss[0].math = 100;
		ss[0].stuTotal();
		ss[0].stuAvr();
		
		ss[1]  =  new Stuscore();
		ss[1].name = "you";
		ss[1].kor = 90;
		ss[1].eng = 90;
		ss[1].math = 90;
		ss[1].stuTotal();
		ss[1].stuAvr();
		
		ss[2]  =  new Stuscore();
		ss[2].name = "lee";
		ss[2].kor = 80;
		ss[2].eng = 80;
		ss[2].math = 80;
		ss[2].stuTotal();
		ss[2].stuAvr();
		
		String label[] = {"name", "kor", "eng", "math", "total", "average"};
		for (int i=0; i<label.length; i++) {
			System.out.printf("%s\t", label[i]);
		}
		
		System.out.println("\n");
		
		for (int i=0; i<ss.length; i++) {
			System.out.printf("%4s\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", ss[i].name, ss[i].kor, ss[i].eng, ss[i].math, ss[i].total, ss[i].avr);
		}
		
				
	}

}
