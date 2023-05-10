package kr.ac.kopo.day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] ar = new double[3];
		
		for(int i=0 ; i<ar.length ; i++) {
			System.out.print((i+1)+"번째 실수 : ");
			ar[i] = sc.nextDouble();
		}
		
		
		//방법1
		System.out.println("< index를 이용한 출력 >");
		for(int i=0 ; i<ar.length ; i++) {
			System.out.print(ar[i]+"\t");
		}
		System.out.println();
		
		
		//방법2
		System.out.println("< 1.5버전의 for문을 아용한 출력 >");
		for( double data : ar ) {
			System.out.print(data+"\t");
		}
		System.out.println();
		
		
		//방법3
		System.out.println("< Arrays.toString() 이용한 출력 >");
		System.out.println(Arrays.toString(ar));
	}
}
