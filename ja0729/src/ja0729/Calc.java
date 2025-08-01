package ja0729;

public class Calc {
	double result; // instance variable
	
	void add(int a, int b) {
		result = a + b;
		System.out.println("addition: "+(int)result); // cast the value
	} // add
	
	void subt(int a, int b) {
		result = a - b;
		System.out.println("subtraction: "+(int)result);
	} // subt
	
	void mult(int a, int b) {
		result = a * b;
		System.out.println("multiplication: "+(int)result); 
	} // mult
	
	void div(int a, int b) {
		result =  (double)a / b;
		System.out.println("division: "+result);
	} // div
	
	void all(int a, int b, double[] all) {
		all[0] = a + b;
		all[1] = a - b;
		all[2] = a * b;
		all[3] = (double)a / b;
		System.out.println("addition: "+(int)all[0]);
		System.out.println("subtraction: "+(int)all[1]);
		System.out.println("multiplication: "+(int)all[2]);
		System.out.println("division: "+all[3]);
	} // all
	
}
