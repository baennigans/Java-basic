package kr.ac.kopo.day13.HW2;

public class Circle extends Figure {

	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
		
		double area = radius * radius * Math.PI;
		setArea(area);
	}

	@Override
	public void printArea() {
	
		System.out.println("반지름 " + radius + "일때 원넓이 : " + getArea());
	}
	
}