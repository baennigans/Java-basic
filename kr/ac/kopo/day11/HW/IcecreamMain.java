package kr.ac.kopo.day11.HW;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {

		Icecream ice = new Icecream();
		Scanner sc = new Scanner(System.in);

		
//		while (true) {
			
			System.out.print("아이스크림 몇개 구입할래 ? : ");
			int iceNum = sc.nextInt();
			System.out.println();

			String[] iceName = new String[iceNum];
			int[] icePrice = new int[iceNum];
			int totalPrice = 0;
//			int payMoney = 0;
			int buyCnt = 1;

			
			for (int i = 0; i < iceNum; i++) {
				System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 정보 입력 ***");
				iceName[i] = ice.iceName();
				icePrice[i] = ice.icePrice();
				totalPrice += icePrice[i];
			}

			System.out.println("\n< 총 4개의 아이스크림 구매 정보 출력 >\n번호\t아이스크림명\t아이스크림가격");
			
			for (int i = 0; i < iceNum; i++) {
				System.out.println(" " + (i + 1) + "\t" + iceName[i] + "\t\t" + icePrice[i]);
			}
			System.out.println("\n총합 : "+totalPrice+" 원");
//			payMoney += totalPrice;
			
			
//			System.out.print("계속 구매할래? (Y/N) ==> ");
//			char c = sc.nextLine().charAt(0);
//			if(c !='y' || c !='Y') {
//				System.out.println("총 "+buyCnt+"번의 구매정보 발생");
//				System.out.println("총계 : "+payMoney);
//				break;
//			}
//			buyCnt++;
//		}
	}
}
