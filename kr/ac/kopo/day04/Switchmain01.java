package kr.ac.kopo.day04;

import java.util.Scanner;

public class Switchmain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수 : ");
		int no = sc.nextInt();
		
		/*
		if(no==1) {
			System.out.println("ONE");
		} else if(no==2) {
			System.out.println("TWO");	
		} else if(no==3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
		
		
		switch(no) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");
		}
	}
}
