/*
 *	2차 for문
 *	for(초기값; 조건식; 증감식){ // 줄 수 (rows)
 *		for(초기값; 조건식; 증감식){ // 실제 출력
 *			반복 수행 문장 // (수열=방정식) => 수와 수의 관계 => 분석(넘파이, 판다스) => 시각화(MatplotLib) => 자바에서 연동(R : Rserve)
 *		}
 *		System.out.println();
 *	}
 *	=> 등수 구하기, 빈도 구하기, 정렬(선택, 버블) ...
 * 
 */

public class 자바제어문_반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//     *
//			  **
//			 ***
//			****
		
//		i : 줄수 (1→4) / j : 공백 (3→0)  k : 별표 (1→4)
//		=> i + j = 4; / j = 4 - i; / k = i
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
