package kr.ac.kopo.day02;

public class VariableMain02 {

	public static void main(String[] args) {
		
		
		double num1 = 12.34;
		num1 = /*(double)*/34;		
		//묵시적형변환 : double이 int보다 크기때문에 생략가능
		System.out.println("num : "+num1);

		
		int num2;
		num2 = (int)45.67;			
		//강제적(명시적)형변환 : 큰범위에있는 데이터를 작은범위에 넣을때 필요하다
		System.out.println("num2 : "+num2);
		
		
		float num3;
		num3 = (float)10.4;
		num3 = 10.5f;
		//float<double : double이 실수 기본형
		System.out.println("num3 : "+num3);
		

		System.out.println(12+(int)12.34);
		System.out.println(/*(double)*/12+12.34);
		
	}  

}
