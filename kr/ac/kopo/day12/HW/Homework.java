package kr.ac.kopo.day12.HW;

import java.util.Scanner;

public class Homework {

	Scanner sc = new Scanner(System.in);
	
	Homework(){
		
	}
	
	public int pickNum() {
		System.out.println("1.삼각형 , 2.정사각형 , 3.직사각형 , 4.원");
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		int i = sc.nextInt();
		return i;
	}
	
	public void triangle() {
		System.out.print("밑변을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		int j = sc.nextInt();
		System.out.println("밑변"+i+" 높이"+j+" 의 삼각형의 넓이는 "+i*j/2+"입니다.");
	}
	
	public void square() {
		System.out.print("한변의 길이를 입력하세요 :");
		int i = sc.nextInt();
		System.out.println("가로"+i+" 세로"+i+" 의 정사각형의 넓이는 "+i*i+"입니다.");
	}
	
	public void rectangle() {
		System.out.print("밑변을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		int j = sc.nextInt();
		System.out.println("밑변"+i+" 높이"+j+" 의 직사각형의 넓이는 "+i*j+"입니다.");
	}
	
	public void circle() {
		System.out.print("반지름을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("반지름"+i+"의 원의 넓이는 "+Math.PI*i*i+"입니다.");
	}
}
