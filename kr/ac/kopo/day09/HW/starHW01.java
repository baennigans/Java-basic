package kr.ac.kopo.day09.HW;

import java.util.Scanner;

public class starHW01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("라인 수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=(num-i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
