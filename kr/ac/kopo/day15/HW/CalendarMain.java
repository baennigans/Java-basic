package kr.ac.kopo.day15.HW;

public class CalendarMain {
	
	public static void main(String[] args) {
		
		CalendarHomework cld = new CalendarHomework();
		
		while(true) {
			int no = cld.choice();
			cld.view(no);
		}
	}
}

