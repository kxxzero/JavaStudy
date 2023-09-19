/*
 *	1차 for문
 *	for(시작점; 조건식; 증감식) 
 * 
 * 	* 문자는 모든 연산 시 정수로 변경
 * 	for문 안에서 선언된 변수는 블록 안에서만 사용 가능하며 블록을 벗어나면 자동으로 사라진다 => 지역변수
 * 	* 변수 사용 범위 {} 메모리 해제
 * 
 * 	{
 * 		int a=10;
 * 		{
 * 			int b=20;
 * 			{
 * 				int c=30;
 * 			}
 * 		}
 * 	}
 * 	System.out.println(a) // 블록 안에서 선언된 변수 a를 블록 밖에서 출력해서 오류 발생
 * 
 * 	2차 for문(중첩 for문)
 * 	for(초기값; 조건식; 증가식)
 * 	{
 * 		for(초기값; 조건식; 증가식)
 * 		{
 * 			
 * 		}
 * 	}
 * 	
 * 
 */


public class 자바제어문_반복문2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=100; i+=2) {
			System.out.println(i);
		}
		
		for(int i=2; i<=100; i+=2) {
			System.out.println(i);
		}
		
		
		// 중첩 for문(2차 for문)
		for(int i=1; i<=4; i++) { // 줄 수
			for(int j=1; j<=5-i; j++) { // 실제 출력물
				System.out.println("★");
			}
			System.out.println();
		}
	}

}
