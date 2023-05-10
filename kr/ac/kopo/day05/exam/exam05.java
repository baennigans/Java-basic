package kr.ac.kopo.day05.exam;

public class exam05 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=5 ; i>=1 ; i--) {
			for(j=1 ; j<=5 ; j++) {
				System.out.print(j+i-1);
			}
			System.out.println();
		}
	}
}