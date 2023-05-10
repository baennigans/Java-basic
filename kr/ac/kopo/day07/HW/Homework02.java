package kr.ac.kopo.day07.HW;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
			
			
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];

		
		System.out.println("< 0-99 사이의 정수를 5개 입력하시오 >");	
		int i = 0;
		while(i<ar.length) {
			System.out.print("num"+(i+1)+" : ");
			ar[i] = sc.nextInt();
			if(0<=ar[i] && ar[i]<=99) {
				i++;
			}
		}
		System.out.println();
		
		
		
		System.out.println("< PRINT >");
		for(int j=0 ; j<ar.length ; j++) {
			System.out.print(ar[j]+"  ");
		}
		System.out.println();
		
		
		
		System.out.println("< REVERSE >");
		for(int j=0 ; j<ar.length ; j++) {
			System.out.print((ar[ar.length-1-j]/10)+(ar[ar.length-1-j]%10*10)+"  ");
		}
		System.out.println();
	}
}

