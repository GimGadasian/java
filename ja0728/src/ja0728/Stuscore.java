package ja0728;

public class Stuscore {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avr;
	int rank;
	
	void stuTotal() {
		total = kor + eng + math;
	}
	
	void stuAvr() {
		avr = total / 3.0;
	}
	
}
