package kr.ac.kopo.day04.HW;

import java.util.Scanner;

public class Homework2 {
	
		public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			System.out.print("물건값을 입력하세요 : ");
			int price = sc.nextInt();
			System.out.print("지불한 돈을 입력하세요 : ");
			int pay = sc.nextInt();
			
			
			int chg = pay-price;

			
			if(chg>=0) {
				System.out.println("거스름돈 : "+chg+"원");
				System.out.printf("1000원 : %d개\n",chg/1000);
				System.out.printf("500원 : %d개\n",chg%1000/500);
				System.out.printf("100원 : %d개\n",chg%1000%500/100);
				System.out.printf("50원 : %d개\n",chg%1000%500%100/50);
				System.out.printf("10원 : %d개\n",chg%1000%500%100%50/10);
				

			} else {
				System.out.printf("%d 원이 부족합니다.",chg*(-1));
			}
		
	}
}
