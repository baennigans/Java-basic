package kr.ac.kopo.day08.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] PrimeArr = new int[10][20];
		int[] NumArr = new int[10];
		
		System.out.println("자연수를 입력하세요. 0입력시 종료됩니다.");
	
		for(int i=0 ; i<PrimeArr.length ; i++) {
			System.out.print(i+1+"번째 정수 : ");
			int num = sc.nextInt();
			
			if(num==0) { 
				break;
			}
			else {
				NumArr[i]=num;
				for(int j=1 , k=0; j<=num ; j++) {
					if(num%j==0) {
						PrimeArr[i][k]= j;
						k++;
					}
				}
			}
		}
		System.out.println();
		
		
		for(int i=0 ; i<PrimeArr.length ; i++) {
			if(NumArr[i] > 0) {
				System.out.print(NumArr[i]+"의 약수 : ");
				for(int j=0 ; j<PrimeArr[0].length ; j++) {
					if(PrimeArr[i][j] > 0) {
						System.out.print(PrimeArr[i][j]+"  ");
					}
				}
				System.out.println();
			}
		}
	}
}
