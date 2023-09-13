/*
 *	1. 실행 순서
 *		1) 자바 파일명 = 클래스명 (대소문자 구분)
 *			① Project.java(원시 소스 - 프로그래머)
 *		   	② javac(컴파일) : 컴퓨터가 인식하는 언어(2진법 - 0,1)
 *			③ Project.class(배포 파일 - 바이너리코드 : 모든 운영체제에 호환)
 *		   	④ java(인터프리터)
 *			⑤ 실행
 *		   	=> 이클립스 : javac+java => Ctrl + F11
 *
 *	2. 소스 코딩의 주의점
 *		1) 대소문자 구분
 *		2) 명령문 ;
 *		3) 주석 처리 : 코드에 대한 간단 설명
 *		4) 들여쓰기 : { + Enter => 자동 블록 처리 및 들여쓰기 가능
 *		
 *	3. 자바 개발자 약속
 *		1) 변수 / 클래스 / 메소드 / 상수 / 인터페이스
 *			- 변수 : 소문자로 시작, 단어 혼합 시 첫 글자는 대문자
 *				예) fileName, file_Name
 *			- 상수 : 모두 대문자로 작성
 *				예) MAX, MIN
 *			- 클래스, 인터페이스 : 첫 글자는 대문자
 *				예) MainClass
 *			- 메소드 : 변수와 동일
 *		※ 프로그램 : 데이터 관리
 *			데이터 저장
 *			- 메모리(RAM) : 저장과 동시에 소멸
 *				· 한 개의 데이터 관리 : 변수 - 기본적으로 메모리 크기가 결정되어 있음
 *					정수 : byte(1byte), int(4byte), long(8byte)
 *					문자 : char(2byte)
 *					실수 : float(4byte), double(8byte)
 *					논리 : boolean(8byte)
 *				· 여러 개의 데이터 관리 : 배열, 클래스 - 사용자 정의 : 참조형
 *					예) int + double + char
 *			- 파일 : 영구 저장
 *			- RDBMS(오라클) : 영구 저장
 *				
 *	4. 변수 / 연산자 / 제어문 / 데이터 모음 관리 / 재사용성 / 예외처리 => 라이브러리를 이용한 조립식
 *	5. 응용 : 네트워크, 파일
 *	------------------------------
 *	오라클 (21c) : CURD(추가, 수정, 삭제, 검색)
 *	------------------------------
 *	브라우저 연동 : HTML5/CSS3/JavaScript + Vue.js(Vuex), React.js(Redux) + TypeScript/Node.js(실시간 상담) (JQuery, Ajax는 X)
 *	JSP : Back-end + Front-end
 *	MVC(SpringMVC => 직접 Spring 제작)
 *	DateBase 연동 => MyBatis / JPA
 *	Spring - Spring Boot(ThymeLeaf)
 *	AWS => PaaS(1년 무료) => EC2
 * 	Python : 데이터 분석, 시각화
 * 			 Pandas / Numpy / MatplotLab + 머신러닝 / 딥러닝(자동화 시스템)
 * 	
 * 	변수 : 메모리(주소)에 한 개의 데이터를 저장할 수 있는 공간
 * 		- 변수명 설정(명명규칙)
 * 			· 알파벳으로 시작(대소문자 구분), 한글(호환성 떨어짐)
 * 			· 숫자 사용 가능(첫 글자에 사용 불가능)
 * 			· 키워드(예약어) 사용 불가능
 * 			· 공백 부여 불가능
 * 			· 특수문자 사용 가능(_ , &)
 * 			· 기타 사항 : 의미를 포함한 압축어 7자 이내 권장(구분이 어려운 i, j는 권장하지 않음)
 * 		- 변수 선언 방식
 * 			데이터형 변수명;
 * 		- 변수의 초기화
 * 			변수명 = 값(리터럴);
 * 		- 변수의 활용
 * 			출력 시 변수명 입력
 * 			변수명 = 값 입력 시 수정 가능
 * 			자동으로 블록({})을 벗어나면 삭제됨
 * 		- 변수의 종류
 * 			· 지역변수 : 블록 안에서만 사용할 수 있는 변수
 * 
 * 		※ 데이터 저장 → 데이터 가공(연산자, 제어문 => 메소드 : 소스 구조화, 그룹화, 재사용) → 가공된 데이터 출력(화면에 출력)
 * 		
 * 	연산자
 * 		1) 산술연산자 : +, -, *, /, % 연산은 같은 데이터형끼리만 가능
 * 			예) 10(int) + 10.5(double) => 10.0(double) + 10.5(double) = 20.5 - 자동 형변환(작은 데이터형 → 큰 데이터형)
 * 				'A'(char) + 1(int) => 'A'(int) + 1(int) = 65 + 1 = 66
 * 				10.5 + (double)10 - 강제 형변환
 * 			- + : 산술 처리, 문자열 결합
 * 				· '' : 문자
 * 				· "" : 문자열
 * 					예) 7 + "7" + 7 = "77" + 7 = "777"
 * 						7 + 7 + "7" = "14" + 7 = "147"
 * 						7 + "7" + (7-5) = "77" + 2 = "772"
 * 						7 + "7" + 7 * 2 = 7 + "7" + 14 = "77" + 14 = "7714"
 * 			- / : 정수 ÷ 정수 = 정수, 0으로 나눌 시 오류 발생
 * 					예) 10/3 = 3
 * 						5/2 = 2
 * 			- % : 결과값은 앞(왼쪽) 숫자의 부호를 따름
 * 					예) - % + = -
 * 						- % - = -
 * 						+ % - = +
 * 						+ % + = +
 * 
 * 			※ 좌 → 우 순서대로 연산 진행
 * 			  우선 순위 : *, /, %    →    +, - 
 * 			  우선 순위 변경 시 () 사용
 * 
 * 		2) 형변환
 * 			- 작은 데이터형 → 큰 데이터형 : 자동 형변환(UpCasting)
 * 			- 큰 데이터형 → 작은 데이터형 : 강제 형변환(DownCasting)
 *  			※ byte < char < int < long < float < double
 * 						  └ short는 C언어 호환 시 필요하기 때문에 사용 빈도 낮음
 * 				* int 이하 데이터형(byte, char, short) 연산 시 결과값은 int
 * 				
 * 				
 */


// 3개 정수(1~100) = > 총합, 평균
public class 자바산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1; // Math.random() : 0.0 ~ 0.99까지의 실수값을 랜덤으로 제공
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*100)+1;
		System.out.println("a="+ a + "\nb=" + b + "\nc=" + c);
//		System.out.println("총점 : " + (a + b + c));
//		System.out.println("평균 : " + (a + b + c) / 3.0);
		
		int total = a + b + c;
		double avg = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f \n", avg); // \n : 줄바꿈 역할
		
		/*
		 * 실수 : %f, %.2f, %.3f
		 * 정수 : %d
		 * 문자 : %c // char
		 * 문자열 : %s // string
		 */
		
		System.out.println("===================="); // println : 다음 줄에 줄바꿈 하여 출력
		System.out.print("aaa"); // print : 줄 바꿈 없이 출력
		System.out.print("bbb");
		
	}

}
