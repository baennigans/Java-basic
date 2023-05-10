package kr.ac.kopo.day09;

public class MethodMain01 {
	
	//피호출자 메소드
	static int prnStar(int num, String data) {
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 : "+num);
		System.out.println("호출자가 넘겨준 문자열 : "+data);
		int sum = num%10 + num/10;
		
		return sum ;
	}

	
	//호출자 메소드
	public static void main(String[] args) {
		
		
		int cnt = 10;
		int s = prnStar(cnt,"abc");
		System.out.println("자리수 합 : "+s);
		System.out.println("Hello");
		
		s = prnStar(5,"hi");
		System.out.println("자리수 합 : "+s);
		System.out.println("Hi");
		
		s = prnStar(22,"good");
		System.out.println("자리수 합 : "+s);
		System.out.println("Good-bye");
		
		s = prnStar(9,"bye");
		System.out.println("자리수 합 : "+s);
	}
}
