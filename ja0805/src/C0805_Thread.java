
public class C0805_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* single thread
		for(int i=0; i<300; i++) {
			System.out.println("----");
		}
		for(int i=0; i<300; i++) {
			System.out.println("||||");
		}
		*/
		
		// multi thread
		MyThread m1 = new MyThread();
		MyThread2 m2 = new MyThread2();
		
	}

}
