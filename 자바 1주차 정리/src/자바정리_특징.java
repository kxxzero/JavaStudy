/* 	자바
 * 		1. 데이터 저장
 *			- 변수 : 한 개만 저장 (메모리 저장)
 *				· 변수 : 프로그램에 따라 변경이 가능
 *    			· 상수 : 고정 (final)
 *    	----------------------------------------
 * 		2. 저장 방법 : 메모리 크기 (기본형, 데이터형)
 *			- 정수
 *      		· byte : 1byte(-128~127) => 네트워크(송수신), 파일 업로드, 다운로드, 웹
 *       		· int : 4byte(32bit) => 기본값
 *       		· long : 62bit(큰 숫자를 저장) => 금융권 등
 *    		- 실수
 *    	 		· double : 64bit => 15자리 소수점 저장이 가능
 *    		- 문자
 *    	 		· char : 0~65535 => 각 문자마다 고유 번호를 가지고 있다
 *    				컴퓨터는 무조건 => 2진법(0,1)
 *    				예) 'A' => 65
 *    					'a' => 97
 *    					'0' => 48
 *    		- 논리
 *    			· boolean : 1byte => true/false
 *		----------------------------------------
 *    	3. 데이터 가공
 *    		예) 점수 입력 (국어, 영어, 수학) => 평균, 총점, 등수
 *   			웹 : 조회수 증가, 인기 순위
 *   				예) hit=hit+1, short => 연산자, 제어문 → 재사용(메소드) → 클래스(컴포넌트) → 프로그램
 *   	----------------------------------------
 *   	4. 연산자
 *   		- 산술연산자 : +, -, *, /, % 
 *   		* 주의점 : 같은 데이터형끼리만 연산 가능 => 형변환 필요
 *   			· + : 산술, 문자열 결합
 *   			* 주의점 : +는 연산 처리 시 문자열이 존재하면 결과값은 문자열
 *					예) 7+7+7+7+"" = "28"
 *						7+"7"+7 => "77"+7 => "777"
 *						System.out.println("a="+a);
 *				· / : 정수 ÷ 정수 = 정수, 정수 ÷ 실수 = 실수
 *				* 주의점 : 0으로 나눌 경우 오류 발생
 *				· % : 왼쪽의 부호(+, -)가 결과값에 적용
 *
 *				※ 산술 규칙
 *					int + double = double
 *					char + int= int
 *					char + char = int
 *					byte + byte = int
 *					char + byte = int
 *			- 단항연산자
 *				· 증감연산자 : ++, --
 *					전치연산자
 *						++a : 먼저 증가 후 다른 연산 진행
 *						--a
 *					후치연산자
 *						a++ : 먼저 다른 연산 진행 후 증가
 *						a--			
 *				· 부정연산자 : !
 *					반대 효과 => boolean 결과값
 *						true → false, false → true
 *						예) a%2==0 => a%2==1, a%2!=0 !(a%2==0)
 *				· 형변환연산자
 *					(데이터형)
 *					byte < char < int < long < double
 *						예)  int + char + double = double - 자동 형변환(UpCasting) : 작은 데이터형 → 큰 데이터형
 *   						int + (int)char + (int)double - 강제 형변환(DownCasting) : 큰 데이터형 → 작은 데이터형
 *   				
 *   				<boolean(true/false)> => 제어문 - 조건문, 반복문
 *   					비교연산자 : ==, !=, >, <, >=, <=
 *   					* 주의점 : 문자열은 비교할 수 없다.
 *   						정수/실수/문자/논리 = > equals, compare
 *   					논리연산자 :
 *   						&&(범위 포함)
 *   							(조건1) && (조건2)
 *   								예) a>=1 && a<=100
 *   									a>'A' && a<='Z'
 *   							※ true && true => true
 *   							true && false => false
 *   							false && true => false
 *   							false && false => false
 *   						||(범위 미포함)
 *   							(조건1) || (조건2)
 *   							※ true || true => true
 *   							true || false => true
 *   							false || true => true
 *   							false || false => false	
 *   					----------
 *   					대입연산자
 *   						= : a=10
 *   						+= : a+=10 => 기존의 a에 10을 더한다.
 *   						-= : a-=10 => 기존의 a에 10을 뺀다.
 *   					삼항연산자 : 두 개의 값을 지정 후 조건에 따라 한 개의 값을 도출
 *   						if ~ else
 *   						(조건)?값1:값2
 *   							true => 값1
 *   							false => 값2
 *
 */

public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("a = " + ++a);
		System.out.println("a = " + (a++)); // 괄호 적용 X

	}

}
