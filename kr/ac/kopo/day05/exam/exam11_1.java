package kr.ac.kopo.day05.exam;

public class exam11_1 {
	
	public static void main(String[] args) {
		
		int i , j;
		
		for(i=1 ; i<=9 ; i++) {
			if(i<=5) {
				for(j=1 ; j<=6-i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(j=1; i>=j+4 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}





