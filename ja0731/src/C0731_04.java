
public class C0731_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
		System.out.println("Tank hp: "+t.hitPoint);
		t.damage();
		t.damage();
		System.out.println("Tank hp: "+t.hitPoint);
		Scv s1 = new Scv();
		s1.reqair(t);
		System.out.println("Tank hp: "+t.hitPoint);
		
		Marine m1 = new Marine();
		System.out.println("Marine hp: "+m1.hitPoint);
		m1.damage();
		m1.damage();
		System.out.println("Marine hp: "+m1.hitPoint);
	}

}
 