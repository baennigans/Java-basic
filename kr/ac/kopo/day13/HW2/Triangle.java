package kr.ac.kopo.day13.HW2;

public class Triangle extends PlainFigure {

	
	public Triangle() {
		
	}
	
	
	public Triangle(int width, int height) {
		super(width, height);
		double area = width * height / 2.;
		setArea(area);
	}

	
	@Override
	public void printArea() {

		System.out.printf("밑변 %d 높이 %d인 삼격형의 넓이 : %f\n",
					getWidth(), height, getArea());
	}
	
	
}