package ja0724;

import java.util.Arrays;

public class C0724_02 {
	public static void main(String[] args) {
		int arr1[] = {0, 0, 0};
		int arr2[]= {10, 10, 10};
		// different address
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr2 = arr1;
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 100;
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr2)); // shallow copy: copies address
		// same address
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
