package kr.ac.kopo.day13.HW2;

public class HomeworkMain {

	public static void main(String[] args) {
		
//		FigureView view = new FigureView();
//		view.process();
		
		FigureView f = new FigureView();
		f.print(new Circle(3));
		
		Circle c = new Circle(3);
		c.printArea();
		
		Triangle t = new Triangle(3, 4);
		t.printArea();
		
		Rectangle r = new Rectangle(3,4);
		r.printArea();
		
		Square s = new Square(3);
		s.printArea();
	}
}
