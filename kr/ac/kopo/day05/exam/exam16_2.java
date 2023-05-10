package kr.ac.kopo.day05.exam;

public class exam16_2 {

	public static void main(String[] args) {
		
		int i , j ;
		int k = 0 ;
		
		for(i=1 ; i<=9 ; i++) {
			for(j=1 ; j<=9 ; j++) {
				if(j<=k || j>=10-k){
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(i<5) {
				k++;
			}else {
				k--;
			}
		}
	}
}
