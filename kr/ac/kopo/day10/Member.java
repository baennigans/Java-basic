package kr.ac.kopo.day10;

public class Member {

	/** 이름 */
	String name;
	/** 나이 */
	int age;			
	/** 혈액형 */
	String bloodType;	
	
	
	Member(){
		this("알수없음");
		/*
		this.name="알수없음";
		this.age=-1;
		this.bloodType="알수없음";
		*/
	}
	
	
	Member(String name){
		this(name, -1);
		/*
		this.name = name;
		*/
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
		/*
		this.name = name;
		this.age = age;
		*/
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : "+name+", 나이 : "+age+", 혈액형 : "+bloodType);
	}
}
