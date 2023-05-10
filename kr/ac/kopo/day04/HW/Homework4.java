package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int a2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int a3 = sc.nextInt();
		System.out.print("네번째 정수를 입력하세요 : ");
		int a4 = sc.nextInt();
		
		int b1 = a1;
		
		if(a2>=b1){
			b1=a2;
		}
		if(a3>=b1) {
			b1=a3;
		}
		if(a4>=b1) {
			b1=a4;
		}
		
		
		System.out.println(b1);
	}
}
