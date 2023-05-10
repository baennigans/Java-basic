package kr.ac.kopo.day06.exam;

public class exam04_1 {

	public static void main(String[] args) {
		
		int height=0 , hour=0 ;
		
		/*
		while ((height+=5)<=100) {
			
			if(height<50) {
				height -= 1; 
			}else {
				height -= 2;
			}
			hour++;
			System.out.println("["+hour+"시간후] 달팽이가 올라간 총 높이 : "+height+" M");
		}
		System.out.println("["+hour+"시간후] 달팽이가 올라간 총 높이 : "+height+" M");
		
		
		*/
		
		while(height<100) {
			height += ( height<50 ? 5-1 : 5-2);
			System.out.printf("[ %d 시간후] 달팽이가 올라간 총 높이 : %d M \n",++hour,height);
		}
	}
}
