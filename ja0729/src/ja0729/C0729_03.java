package ja0729;

public class C0729_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1, "1");
		Card c = new Card(); 

	}
	// overloading: add != add != add
	
	static void add(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void add(int a) {
		System.out.println(a);
		
	}
	static void add(char a) {
		System.out.println(a);
		
	}

}
