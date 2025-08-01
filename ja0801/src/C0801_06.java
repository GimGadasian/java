
public class C0801_06 {
	public static void main(String[] args) {
		String[] strArr = {"a.txt", "b.hwp", "c.xls", "d.txt", "e.png", "f.jpg"};
		int count = 0;
		for (int i=0; i<strArr.length; i++) {
			if (strArr[i].endsWith("txt")|| strArr[i].endsWith("jpg")) {
				count++;
			} 
		} System.out.println(count);
	} 
	
}
