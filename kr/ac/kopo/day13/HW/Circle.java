package kr.ac.kopo.day13.HW;

import java.util.Scanner;

public class Circle extends Figure{

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void area() {
		
		System.out.print("반지름의 길이를 입력하세요 : ");
		int r = sc.nextInt();
		System.out.println("반지름이 "+r+"인 원의넓이는 "+(r*r*Math.PI)+"입니다.");
		
	}
}
