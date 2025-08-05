import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class C0805_02 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("c:/aaa/score2.txt");
		String[] str = {
	            "1.hong,100,100,100\n",
	            "2.you,100,90,90\n",
	            "3.goo,90,90,90\n",
	            "4.gam,90,90,90\n"
	        };
		for (int i=0; i<str.length;i++) {
			fw.write(str[i]);
		}
		fw.close();
		
//		String FileName = "c:/aaa/score.txt";
//		FileReader fr = new FileReader(FileName);
//		BufferedReader br = new BufferedReader(fr);
//		while(true) {
//			String line = br.readLine();
//			if (line == null) break;
//			System.out.println(line);
//		}
//		br.close();
//		fr.close();
		
		
//		try {
//			FileInputStream fis = new FileInputStream(FileName);
//			FileReader fr = new FileReader(FileName);
//			
//			int data = 0;
//			while((data=fis.read()) != -1) {
//				System.out.print((char)data);
//			} fis.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("terminated");
//		}
	}
}
