
/*
 *	★
 *	★★
 *	★★★
 *	★★★★
 * 
 * 	2차 for문의 조건식
 * 	i(줄수)	j(별표) => i=j, j=i
 * 	  1		  1
 * 	  2		  2
 * 	  3		  3
 * 	  4		  4
 * 
 * 
 *
 *	★★★★
 *	★★★
 *	★★
 *	★
 * 
 * 	2차 for문의 조건식
 * 	i(줄수)	j(별표) => i+j=5, j=5-1
 * 	  1		  4
 * 	  2		  3
 * 	  3		  2
 * 	  4		  1
 * 
 * 
 * 	A
 * 	BC
 * 	DEF
 * 	GHIJ
 * 
 */


public class 자바제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		char ch = 'A';
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	
}
