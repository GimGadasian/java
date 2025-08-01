import java.io.File;

public class C0801_01 {
	 public static void main(String[] args) throws Exception{
		 
		 String folder = "c:/aaa/";
		 File fo = new File(folder);
		 if(!fo.exists()) {
			 fo.mkdirs(); // 폴더 생성
			 System.out.println("폴더 생성");
		 }
		 
		File f = new File("c:/aaa/abcd.txt"); // 폴더는 생성하지 앟음
		f.createNewFile();
//		try {
//			f.createNewFile();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		System.out.println("fin");
	}
}
