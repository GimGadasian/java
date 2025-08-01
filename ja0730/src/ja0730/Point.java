package ja0730;

public class Point extends Object {
	int x; //인스턴스 변수 - 객체선언후,개별,참조변수명.변수명
	int y;
	
	Point(){
		this(0,0); // this() : 다른생성자
	}
	Point(int x,int y){
		this.x = x; //this : 인스턴스변수
		this.y = y;
	}
	
	
	
	
	
	void add() {
		System.out.println(x+y);
	}
}
