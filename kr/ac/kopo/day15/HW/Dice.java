package kr.ac.kopo.day15.HW;

public class Dice implements Game {
	
	static int lose=0;
	
	public int startGame(int you) {

		int me = r.nextInt(6);
		me = me+1;
		
		if(me==you) {
			System.out.println("You win");
			return 1;
		}else {
			System.out.println("You lose");
			lose++;
			return 0;
		}
	}
}
