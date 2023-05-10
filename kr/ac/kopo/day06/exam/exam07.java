package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("종료단을 입력 : ");
		int num2 = sc.nextInt();
		
	
		int start = num1<=num2 ? num1:num2;
		int end = num1<=num2 ? num2:num1;
		
		
		for(int i=start ; i<=end ; i++) {
			System.out.println("*** "+i+"단 ***");
			for(int j=1 ; j<=9 ; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
