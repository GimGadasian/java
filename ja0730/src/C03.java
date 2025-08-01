
public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		
		
		fe.water();
		car = fe;
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		car = ab;
		if (ab instanceof Ambulance) {
			System.out.println("구급차");
		}
		if (ab instanceof Car) {
			System.out.println("카 구급차");
		}
		if (ab instanceof Object) {
			System.out.println("오브젝트");
		}
		if (car instanceof FireEngine) {
			System.out.println("변경가능");
		} else {
			System.out.println("변경불가");
		}
	}

}
