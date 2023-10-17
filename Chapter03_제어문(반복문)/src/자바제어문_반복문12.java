// 1 ~ 30 => 짝수만 출력

/*
 *	2 4 6
 * 	8 10 12
 * 
 * 
 */

public class 자바제어문_반복문12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1; 
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				System.out.printf("%2d\t", 1);
			}
			
			if(i%6==0) {
				System.out.println();
				
			}
		}
	}

}
