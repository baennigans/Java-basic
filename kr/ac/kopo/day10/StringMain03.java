package kr.ac.kopo.day10;

public class StringMain03 {

	public static void main(String[] args) {
		
		//indexOf
		//lastindexOf
		
		String str = "Hello World";
		char ch = 'W';
		
		System.out.println("str : ["+str+"]");
		
		int idx = str.indexOf(ch);
		System.out.println(ch+"위치 : "+idx);
		
		ch= 'p';
		System.out.println(ch+"위치 : "+str.indexOf(ch));
		
		String searchStr = "lo";
		System.out.println(searchStr +"위치 : "+str.indexOf(searchStr));
		
		ch='l';
		System.out.println("indexOf() "+ch+" 위치 : "+str.indexOf(ch));
		System.out.println("lastindexOf() "+ch+" 위치 : "+str.lastIndexOf(ch));
		System.out.println("indexOf() "+ch+" 위치 : "+str.indexOf(ch,3));
	}
}
