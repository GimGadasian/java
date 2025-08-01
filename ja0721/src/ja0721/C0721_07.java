package ja0721;

public class C0721_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7000000;
		int result = 7000000 * 7000000 / 7000000; // 49조 ~> 오버플로우 사이클 돎
		System.out.println("result: "+result);
		
		int result2 = 7000000 / 7000000 * 7000000;
		System.out.println("result2: "+result2); // 1 * 7000000
		
		int n = 65;
		System.out.println("n: "+n );
		char ch = (char) n;
		System.out.println("ch: "+ch);
		
		float f = 1.6f;
		int num = (int) f; // 1 강제형변환
		System.out.println("f: "+f);
		System.out.println("num: "+num); 
		
		float f2 = num; //(float)1 자동형변환
		System.out.println("f2: "+f2);
	}

}
