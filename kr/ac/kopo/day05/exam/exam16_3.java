package kr.ac.kopo.day05.exam;

public class exam16_3 {

	public static void main(String[] args) {
		
		int i , j ;
		int k = 0;
		
		for(i=1 ; i<=9 ; i++) {
			for(j=1 ; j<=k ; j++) {
				System.out.print("-");
			}
			for(j=1 ; j<=9-k-k ; j++) {
				System.out.print("*");
			}
			for(j=1 ; j<=k ; j++) {
				System.out.print("-");
			}
			System.out.println();
			
			
		}
	}
}
