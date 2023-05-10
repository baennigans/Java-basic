package kr.ac.kopo.day11.HW;

import java.util.Scanner;

public class Icecream {

	Scanner sc = new Scanner(System.in);

	String name;
	int price;
	int totalPrice;
	
	
	public Icecream(){
	}
	
	public Icecream(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	public String iceName(){
		System.out.print("아이스크림명 : ");
		String s = sc.nextLine();
		return s;
	}
	
	
	public int icePrice() {
		System.out.print("아이스크림가격 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
}
