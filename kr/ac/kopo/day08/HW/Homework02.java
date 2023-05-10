package kr.ac.kopo.day08.HW;

import java.util.Scanner;

public class Homework02 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
		
		Student[] StuArr = {stu1, stu2, stu3, stu4, stu5};
		
		for(int i=0 ; i<StuArr.length; i++) {
			System.out.print((i+1)+"번째 학생의 성적을 입력하세요 : ");
			StuArr[i].number = i+1;
			StuArr[i].score = sc.nextInt();
		}
		System.out.println("\n< PRINT >\n번호\t성적\t학점");
		
		int error = 0 ;
		int sum = 0 ;
		
		for(int i=0; i<StuArr.length; i++) {
			
			if(StuArr[i].score>=0 && StuArr[i].score<=100) {
				
				if(StuArr[i].score/10 >= 9) {
					StuArr[i].grade = 'A';
				}else if(StuArr[i].score/10 >= 8){
					StuArr[i].grade = 'B';
				}else if(StuArr[i].score/10 >= 7) {
					StuArr[i].grade = 'C';
				}else if(StuArr[i].score/10 >= 6) {
					StuArr[i].grade = 'D';
				}else {
					StuArr[i].grade = 'F';
				}
				System.out.println(StuArr[i].number+"\t"+StuArr[i].score+"\t"+StuArr[i].grade);
				sum = sum + StuArr[i].score;
			}else {
				System.out.println(StuArr[i].number+"\tE R R O R ! !");
				error++;
			}
		}
		System.out.println();
		
		
		System.out.printf("%d명 입력 중 [%d]회 에러발생\n" , StuArr.length , error);
		System.out.printf("총점 : %d\n", sum);
		System.out.println("평균 : "+(double)sum/StuArr.length+"점");
	}
}
	
