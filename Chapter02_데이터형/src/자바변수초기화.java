/*
 * 	변수 초기화
 * 	1) 변수 추출
 * 	2) 변수 선언/(데이터형)
 * 	3) 변수 초기화
 * 		- 명시적 : int a = 10;
 * 		- 입력값
 * 			★ Scanner : 키보드 입력값을 받을 때 사용
 * 			BufferedReader : 예외 처리
 * 		- 임의값을 받아서 초기화(랜덤)
 * 		- 크롤링()
 */

import java.util.Scanner;
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 100;
//		int b = (int)(Math.random()*100+1); // Math.random : 0.0 ~ 1.0 사이의 실수를 랜덤으로 제공. (int)를 통해 정수형으로 변환하면 0값을 출력하기 때문에 *100 추가
//		
//		System.out.println(b);
//		
//		Scanner scan = new Scanner(System.in); // Scanner : 키보드 입력값
//		
//		System.out.println("정수 입력 : ");
//		int c = scan.nextInt();
//		System.out.println(c);
		
		int a = 10;
		int b = 20;
		
		int temp = a; // 임시변수 temp 값을 정렬하거나 두 개의 변수 값을 교환할 떄 주로 사용
		a=b; // a = 20;
		b=temp; // b = 10;
		
	}

}
