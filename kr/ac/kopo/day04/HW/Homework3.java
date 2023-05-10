package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int a2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int a3 = sc.nextInt();
		
		
		if(a1>=a2 && a1>=a3) {
			if(a2>=a3) {
				System.out.println(a1+" "+a2+" "+a3);
			}
			else {
				System.out.println(a1+" "+a3+" "+a2);
			}
		}
		
		
		else if (a1<=a2 && a1<=a3) {
			if(a2>=a3) {
				System.out.println(a2+" "+a3+" "+a1);
			}
			else {
				System.out.println(a3+" "+a2+" "+a1);
			}
		}
		
		
		else {
			if(a2>=a3) {
				System.out.println(a2+" "+a1+" "+a3);
			}
			else {
				System.out.println(a3+" "+a1+" "+a2);
			}
		}
	}
}
