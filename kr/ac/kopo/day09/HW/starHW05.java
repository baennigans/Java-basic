package kr.ac.kopo.day09.HW;

import java.util.Scanner;

public class starHW05 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가로 라인 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int i, j;

		for (i = 1; i <= num1/2; i++) {
			for (j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= num1-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
