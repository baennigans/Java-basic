package kr.ac.kopo.day14.HW;

public class BaseballMain {

	public static void main(String[] args) {
		
		
		Baseball game = new Baseball();
		
		System.out.println("< 숫자야구 게임을 시작합니다 >\n");
		game.random();
		
		for(int i=0; i<=5; i++) {
			game.getNum((i+1)+"번째 기회입니다. : ");
			game.play();
			game.result();
			int jdg = game.judge();
			if(jdg==1) {
				break;
			}
			System.out.println();
		}
	}
}

