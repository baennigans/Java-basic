package kr.ac.kopo.day13.HW;

import java.util.Scanner;

public class Rectangle extends Figure{

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void area() {
		
		System.out.print("밑변을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		int j = sc.nextInt();
		System.out.println("밑변 "+i+", 높이 "+j+"의 직사각형의 넓이는 "+(i*j)+"입니다.");
		
	}
}
