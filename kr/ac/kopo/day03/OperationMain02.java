package kr.ac.kopo.day03;

	public class OperationMain02 {

		public static void main(String[] args) {
			
			int a= 0, b= 0;
			
			//++a>1이 false이기 때문에 &&는 무조건 false. 뒤는 볼필요가없어서 ++b는 적용이안된다.
			boolean result = ++a > 1 && ++b > 0;
			
			System.out.printf("a = %d b = %d",a,b);
		}
}

	