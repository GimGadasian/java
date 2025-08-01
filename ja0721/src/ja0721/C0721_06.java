package ja0721;

public class C0721_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		System.out.println("b: "+b);
		b = (byte) (b + (byte)(10));
		System.out.println("b: "+b); // 127 + 1 ~> -127 -127 + 9 = -119: overflow
		
		int a = 2147483647;
		a = a+3;
		System.out.println("a: "+a);
	}

}
