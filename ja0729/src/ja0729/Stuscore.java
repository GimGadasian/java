package ja0729;

public class Stuscore {
	static int count = 0;
	int n;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avr;
	
	{
		count++;
		this.n = count;
		
	}
	
	Stuscore() {
		
	}
	
	Stuscore(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avr = total / 3.0;
    }

}
