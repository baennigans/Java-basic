package kr.ac.kopo.day13.HW;

import java.util.Scanner;

public class FigureArea {

	public void area() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.삼각형 / 2.정사각형 / 3.직사각형 / 4.원");
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		Figure f = null;
		
		switch(choice) {
		case 1 : 
			f = new Triangle();break;
		case 2 :
			f = new Square();break;
		case 3 :
			f = new Rectangle();break;
		case 4 : 
			f = new Circle();break;
		default :
			System.out.println("잘못입력하였습니다.");
		}
		
		
		if(f != null) {
			f.area();			
		}
	}
	
	
}

