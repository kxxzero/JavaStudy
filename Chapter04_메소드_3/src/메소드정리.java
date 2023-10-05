/*
 * 	★ 프로그램 유형 ★
 *		- 네트워크 : 게임, 화상 채팅
 *		- 데이터베이스 : 웹
 *
 *	1. 리턴형 : 1개만 사용 가능
 *		= 요청 처리에 대한 결과값 전송
 *			- 1개 : 기본형 => 정수, 실수, 문자, 논리형
 *			- 여러 개 : 배열, 클래스(상세보기, 목록 등)
 *		= 결과값이 없는 경우 : 추가, 수정, 삭제 => void(출력시 주로 사용)
 *		= 결과값이 있는 경우 : 목록, 상세보기, 검색
 *	2. 매개변수 : 여러개 사용 가능 => 3개 이상인 경우 배열이나 클래스 사용 권장
 *		= 사용자가 요청값을 받을 경우
 *		= 가변 매개변수
 *	3. 메소드명
 *		= 식별자 => 문자 개수(제한 없음) : 10글자 이내 권장
 *		= 2개의 단어가 있는 경우
 *			- userInput(), user_input()	
 *	4. return문 : 가급적 메소드 맨 마지막에 설정
 *		= void면 생략 가능
 *	5. 형식
 *		리턴형 메소드명(매개변수)
 *		{
 *			return 값;
 *		}
 *	6. 메소드 유형
 *		
 *		리턴형 | 매개변수
 *		O		O
 *		O		X
 *		---------- 출력 내용이 있는 경우
 *		X		O
 *		X		X
 *		---------- 메소드 자체 처리(void)
 *	7. 사용 목적
 *		= 다른 클래스와 연결(메세지) => 메소드 호출
 *		= 재사용
 *		= 반복 제거
 *		= 수정이 편리
 *		= 에러 처리가 쉬움
 *
 *	8. 메소드 형태
 *		= static
 *		= instance
 *
 */

public class 메소드정리 {

	// 매개 변수 확인
	static void data(String s, String s1)
	{
		System.out.println(s+" "+s1);
	}
	
	
	// 가변 매개 변수 확인
	static void data2(String...s)
	{
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매개변수
		data("Java", "Oracle");
		
		// 가변 매개변수
		data2("aaa");
		data2("aaa", "bbb");
		data2("aaa", "bbb", "ccc");
		
		System.out.printf("%d%d%d%d", 1,2,3,4);
	}

}
