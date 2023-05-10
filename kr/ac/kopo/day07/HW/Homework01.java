package kr.ac.kopo.day07.HW;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[10];
		
		System.out.println("< 10개의 정수를 입력하시오 >");
		for(int i=0 ; i<ar.length ; i++) {
			System.out.print("num"+(i+1)+" : ");
			ar[i] = sc.nextInt();
		}
		System.out.println();
		
		
		System.out.println("< 짝 수 >");
		for(int i=0; i<ar.length ; i++) {
			if(ar[i]%2==0 && ar[i]>0) {
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
		
		
		System.out.println("< 홀 수 >");
		for(int i=0; i<ar.length ; i++) {
			if(ar[i]%2==1) {
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
	}
}
