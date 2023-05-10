package kr.ac.kopo.day10.HW;

public class Calculator {

	
	int num1 , num2; 
	
	Calculator(){
		
	}
	
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	//더하기
	void add() {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	//빼기
	void sub() {
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	//곱하기
	void mul() {
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
	//나누기
	void div() {
		System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
	}
	
	
	//소수체크
	void primeNum() {
		boolean bool1=true, bool2=true;
		for(int i=2; i<num1; i++) {
			if(num1%i==0) {
				bool1 = false;
			}
		}
		System.out.println(num1+" 소수체크 : "+bool1);
		
		for(int i=2; i<num2; i++) {
			if(num2%i==0) {
				bool2 = false;
			}
		}
		System.out.println(num2+" 소수체크 : "+bool2);
	}
	
}
