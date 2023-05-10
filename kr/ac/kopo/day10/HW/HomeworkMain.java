package kr.ac.kopo.day10.HW;

public class HomeworkMain {

	public static void main(String[] args) {
		
		
		Homework one = new Homework();
		char c1 = one.getChar("하나의 문자를 입력하시오 : ");
		boolean bool1 = one.isUpperChar(c1);
		System.out.println("대문자여부 : "+bool1);
		
		Homework two = new Homework();
		char c2 = two.getChar("하나의 문자를 입력하시오 : ");
		boolean bool2 = two.isLowerChar(c2);
		System.out.println("소문자여부 : "+bool2);
		
		Homework three = new Homework();
		int i1 = three.getInt("첫번째 정수를 입력하시오 : ");
		int i2 = three.getInt("두번째 정수를 입력하시오 : ");
		int max = three.max(i1, i2);
		System.out.println("큰 수 : "+max);
		
		Homework four = new Homework();
		int i3 = four.getInt("첫번째 정수를 입력하시오 : ");
		int i4 = four.getInt("첫번째 정수를 입력하시오 : ");
		int min = four.min(i3, i4);
		System.out.println("작은 수 : "+min);
		
		Homework five = new Homework();
		String s1 = five.getString("문자열을 입력하시오 : ");
		String reverse = five.reverseString(s1);
		System.out.println("거꾸로 : "+reverse);
		
		Homework six = new Homework();
		String s2 = six.getString("문자열을 입력하시오 : ");
		String upper = six.toUpperString(s2);
		System.out.println("대문자로 변경 : "+upper);
		
		Homework seven = new Homework();
		String s3 = seven.getString("문자열을 입력하시오 : ");
		String lower = seven.toLowerString(s3);
		System.out.println("소문자로 변경 : "+lower);
	
		Homework eight = new Homework();
		String s4 = eight.getString("첫번째 문자열을 입력하시오 : ");
		String s5 = eight.getString("두번째 문자열을 입력하시오 : ");
		int compare = eight.compareTo(s4, s5);
		System.out.println("문자열 크기비교 : "+compare);
		
		Homework nine = new Homework();
		String s6 = nine.getString("문자열을 입력하시오 : ");
		String s7 = nine.getString("검색할 문자열을 입력하시오 : ");
		boolean bool3 = nine.endsWith(s6, s7);
		System.out.println("'"+s7+"' 로 끝나는지 여부판단 : "+bool3);
		
		Homework ten = new Homework();
		String s8 = ten.getString("문자열을 입력하시오 : ");
		String s9 = ten.getString("검색할 문자열을 입력하시오 : ");
		int location = ten.indexOf(s8, s9);
		System.out.println("'"+s9+"은 "+location+"번지에 위치함");
		
		Homework eleven = new Homework();
		String s10 = eleven.getString("문자열을 입력하시오 : ");
		char c3 = eleven.getChar("문자를 입력하시오 : ");
		int count = eleven.checkChar(s10, c3);
		System.out.println("'"+c3+"'의 개수 : "+count);
		
		Homework twelve = new Homework();
		String s11 = twelve.getString("문자열을 입력하시오 : ");
		char c4 = twelve.getChar("문자를 입력하시오 : ");
		String remove = twelve.removeChar(s11, c4);
		System.out.println("'"+c4+"' 제거 : "+remove);
			
	}
}
