/*
 *	1. 반복문 => 중복을 제거(메소드)
 *	
 * 		1) 데이터 저장
 * 			변수(1개만 저장 가능) => 배열(같은 데이터형을 묶은 것) => 클래스(다른 데이터형까지 묶은 것)
 * 
 * 			국어, 영어, 수학, 총점, 평균
 * 			
 * 		2) 명령문 => 메소드 => 클래스(클래스 + 메소드) => 프로그램
 * 
 * 
 * 	2. 반복문의 종류
 * 		1) for문 : 주로 반복 횟수가 지정된 경우 사용
 * 			예) 화면 출력(리스트 목록 - 영화, 맛집, 레시피 등)
 * 			- 일반 for문 : 1차 for문, 2차 for문(코딩 테스트)
 * 			- 향상된 for문 : 배열, 컬렉션 
 * 
 * 		2) while문 : 주로 반복 횟수가 지정되지 않은 경우 사용(무한 루프)
 * 			예) 파일 읽기, 데이터베이스
 * 
 * 		3) do~while문 : 반드시 1회 이상을 수행(사용 빈도 낮음)
 * 
 * 		4) 제어
 * 			- 다시 시작
 * 			- break : 반복문 중단 시 사용
 * 			- continue : 특정 부분 제외
 * 
 * 		
 * 		★ for
 * 			형식 : for(초기값;조건식;증감식){
 * 						반복실행문장1
 * 						문장2(for문 소속 문장이 아니다.)
 * 					}
 * 			동작(순서) : 초기값 → 조건식 → true → 반복 실행 → false → 종료
 * 			패턴
 * 			
 */



import java.io.*; // 입출력
public class 자바제어문_반복문1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		String s="ABCDEFGHIJKLMNOP";
//		String[] alpha=s.split("");
//		System.out.println(alpha[0]);
//		
//		for(int i=0; i<alpha.length; i++) {
//			System.out.println(alpha[i]);
//		}
//		
//		System.out.println();
//		for(String ss:alpha) {
//			System.out.println(ss);
//		}
		
		FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter03_제어문(반복문)_1\\src\\자바제어문_반복문1.java");
		
		int i =0;
		
		while((i=fr.read())!=-1) { // EOF(-1). i : 한 글자씩 읽어오는 것
			System.out.print((char)i);
		}
		
	}

}
