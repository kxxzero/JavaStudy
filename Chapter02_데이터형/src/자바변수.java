/*
 * 	25page - 변수 : 관리할 데이터를 저장하는 공간(한 개만 저장 가능)
 * 		* 식별자(명명규칙)
 * 			0. 보통 소문자로 시작한다.
 * 			1. 알파벳(대소문자 구분 'Abc', 'abc', 'ABC')이나 한글로 시작
 * 			2. 명칭의 갯수 제한은 없음(알아보기 쉽게 의미를 부여한 3~7자로 압축)
 * 				예) kor, math, eng
 * 			3. 숫자 사용이 가능하나 첫 글자에는 사용할 수 없음
 * 				예) 2A(X) / A2(O)
 * 			4. 특수문자 사용 가능($, _)
 * 				예) file_name, file_count
 * 					_name, _count 주로 첫 글자에 '언더바(_)'를 사용할 경우 임시로 사용하는 변수를 의미
 * 			5. 공백 사용 불가능
 * 				예) file name(X)
 * 			6. 키워드(예약어 : 자바에서 사용하는 단어) 사용 불가능
 * 				예) int(X)
 * 			7. 여러 단어 결합 시 첫 글자는 대문자 사용
 * 				예) fileName
 * 
 * 		1) 선언
 * 			★ 데이터형 변수명; ★
 * 			int a; // 4byte 메모리 공간 생성 후 이름을 A로 부여
 * 		2) 초기값 부여
 * 			a = 100;
 * 		3) ★ 선언과 값 부여(주로 많이 사용하는 방법)
 * 			int a = 100;
 * 		4) 값 읽기 / 값 변경
 * 			- 읽기 : 값을 가지고 옴
 * 			- 쓰기 : 저장
 * 			- 수정
 * 
 * 	26page - 형식
 * 		데이터형 변수명;
 * 
 * 		* 정수값 저장 (200)
 * 		int num = 200;
 * 		데이터형 변수명 = 리터럴;
 * 
 * 		* 항상 리터럴보다 데이터형의 범위가 넓어야 함
 * 			byte < char, short < int < long < float < double
 * 									  --------------- 항상 실수가 정수보다 큼
 * 		
 * 		※ 프로그램 개발 : 가독성(리펙토링), 퍼포먼트(속도)
 * 		
 * 		* 각 데이터형 표현법
 * 			byte b = 100;
 * 			int i = 100;
 * 			long l = 100L;
 * 			char c = 'A', char c = 65('A')
 * 			boolean b = true; b = false;
 * 			float f = 10.5F;
 *			double d = 'A' d = 65.0
 *			double d = 10 d = 10.0
 *			double d = 10.5F d = 10.5
 *			double d = 10L d = 10.0
 * 		
 * 
 */

public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte = 127;
		int _int = 20000;
		long _long = 20000; // 20000L
		float _float = 10.5f;
		double _double = 100; // 100.0
		char _char = 65; // char는 정수로도 분류됨, 출력값은 데이터형에 맞게 출력됨 : A => 자동 형변환
		boolean _boolean = true;
		
		System.out.println("_byte : "+_byte); // '+'는 산술과 문자 결합 두가지 역할을 함
		System.out.println("_int : "+ _int);
		System.out.println("_long : "+ _long);
		System.out.println("_float : "+ _float);
		System.out.println("_double : "+ _double);
		System.out.println("_char : "+ _char);
		System.out.println("_boolean : "+ _boolean);

	}

}
