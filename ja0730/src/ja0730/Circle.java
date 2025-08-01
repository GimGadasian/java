package ja0730;
public class Circle extends Shape{
	String sname = "Circle";
	// 원형그리기 - 원점,반지름
	Point center; // Point객체-x,y
	int r;
	
	//기본생성자
	Circle(){
		this(new Point(0,0),100);
	}
	//매개변수가 있는 생성자
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	
	

}