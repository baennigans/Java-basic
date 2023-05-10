package kr.ac.kopo.day13.HW2;

public abstract class Figure implements AreaPrintAble{

	private double area;
	
	
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void printArea();
}
