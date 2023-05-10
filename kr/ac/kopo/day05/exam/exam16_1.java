package kr.ac.kopo.day05.exam;

public class exam16_1 {

	public static void main(String[] args) {
		
		
		int i , j;
		int space = 0;
		int k = 5;
		
		for(i=1 ; i<=9 ; i++) {
			
			for(j=1 ; j<=space ; j++) {
				System.out.print("-");
			}
			for(j=1; j<=2*k-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i<5) {
				space++;
				k--;
			}else{
				space--;
				k++;
			}
			
		}	
	}
}
