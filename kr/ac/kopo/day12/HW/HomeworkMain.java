package kr.ac.kopo.day12.HW;

public class HomeworkMain {
	
	public static void main(String[] args) {
		
		Homework hw = new Homework();
		
		int i = hw.pickNum();
		
		
		switch(i) {
		case 1 :
			hw.triangle();break;
		case 2 :
			hw.square();break;
		case 3 :
			hw.rectangle();break;
		case 4 : 
			hw.circle();break;
		default :
			System.out.println("잘못 선택하였습니다.");
		}
	}
}
