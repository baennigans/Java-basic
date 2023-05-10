package kr.ac.kopo.day15.HW;

public class ScissorsRockPaper implements Game{

	final static int SCISSOR = 1 ;
	final static int ROCK = 2 ;
	final static int PAPER = 3 ;
	static int draw=0; 
	static int lose=0;
	
	public int startGame(int you) {
		
		
		int me = r.nextInt(3);
		me = me+1;
		
		if(me==you) {
			System.out.println("비겼습니다.");
			draw++;
			return 0;
		}else{
			if(you== 1) {
				if(me== 2) {
					System.out.println("You win");
					return 1;
				}else {
					System.out.println("You lose");
					lose++;
				}
			}else if(you== 2){
				if(me== 3) {
					System.out.println("You win");
					return 1;
				}else {
					System.out.println("You lose");
					lose++;
				}
			}else {
				if(me== 1) {
					System.out.println("You win");
					return 1;
				}else {
					System.out.println("You lose");
					lose++;
				}
			}
			return 0;
		}
	}
	
}
