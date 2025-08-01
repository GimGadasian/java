package ja0728;

import java.util.Scanner;

public class Prime {
	void round(double num, int round_point) {
		double x = Math.pow(10, round_point-1);
		double res = Math.round(num *x)/x;
		System.out.println("round: "+res);
	}
	void ceil(double num, int round_point) {
		double x = Math.pow(10, round_point-1);
		double res = Math.ceil(num *x)/x;
		System.out.println("ceil: "+res);
	}
	void floor(double num, int round_point) {
		double x = Math.pow(10, round_point-1);
		double res = Math.floor(num *x)/x;
		System.out.println("floor: "+res);
	}
	
}
