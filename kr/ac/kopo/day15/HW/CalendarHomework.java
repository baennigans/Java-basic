package kr.ac.kopo.day15.HW;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarHomework {
	
	Scanner sc = new Scanner(System.in);
	
	int yyyy;
	int mm;
	
	
	// 항목선택하기
	public int choice() {
		
		System.out.print("원하는 항목을 선택하세요( 1.특정년도 / 2.특정월 / 3.종료 ) => ");
		int num = sc.nextInt();
		return num;
	}
	
	
	// 선택한 항목에 맞는 입력값 넣기
	public void view(int num) {
		
		switch(num) {
		case 1 :
			System.out.print("년도를 선택하세요 : ");
			yyyy = sc.nextInt();
			
			System.out.println("===================== "+yyyy+"년 =====================\n");
			for(int i=0; i<12; i++) {
				System.out.println("----------------------- "+(i+1)+"월 -----------------------");
				makeCal(yyyy, i+1);
			}
			break;
			
		case 2 :
			System.out.print("년도를 입력하세요 : ");
			yyyy = sc.nextInt();
			sc.nextLine();
			System.out.print("월을 입력하세요 : ");
			mm = sc.nextInt();
			
			System.out.println("-------------------- "+yyyy+"년 "+mm+"월 --------------------");
			makeCal(yyyy, mm);
			break;
			
		case 3 : 
			System.out.println("종료하였습니다.");
			System.exit(0);
			
		default :
			System.out.println("잘못입력하였습니다.");
		}
	}
	
	
	// 년과 월을 입력하면 그 달의 달력 만들기
	public void makeCal(int yyyy, int mm) {
		
		this.yyyy=yyyy;
		this.mm=mm;
		
		Calendar c = Calendar.getInstance();
		
		// day=이번달 1일 위치 , day2=다음달 1일 위치
		c.set(yyyy, mm-1, 1);
		int day= c.get(Calendar.DAY_OF_WEEK);
		day=day-1;
		c.set(yyyy, mm, 1);
		int day2 = c.get(Calendar.DAY_OF_WEEK);
		day2=day2-1;
		
		int date=1;
		int[][] calArr = new int[6][7];
		
		// 6x7 배열을 만들고 첫번째 배열에 시작일부터 날짜넣기
		for(int i=0; i<=calArr.length; i++) {
			if(i>=day) {
				calArr[0][i]=date;
				date++;
			}
		}
		
		// 두번째배열부터 다음달 1일 위치 전까지 날짜넣기
		for(int i=0; i<calArr.length-1; i++) {
			for(int j=0; j<calArr[i].length; j++) {
				calArr[i+1][j]=date;
				date++;
				if(date>=28 && day2==j) {
					calArr[i+1][j]=0;
					break;
				}
			}
			if(calArr[i+1][day2]==0) {
				break;
			}
		}
		
		// 0자리는 공백처리 후 배열 출력
		for (int[] cal : calArr) {
			for (int cal2 : cal) {
				if(cal2==0) {
					System.out.print("\t");
				}else {
					System.out.print(cal2+"\t");
				}
			}
			System.out.println();
		}
	}
}
