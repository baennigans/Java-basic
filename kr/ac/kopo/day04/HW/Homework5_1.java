package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책권수 입력 : ");
		int book = sc.nextInt();
		
		if(book<0) {
			System.out.println("잘못입력");
		} else if (book == 0) {
			System.out.println("보유 책 없음");
		} else if (book == 1) {
			System.out.println("1book");
		} else {
			System.out.println(book+" books");
		}
	}
}
