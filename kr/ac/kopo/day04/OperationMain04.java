package kr.ac.kopo.day04;


public class OperationMain04 {
	
	public static void main(String[] args) {
		
		int num1= 15 , num2 = 4;
//		String msg = true? "배수다":"배수가아니다";
//		System.out.println( 10>4 ? "배수다":"배수가아니다");
		
		boolean bool1= ( num2 != 0 && num1 % num2 == 0);
		
		String result = bool1 ? "배수입니다.":"배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n",num1,num2,result);
		
		
		int a = 10, b = 5;
		int max = a>b? a:b;
		
		System.out.println(max);
		
	}
}
