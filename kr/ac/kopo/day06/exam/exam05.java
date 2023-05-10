package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2-9사이의 단을 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("*** "+num1+" 단 ***");
		
		for(int i=1; i<=9 ; i++) {
			System.out.println(num1+" * "+i+" = "+(num1*i));
		}
	}
}
