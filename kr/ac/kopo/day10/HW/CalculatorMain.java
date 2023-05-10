package kr.ac.kopo.day10.HW;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator(num1, num2);
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		cal.primeNum();
		
	}
}
