package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 : ");
		int book = sc.nextInt();
		
		
		
		if(book==0) {
			System.out.println("보유하고 있는 책이 없습니다.");
		} else if(book==1) {
			System.out.println("1 book");
		} else if(book>1) {
			System.out.printf("%d books\n",book);
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		
		switch(book) {
		case 0 :
			System.out.println("보유하고 있는 책이 없습니다.");
			break;
		case 1 :
			System.out.println("1 book");
			break;
		default :
			if(book>1) {
				System.out.println(book+" books");
			}else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}
}
