package kr.ac.kopo.day09;

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call("aaa",12);
		m.call(12.34);
		//묵시적 형변환
		m.call('A');
		
	}
}

