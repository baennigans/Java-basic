package kr.ac.kopo.day14.HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baseball {
	
	
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	
	int[] ranArr = new int[3]; 
	int[] numArr = new int[3];
	int strike, ball;
	int out=0, chance=0;
	
	
	// 임의의 수 생성
	public void random() {
		
		for(int i=0; i<=2; i++) {
			ranArr[i] = r.nextInt(10);
			for(int j=0; j<i; j++) {
				if(ranArr[i]==ranArr[j]) {
					i--;
				}
			}
		}
		System.out.println("정답미리보기 : "+Arrays.toString(ranArr)+"\n");
	}

	
	// 유추한 숫자 입력받기
	public void getNum(String msg) {
		
		System.out.print(msg);
		int num = sc.nextInt();
		
		for(int i=2; i>=0; i--) {
			numArr[i]= num%10;
			num = num/10;
		}
	}
	
	
	// 임의의수와 유추한수 비교하여 스트라이크,볼 계산
	public void play() {

		strike=0;
		ball=0;
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				if(numArr[i]==ranArr[j]) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
	}	
	
	
	// 스트라이크,볼,아웃 판정
	public void result() {
		
		if(strike+ball==0) {
			out++;
			System.out.println(out+" out");
		}else{
			System.out.println(strike+" Strike, "+ball+" ball");				
		}
		chance++;
	}
	
	
	// 더 진행 할지 판단
	public int judge() {
		
		if(out==3) {
			System.out.println("삼진아웃..");
			System.out.println("정답은"+Arrays.toString(ranArr));
			return 1;
		}
		if(chance==6) {
			System.out.println("기회를 모두 소진하였습니다.");
			System.out.println("정답은"+Arrays.toString(ranArr));
			return 1;
		}
		if(strike==3) {
			System.out.println("축하합니다!!! 정답입니다!!!");
			return 1;
		}
		return 0;
	}
	
	
}


