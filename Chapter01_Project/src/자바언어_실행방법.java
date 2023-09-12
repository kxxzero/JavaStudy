/*
 *	2page - 자바 언어의 특징
 *		1) 실행 방법
 *			- 컴파일 방식 : 2진 파일로 변경(컴퓨터가 인식하는 언어)
 *						 예) C/C++..., Java, 기계어
 *							*** 자바의 특징
 *								컴파일
 *								- C/C++ : 컴파일 시 운영체제마다 다른 컴파일을 한다.
 *											컴파일된 내용이 다르다.
 *								- Java : 운영체제마다 동일
 *								=> 컴파일된 파일 : 바이너리 코드(One Write)
 *			- 인터프리터 방식 : 한 줄씩 번역해서 실행
 *							예) HTML / CSS
 *			- 보안 : 두 번을 검색하기 때문에(소스 검증)
 *					=> 보안이 뛰어나다 => 인증 시스템 도입
 *					=> 동원 증권 : 자바 => 시스템 구축
 *
 *						자바 소스
 *						   |
 *						  JVM => 파일(.dll)
 *						   |
 *				   리눅스  윈도우  MAC
 *
 *				<실행 과정>
 *					기계어로 변경(javac)	한 줄씩 번역(java)
 *				A.java ==========> A.class ==========> Hello World
 *			프로그래머 코딩    |     바이너리 코드    |
 *						  컴파일				인터프리터
 *				=> 편집기 : 이클립스, 인텔리J(파이참) - 어시스트
 *		 					 |
 *						javac+javac = > ctrl+F11
 *
 *				--------------------
 *				자바 파일 목록 | 소스 코딩
 *				--------------------
 *				OUTPUT : 화면 출력
 *				--------------------
 *				다운로드 : eclipse.org = > J2EE
 *
 *	6Page - 개발 환경 구축
 *			JDK : 17(이상 버전은 한글 제어에 문제)
 *			다운로드 : https://jdk.java.net
 *			스프링(14)
 *			스프링(STS => 3(FrameWork + Boot), STS => 4(Boot))
 *
 *			JDK 환경 설정
 *			-path : c:\jdk-17.0.2\bin
 *			-classpath : .;c\jdk-17.0.2\lib
 *
 *	11Page - 이클립스로 파일 생성
 *			프로젝트 폴더 생성 => src => 자바 파일 생성
 *									---------- class 파일 생성
 *			<주의점>
 *			- 파일명과 클래스명이 반드시 동일해야 사용 가능
 *			- 대소문자를 구분한다.
 *				=> 언어(대소문자를 구분)
 *			- 클래스명은 첫 글자를 대문자, 새로운 단어 결합 첫 글자를 대문자(헝거리언식 표현법)
 *			- 변수, 메소드는 소문자
 *			- 상수는 전체를 대문자
 *			- {} 일치
 *			- 명령어 종료 시 ;
 *			- 모든 자바 파일은 main이 있어야 실행 가능
 *			- 주석 : 번역이 안 되는 코드
 *					// 한 줄 주석
 *					ctlr+shift+/ 주석 
 *					ctrl+shift+\ 주석 풀 떄
 *			- 화면 출력 : sysout => ★ctrl+space★
 *
 *			*** 자바의 구성도
 *			class A => 클래스 시작
 *			{
 *				public static void main(String[]) arg) {
 *					system.out.println("Hello"); 화면 출력
 * *			} = 메인 종료
 * 			} 클래스 종료
 *
 */
public class 자바언어_실행방법 {

	public static void main(String[] args) {
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
	}

}
