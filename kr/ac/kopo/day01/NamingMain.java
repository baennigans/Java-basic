package kr.ac.kopo.day01;

/*
 	명명규칙에 의거하여 클래스,변수,메소드 구분하기
 	클래스 : NamingMain, String, Integer, System   -대문자로 시작하는것 전부
 	메소드 : main(), parseInt(), println()         -괄호가 있는것 전부
 	변수	 : args, no, out                         -소문자만    
 */

public class NamingMain {

	public static void main(String[] args) {
		
		int no;
		
		no = Integer.parseInt("123");
		
		System.out.println(no);

	}
}

//Naming 클래스
//Integer 클래스
//parseInt 메소드