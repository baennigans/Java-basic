package kr.ac.kopo.day09;

public class Method {

	void call() {
		System.out.println("call() 메소드 호출..");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출..");
	}
	
	void call(String s, int i) {
		System.out.println("call(string,int)메소드 호출..");
	}
	
	void call(double d) {
		System.out.println("call(double)메소드 호출..");
	}
	//메소드 오버로딩(Method Overloading)
	//매개변수가 다른 같은이름의 메소드
}
