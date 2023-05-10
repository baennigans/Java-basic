package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int[] dest = new int[arr.length];
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("dest : "+Arrays.toString(dest));
		

		
		//arraycopy
		System.arraycopy(arr, 3, dest, 1, 3);
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("dest : "+Arrays.toString(dest));
	}
}

