package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {

	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		System.out.print("출력할 프린터 번호를 선택하세요(1.LG / 2.SAMSUNG / 3.HP) : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		Printer p = null;
		switch(choice) {
		case 1 :
			p = new LGPrinter();
			break;
		case 2 :
			p = new SamsungPrinter();
			break;
		case 3 : 
			p = new HPPrinter();
			break;
		default :
			System.out.println("잘못입력하였습니다.");
		}
		if(p != null) {
			p.print();
		}
		
		
		
//		switch(choice) {
//		case 1 :
//			Printer lg = new LGPrinter();
//			lg.print();
//			break;
//		case 2 :
//			Printer sam = new SamsungPrinter();
//			sam.print();
//			break;
//		}
	}
}

