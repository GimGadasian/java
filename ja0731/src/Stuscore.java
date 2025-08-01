
public class Stuscore {
	public static int count;
	private int n;      //같은클래스
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avr;
	private int rank;
	
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

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvr() {
		return avr;
	}
	public void setAvr(double avr) {
		this.avr = avr;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
