package kr.ac.kopo.day05.exam;

public class exam17 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1 ; i<=9 ; i++) {
			if(i<=5) {
				for(j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
				for(j=1 ; j<=9-2*i ; j++) {
					System.out.print(" ");
				}
				for(j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(j=1 ; j<=10-i ; j++) {
					System.out.print("*");
				}
				for(j=1 ; j<=2*i-11 ; j++) {
					System.out.print(" ");
				}
				for(j=1 ; j<=10-i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
