
public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		
		t2.setHour(11);
		t2.setMinute(11);
		
		Time[] tarr = new Time[5];
		for (int i=0; i<tarr.length; i++) {
			tarr[i] = new Time(10, 10, i+1);
			System.out.println(tarr[i]);
		}
		
		tarr[1].setHour(12);
		tarr[1].setMinute(59);
		tarr[1].setSecond(0);
		System.out.println(tarr[1]);
		
		System.out.println(t2);
	}

}
