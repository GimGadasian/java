package ja0729;

public class RanNum {
	static int[] arr = new int[6];
	int a;
	static { // initialization block: runs before constructor
		for (int i=0; i<RanNum.arr.length;i++) {
			RanNum.arr[i] = (int)(Math.random()*45)+1; 
		}
	}

}
