package kr.ac.kopo.day16.HW;

import java.util.Arrays;
import java.util.Random;

public class LottoView02 {
	private Random r = new Random();

	public void start() {
		
//		System.out.print("게임수를 입력 : );
		int gameCnt = 3;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}
		
	}
	
	private int[] getLotto() {
	
		int[] lottoNums = new int[6];
		boolean[] flags = new boolean[45];	// 0 ~ 44
		
		for(int i = 0; i < lottoNums.length; ) {
			int random = r.nextInt(45);
			if(!flags[random]) {
				lottoNums[i++] = random+1;
				flags[random] = true;
			} else
				System.out.print('!');
		}
		
		return lottoNums;
	}
}






