package kr.ac.kopo.day05.HW;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수값을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int i , j ;
		for(i=1 ; i<=num1 ; i++) {
			for(j=1 ; j<=num1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
