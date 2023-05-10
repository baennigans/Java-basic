package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
	
		
		int min = num1;
		int max = num2;
		if(num1>num2) {
			min = num2;
			max = num1;
		}
		
		if(num3 < min) {
			System.out.println(num3+" : "+min+" : "+max);
		} else if (num3 < max) {
			System.out.println(min+" : "+num3+" : "+max);
		} else {
			System.out.println(min+" : "+max+" : "+num3);
		}	
	}
}

