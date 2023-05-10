package kr.ac.kopo.day05.exam;

public class exam11 {

	public static void main(String[] args) {
		
		int i , j;
		
		for(i=9 ; i>=1 ; i--) {
			if(i>=5) {
				for(j=1 ; j<=i-4 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(j=5; j>=i ; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
