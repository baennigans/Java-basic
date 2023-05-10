package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str01 = "Hello World";
		String str02 = "hello World";
		String str03 = new String("Hello World");
		
		System.out.println("str01 : [ "+str01+" ]");
		System.out.println("str02 : [ "+str02+" ]");
		System.out.println("str03 : [ "+str03+" ]");
		
		
		//주소비교
		if(str01==str02) {
			System.out.println("[ 주소비교 ]str01==str02");
		}else {
			System.out.println("[ 주소비교 ]str01!=str02");
		}
		
		if(str01==str03) {
			System.out.println("[ 주소비교 ]str01==str03");
		}else {
			System.out.println("[ 주소비교 ]str01!=str03");
		}
		
		
		//값비교 (대소문자 구분O)
		boolean bool = str01.equals(str02);
		if (bool){
			System.out.println("[ 값비교 ]str01 == str02");
		}else {
			System.out.println("[ 값비교 ]str01 != str02");
		}
		//값비교 (대소문구분X)
		bool= str01.equalsIgnoreCase(str02);
		if (bool){
			System.out.println("[ 값비교 ]str01 == str02");
		}else {
			System.out.println("[ 값비교 ]str01 != str02");
		}
		
		
		//equals
		String[] names = {"홍길동", "강길동", "홍길순", "홍길동", "김길순", "김"};
		System.out.println("names : "+Arrays.toString(names));
		System.out.println("< 홍길동인 사람을 검색 >");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		//startsWith
		System.out.println("< 홍씨성을 가진 사람을 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		//endsWith (확장자검색)
		System.out.println("< 이름이 길동인 사람을 검색 >");
		for(String name: names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		//contains
		System.out.println("< \"길동\"이 포함된 사람을 검색 >");
		for(String name : names) {
			if(name.contains("길동")) {
				System.out.println(name);
			}
		}
		
		//compareTo
		str01="banana";
		str02="boat";
		
		int cmp = str01.compareTo(str02);
		if(cmp==0) {
			System.out.println(str01+"=="+str02);
		}else if(cmp>0) {
			System.out.println(str02+" < "+str01);
		}else {
			System.out.println(str01+" < "+str02);
		}
		
		
	}
}
