package kr.ac.kopo.day10;

public class MethodExamMain {

	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam();
		
		int total = exam.getTotal(10, 100);
		System.out.println("10 ~ 100 사이의 총합 : "+total);
		
		exam.printGugu(5);
		exam.printGugu();
		
		System.out.print("시작단 : ");
		int startDan = exam.getDan();
		System.out.print("종료단 : ");
		int endDan = exam.getDan();
		exam.printGugu(startDan,endDan);
		
	}
}

//-locale ko_KR -encoding utf-8 -charset utf-8 -docencoding utf-8