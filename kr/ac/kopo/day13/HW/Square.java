package kr.ac.kopo.day13.HW;

import java.util.Scanner;

public class Square extends Rectangle{

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void area() {
		
		System.out.print("한변의 길이를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("가로"+i+", 세로"+i+"의 정사각형의 넓이는 "+i*i+"입니다.");
		
	}
}
