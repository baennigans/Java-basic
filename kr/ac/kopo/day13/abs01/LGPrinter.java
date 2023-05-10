package kr.ac.kopo.day13.abs01;

public class LGPrinter extends Printer{

	private String model;
	 
	public LGPrinter() {
		 model = "LG프린터";
	}
	 
	@Override
	public void print() {
		System.out.println(model + "에서 출력중...");
	}
	
}