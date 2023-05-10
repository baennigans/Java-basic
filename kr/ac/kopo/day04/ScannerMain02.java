package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		System.out.println("str : "+str);
	}
}
