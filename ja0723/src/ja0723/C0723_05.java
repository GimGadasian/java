package ja0723;

public class C0723_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		/* 
		for (i=1; i<10+1; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		/*
		while (sum <= 100) {  
	        i++;
	        sum += i;
	    }
	    System.out.printf("attempt %d: %d\n", i, sum);
	    */
		
		while (sum <= 500) {  
	        i++;
	        sum += i;
	    }
	    System.out.printf("attempt %d: %d\n", i-1, sum-i);
	} 

}
