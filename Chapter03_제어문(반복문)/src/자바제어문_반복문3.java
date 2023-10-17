
// 정수 1개를 받아서 해당 구구단

import java.util.Scanner;
public class 자바제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
//		초기화
//			- 명시적 초기화
//			- 입력값
//			- 난수
//			- 파일 읽기
//			- 오라클 데이터베이스
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력 : ");
		dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, dan*i); // %d : 정수, %f : 실수 / %2d : 오른쪽 정렬, %-2d : 왼쪽 정렬
			
		}
	}

}
