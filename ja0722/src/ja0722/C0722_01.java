package ja0722;

public class C0722_01 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		char c = (char)1;
		int i = 1;
		long l = 1l;
		float f = 1f;
		double d = 1;
		String st = "1";
		
		System.out.print("byte: " + b + "\nshort: " + s + "\nchar: " + c + "\nint: " + i + "\nlong: " + l + "\nfloat: " + f + "\ndouble: " + d + "\nString: " + st + "\n");

		String str = "10";
		int j = Integer.parseInt(str);
		
		System.out.println("\nString+10: "+str+10);
		System.out.println("int+10: "+(j+10));
		
		
	}

}
