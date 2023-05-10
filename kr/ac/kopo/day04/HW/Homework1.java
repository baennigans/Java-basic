package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		
		double PI = 3.141592;
		double A = r*r*PI;
		double B = 2*r*PI;
		
		System.out.printf("원넓이 : %.4f\n",A);
		System.out.printf("원둘레 : %.4f",B);
		
	}
}
