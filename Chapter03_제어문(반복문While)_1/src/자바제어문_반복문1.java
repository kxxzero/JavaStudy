/*
 * 	웹 : 변수, 연산자, 제어문, 메소드, 클래스, 인터페이스, 예외처리
 * 		- 제어문 : if / for / while / break 
 * 
 * 
 * 	71page
 * 		반복문
 * 			- while : 반복 횟수가 없는 경우 => 파일 읽기, 데이터베이스 연동
 * 				형식 : 초기값;
 * 					while(조건문;){
 * 						반복 수행문;
 * 						증감식;
 * 					}
 * 				예) int i=1;
 * 					while(i<=10){
 * 						System.out.println(i);
 * 						i++
 * 					}
 * 				순서 : ① 초기값 → ② 조건문 → ③ 반복 수행 문장 → ④ 증감식
 *	 
 */

public class 자바제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문
		
		System.out.println("========== for문 ==========");
		for(int i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
		
		// while문
		System.out.println("\n========== while문 ==========");
		int i=1;
		while(i<=10) {
			System.out.println(i+" ");
			i++;
		}
	}

}
