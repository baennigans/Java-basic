package kr.ac.kopo.day01;

/*
	System.out.출력메소드()
	print()		:개행문자X
	println()	:개행문자O
	printf()	: %d 정수
				  %f 실수
				  %c 문자
				  %s 문자열
				  %d 
*/

public class PrintMain {

	public static void main(String[] args) {
		
		
		System.out.println("Hello World");
		System.out.println('A'+"\t"+"B");
		
		
		//방법1
		System.out.print('A');
		System.out.print("\n");
		//방법2
		System.out.print("A\n");
		//방법3
		System.out.println('A');

		
		//10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		//이렇게합시다
		System.out.println(10+" "+12.34+" "+"홍길동");
		
		
		//printf
		System.out.printf("%d"+"\n",00003);
		//정수, 실수, 문자열
		System.out.printf("%d %f %c %s\n",10,12.34,'A',"홍길동");
		//소수점2번째
		System.out.printf("%d %.2f %s\n",10,12.34,"홍길동");
		//반올림
		System.out.printf("%d %.1f %s\n",10,12.36,"홍길동");
		//올림,절삭은 +0.05,-0.05
		System.out.printf("%.1f\n",12.36+0.05);
		System.out.printf("%.1f\n",12.39-0.05);
		//정수5자리
		System.out.printf("[%5d] %.2f %s\n",10,12.34,"홍길동");
		System.out.printf("[%-5d] %.2f [%-8s]\n",10,12.34,"홍길동");
		//0은빈자리를채운다, -0은 출력값이바뀌기때문에 없다
		System.out.printf("[%05d] %.2f [%-8s]\n",10,12.34,"홍길동");
		//자리수를넘어가도 전부출력
		System.out.printf("[%05d] %.2f [%-8s]\n",123456789,12.34,"홍길동");
		
		
		System.out.println(true);
		System.out.println(false);
		System.out.println(5>3);
		System.out.printf("4 > 2 : %b\n", 4>2);
		
				
	}
}






