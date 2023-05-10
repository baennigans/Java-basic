package kr.ac.kopo.day09.HW;

import java.util.Scanner;

public class starHW03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("라인 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		for (int i = 1; i <= (2*num1)-1; i++) {
			if (i <= num1) {
				for (int j = 1; j <= num1+1-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; i >= num1-1+j; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
