package ja0722;

public class C0722_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		double s_pi = (int)(pi*1000000)/ 1000000;
		System.out.println(s_pi);
		
		double k = Math.floor(pi*100)/100;
		System.out.println(k);
		
		double j = Math.round(pi*100)/100;
		System.out.println(j);
		
		double l = Math.ceil(pi*100)/100;
		System.out.println(l);
	}

}
