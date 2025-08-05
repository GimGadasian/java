import java.io.File;
import java.io.FileInputStream;

public class C0805_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		File f = new File("c:/aaa/score.txt");
		 // try catch
		try {
			FileInputStream fis = new FileInputStream(f);
			int read = 0;
			while((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
