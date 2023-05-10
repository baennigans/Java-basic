package kr.ac.kopo.day03;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int num1= 12 , num2 = 2;
		
		boolean bool1= ( num2 != 0 && num1 % num2 == 0);
		
		System.out.printf("%d는 %d의 배수판단 : %b\n",num1,num2,bool1);
	}

}
