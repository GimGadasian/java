
public class Student {

	public static int count = 0; //static -> 클래스 로딩 시 한 번만 초기화됨. 모든 Student 객체가 공유함

	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avr;
	private int rank;
	
	{stuNo = ++count;} // 인스턴스 초기화 블록: 객체 생성 시마다 count 증가 → stuNo 자동 부여

	
	Student() {// 기본 생성자
		
	}
	
	Student(String name, int kor, int eng, int math) {// 점수와 이름을 받아 총점과 평균 계산하는 생성자

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avr = total/3.0;
	}
	
	Student(int stuNo, String name, int kor, int eng, int math, int total, double avr, int rank) {// 파일에서 불러온 데이터를 기반으로 객체를 생성하는 생성자

		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avr = avr;
		this.rank = rank;
	}

	// getter, setter
	
	public int getStuNo() {    
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
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
