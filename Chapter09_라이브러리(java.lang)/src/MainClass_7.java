/*
 * 	Math : 	Math는 객체 생성을 하지 않음 => 모드 메소드가 static
 * 			final 클래스 => 변경 불가(있는 그대로 사용)
 * 			Math 리턴형 => 대부분 double형
 * 		- Math.random() => 	java.util.Random()
 * 							Random r=new Random()
 * 							r.nextInt(100) => 0 ~ 99
 * 		- Math.ceil() : 웹에서 가장 많이 사용 => 페이징 => 무한 스크롤 => 총페이지 구현
 * 						올림 메소드 => 172/10.0 => 17.2 => 18 => 2
 * 						=> 배열보다는 컬렉션(가변형) 사용
 * 	System : 
 * 		- println() : 출력 => 웹에서 확인용으로 주로 사용
 * 			· 정상적으로 사용자가 데이터 전송
 * 			· 순서 => 동작
 * 			· 에러 => 처리
 * 		- gc() : 메모리 해제 요청
 * 		- exit() : 프로그램 종료 => 윈도우
 * 
 * 	String / StringBuffer / Wrapper(Integer, Long, Double, Byte...)
 * 		데이터형 => 문자열로 변경
 * 		문자열 => 다른 데이터형으로 변경
 * 		10진법 => 2진법, 8진법, 16진법
 */

import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan=new Scanner(System.in);
//		System.out.print("총 개수:");
//		int total=scan.nextInt();
//		
//		// 10개씩 나눠서 출력 => 총 페이지 개수 필요
//		int page=(int)Math.ceil(total/10.0);
//		// 오라클 : SELECT CEIL(COUNT(*)10.0) FROM recipe;
//		System.out.println("총 페이지:"+page);
		
		int a=10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
	}

}
