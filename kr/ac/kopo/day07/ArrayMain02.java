package kr.ac.kopo.day07;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		
		//방법1
		int[] arr = new int[5];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i]= (i+1)*10;
		}
		
		//방법2
		int[] arr1 = {11,21,31,41,51};
		//방법3
		int[] arr2 = new int[] {12,22,32,42,52};
		
		

		System.out.println("< PRINT >");
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i]+" ");
		}
		
/*		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
*/
	}
}
