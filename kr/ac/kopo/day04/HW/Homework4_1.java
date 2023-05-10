package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 넷을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		
		int max1 = num1 > num2 ? num1 : num2;
		int max2 = num3 > num4 ? num3 : num4;
		
		System.out.println("가장큰수 : "+(max1 > max2 ? max1 : max2));
		
		
		
		
		
		
		
	}
}