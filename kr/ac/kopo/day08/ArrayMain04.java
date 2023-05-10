package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		int loc = 0 ;
		String[] strArr = new String[] {"하이테크", "인공공지능소프트웨어과", "자바", "교육"};
		
		/*
		strArr[loc++]= "하이테크" ;
		strArr[loc++]= "인공지능소프트웨어과" ;
		strArr[loc++]= "자바" ;
		strArr[loc++]= "교육" ;
		*/
		
		
		System.out.println("< index 이용 출력 >");
		for(int i=0; i<strArr.length ; i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("< 1.5버전 for 출력 >");
		for(String str : strArr) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		
		System.out.println("< Arrays.toString() 이용 출력 >");
		System.out.println(Arrays.toString(strArr)) ;
		
//		"["+strArr[0]+","+strArr[1]+","+strArr[2]+"]"
		
	}
}
