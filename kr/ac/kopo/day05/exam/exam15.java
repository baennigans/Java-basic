package kr.ac.kopo.day05.exam;

public class exam15 {

	public static void main(String[] args) {
		
		int i , j ;
		
		for(i=1 ; i<=5 ; i++) {
			for(j=1 ; j<=i-1 ; j++) {
				System.out.print(" ");
			}
			for(j=1 ; j<=11-2*i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
