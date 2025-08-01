package ja0730;
public class C0730_02 {

	public static void main(String[] args) {
		//원형 그림
		Circle c1 = new Circle();
		c1.draw(c1.sname,c1.center);
		Circle c2 = new Circle(new Point(150,150),50);
		c2.draw(c2.sname, c2.center);
		
//		StuScore[] stu = {
//				new StuScore("홍길동",100,100,100),
//				new StuScore("유관순",90,90,90),
//				new StuScore("이순신",80,80,80)
//		};
		
		// 삼각형 그림
		Point[] p = {
				new Point(),
				new Point(140,50),
				new Point(200,100)
		};
		
		Triangle t1 = new Triangle(p);
		t1.draw(t1.sname, p);
		
		

	}

}