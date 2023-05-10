package kr.ac.kopo.day09.HW;

import java.util.Scanner;

public class starHW04 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가로 라인 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int i, j;

		for (i = 1; i <= (2*num1)-1; i++) {
			if (i <= num1) {
				for (j = 1; j <= num1-i; j++) {
					System.out.print(" ");
				}
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (j = 1; j <= i-num1; j++) {
					System.out.print(" ");
				}
				for (j = 1; j <= (2*num1)-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
