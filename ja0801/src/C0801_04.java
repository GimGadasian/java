
public class C0801_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"a", "b", "c"};
		String[] str2 =new String[4];
		
		for(int i=0; i<str.length; i++) {
			str2[i] = str[i].concat("_list");
			System.out.println(str2[i]);
		}

	}

}
