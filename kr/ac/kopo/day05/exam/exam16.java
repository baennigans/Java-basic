package kr.ac.kopo.day05.exam;

public class exam16 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1 ; i<=9 ; i++) {
			if(i<=5) {
				for(j=1 ; j<=i-1 ; j++) {
					System.out.print(" ");
				}
				for(j=1 ; 2*i+j<=11 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(j=1 ; j<=9-i ; j++) {
					System.out.print(" ");
				}
				for(j=1 ; j<=2*i-9 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
