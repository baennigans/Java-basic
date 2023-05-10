package kr.ac.kopo.day07.HW;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("< 5명의 성적을 입력하시오 >");
		int[] ar = new int[5];
		
		
		for(int i=0 ; i<ar.length ; i++) {
			System.out.print((i+1)+"번째 학생의 성적 : ");
			ar[i] = sc.nextInt();
		}
		System.out.println();
		
		
		
		System.out.println("< PRINT >");
		System.out.println("번호\t성적\t학점");
		int error = 0;
		
		for(int i=0 ; i<ar.length ; i++) {
			if( 0>ar[i] || ar[i]>100 ) {
				System.out.println((i+1)+"\tE R R O R !!");
				ar[i] = 0;
				error++;
			}
			else if( 9<=(ar[i]/10) && (ar[i]/10)<=10 ) {
				System.out.println((i+1)+"\t"+ar[i]+"\tA");
			}
			else if( 8<=(ar[i]/10)) {
				System.out.println((i+1)+"\t"+ar[i]+"\tB");
			}
			else if( 7<=(ar[i]/10)) {
				System.out.println((i+1)+"\t"+ar[i]+"\tC");
			}
			else if( 6<=(ar[i]/10)) {
				System.out.println((i+1)+"\t"+ar[i]+"\tD");
			}
			else { 
				System.out.println((i+1)+"\t"+ar[i]+"\tF");
			}
		}
		System.out.println();
		
		
		
		int sum = 0 ;
		double avg = 0 ;
		
		for(int i=0 ; i<ar.length ; i++) {
			sum = sum+ar[i];
			avg = (double)sum/(i+1);
		}
		System.out.println(ar.length+"명 입력 중 ["+error+"]회 에러발생");
		System.out.println("총점 : "+sum+" 점");
		System.out.println("평균 : "+avg+" 점");
	}
}
