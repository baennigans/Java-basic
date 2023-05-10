package kr.ac.kopo.day12;

public class Manager03 extends Employee {

	Employee[] empList;

	public Manager03() {
		super();
	}

	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		super.info();
	}
	
	
}
