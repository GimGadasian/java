package ja0723;

public class C0723_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		
		for (i=2; i<10; i++) {System.out.printf("%d단\t\t", i);}
		
		System.out.println("");	
		for (i=2; i<10; i++) {
			for (j=2; j<10; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, i*j);	
			}
			System.out.println("");	
		}
	}

}
