package kr.ac.kopo.day13.HW2;

public abstract class PlainFigure extends Figure {

	private int width;
	protected int height;

	
	public PlainFigure() {
	}

	

	public PlainFigure(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return this.width;
	}
	
	
//	@Override
//	public void setArea(double area) {
//		super.setArea(area);
//	}
	
}