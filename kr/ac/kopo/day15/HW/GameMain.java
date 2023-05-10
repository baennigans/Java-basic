package kr.ac.kopo.day15.HW;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		int score=0;
		int lose=0;
		
		while(true) {
			
			System.out.println("---------------------------------------");
			System.out.println("게임을 선택하세요");
			System.out.print("A.가위바위보 / B.주사위 값 맞추기 / C.종료 ==> ");
			Scanner sc = new Scanner(System.in);
			char choice1 = sc.next().charAt(0);
			sc.nextLine();
			
			switch(choice1) {
			case 'A' :
				ScissorsRockPaper srp = new ScissorsRockPaper();
				System.out.println("가위바위보 게임입니다. 가위바위보중 하나를 선택하세요.");
				System.out.print("1.가위 / 2.바위 / 3.보 ==> ");
				int choice2 = sc.nextInt();
				sc.nextLine();
				score += srp.startGame(choice2);
				if(score==0){
					lose++;
				}
				break;
				
			case 'B' :
				Dice dc = new Dice();
				System.out.println("주사위값 맞추기 게임입니다. 주사위를 선택하세요.");
				System.out.print("1 ~ 6 값 중 하나 ==> ");
				int choice3 = sc.nextInt();
				sc.nextLine();
				score += dc.startGame(choice3);
				break;
				
			case 'C' :
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임전적은 "+score+"승 "+ScissorsRockPaper.draw+"무 "+(ScissorsRockPaper.lose+Dice.lose)+"패 입니다.");
				System.exit(0);
				
			default :
				System.out.println("잘못눌렀습니다. 다시입력하세요");
				break;
			}
		}
	}
}
