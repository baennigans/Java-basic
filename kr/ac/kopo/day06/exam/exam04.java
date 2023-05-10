package kr.ac.kopo.day06.exam;

public class exam04 {

	public static void main(String[] args) {
		
		int height=0 , hour=0 ;
		
		while (height<=100) {
			height += 5;
			if(height<50) {
				height -= 1; 
			}else {
				height -= 2;
			}
			hour++;
			System.out.println("["+hour+"시간후] 달팽이가 올라간 총 높이 : "+height+" M");
		}
	}
}
