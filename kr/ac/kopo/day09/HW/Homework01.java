package kr.ac.kopo.day09.HW;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		// 문제의 범위, 기회 횟수 설정
		int x = 100 , chance = 6;
		
		System.out.printf("1 ~ %d 사이의 정수를 맞추시오(기회%d번)\n\n",x,chance);
		Scanner sc = new Scanner(System.in);
		
		// random 값 생성
		Random r = new Random();
		int random = r.nextInt(x);
		random = random + 1;

		// 정답 최솟값, 최댓값
		int min = 1 , max = x;

		System.out.printf("%d ~ %d : ", min, max);
		
		for (int i = 0; i < chance; i++) {
			
			// 유추한 값 입력받기
			int num = sc.nextInt();
			
			//마지막 기회에 오답
			if (i==5 && num!=random) {
				System.out.printf("\n아쉽습니다. 기회를 소진하셨습니다.\n정답은 [ %d ]입니다.", random);
			} 
			else {
				// 정답 범위 밖의 값 입력했을 때
				if (num < min || num > max) {
					System.out.printf("\n잘못 입력하였습니다.\n%d - %d : ", min, max);
					i--;
				} 
				// 정답보다 큰수를 입력했을 때
				else if (num < random) {
					System.out.printf("\n%d 보다 큰수입니다.\n기회는 총 %d 번 남았습니다.\n", num, 5 - i);
					min = num + 1;
					System.out.printf("%d ~ %d : ", min, max);
				}
				// 정답보다 작은수를 입력했을 때
				else if (num > random) {
					System.out.printf("\n%d 보다 작은수입니다.\n기회는 총 %d 번 남았습니다.\n", num, 5 - i);
					max = num - 1;
					System.out.printf("%d ~ %d : ", min, max);
				} 
				// 정답을 맞췄을 때
				else {
					System.out.println("\n-------------------\n축하합니다!! 정답입니다!!\n-------------------\n");
					break;
				}
			}
		}
	}
}
