package kr.ac.kopo.day13.abs02;

public class HPPrinter extends Printer{

	@Override
	public void print() {
		hpPrint();
	}

	public void hpPrint() {
		System.out.println("HP 프린터에서 출력중...");
	}
	
}
