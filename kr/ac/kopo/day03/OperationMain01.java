package kr.ac.kopo.day03;

public class OperationMain01 {

	public static void main(String[] args) {

		int num = 123;
		System.out.println("num : "+num);
		
		//num = num + 50;
		num += 50;				//복합대입연산자, 배정연산자 : += -= *= /= %=
		System.out.println("num : "+num);

		++num;					//증가연산자
		System.out.println("num : "+num);
		num+=1;
		System.out.println("num : "+num);
		num++;
		System.out.println("num : "+num++);
		System.out.println("num : "+(++num));
								// ++a : 전위증가	, a++ : 후위증가
		
		
		
		int a = 5;
		int b = a++;
		System.out.println("a : "+a+"\tb : "+b);
		
		a=5;
		b=++a;
		System.out.println("a : "+a+"\tb : "+b);
		
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		boolean c = a==b;
		System.out.println("c : "+c);
		System.out.println("c : "+!c);
		
		
	}
}
