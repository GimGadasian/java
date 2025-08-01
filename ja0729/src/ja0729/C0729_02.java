package ja0729;

public class C0729_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = factorial(5);
		System.out.println("result: "+result);
	}

	public static long factorial(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result = n * factorial(n-1); // 5*factorial(4) == 5*4*factorial(3) == ...
		} return result;
	}
}
