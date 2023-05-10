package kr.ac.kopo.day06.exam;

public class exam08 {

	public static void main(String[] args) {

		int i , j , k ;
		
		for(i=2 ; i<=9 ; i+=3) {
			for(j=1 ; j<=9 ; j++) { 
				for(k=i ; k<=i+2 && k<10 ; k++) { 
					
					System.out.print(k+" * "+j+" = "+k*j+"	");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

