/*
 *	★★★★★
 *	★★★★★
 *	★★★★★
 *	★★★★★
 *
 *
 *	--------------------
 *
 *
 *	ABCDE
 *	FGHIJ
 *	KLMNO
 *	PQRST
 *
 *
 *	--------------------
 *
 *
 * 	ABCDE
 * 	ABCDE
 * 	ABCDE
 * 	ABCDE
 * 
 * 
 * --------------------
 * 
 * 
 * 	★☆☆☆
 * 	☆★☆☆
 * 	☆☆★☆
 * 	☆☆☆★
 * 
 */
public class 자바제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		
//		char ch='A';
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5; j++){
//				System.out.print(ch++);
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=4; i++) {
//			char c='A'; // 변수 위치에 따라 값이 달라짐. 반복할 때마다 다시 'A'부터 시작
//			for(int j=1; j<=5; j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
	}
}
 