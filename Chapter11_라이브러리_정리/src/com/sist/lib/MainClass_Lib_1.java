package com.sist.lib;

/*
 *	라이브러리
 *		= ★★★java.lang
 *			- Object
 *			- String
 *			- StringBuffer
 *			- Math
 *			- Wrapper
 *		= ★★★java.util
 *			- StringTokenizer
 *			- Date / Calendar
 *			- ArrayList
 *			- HashSet
 *			- HashMap
 *		= ★★★java.io
 *			- FileInputStream / FileOutputStream
 *			- FileReader / FileWriter
 *			- BufferedReader
 *			- BufferedInputStream / BufferedOutputStream
 *		= ★★★java.sql
 *			- Connection
 *			- Statement
 *			- ResultSet
 *		= java.text
 *			- DecimalFormat . SimpleDataFormat
 *		= java.net
 *			- URL, URLEncoder, Socket
 *		------------------------------> 자바를 사용하는 모든 소스의 기본
 *		= java.http.servlet => 웹 - JSP
 *		= 외부 라이브러리
 *			org.springframework...
 *			org.mybatis...
 *			org.jsoup...
 *		= 사용자 정의
 *			- 기본
 *				· 변수
 *					정수 : int, long, byte
 *					실수 : double
 *					논리 : boolean
 *					문자열 : String
 *				· 연산자
 *					증감연산자(++, --)
 *					부정연산자(!)
 *					형변환연산자(type)
 *					산술연산자(+,-,*,/,%)
 *					비교연산자(<,>,<=,>=,==,!=)
 *					논리연산자(&&, ||)
 *					대입연산자(=, +=, -=)
 *				· 제어문
 *					if(조건)
 *					if~else
 *					for
 *					for~each
 *					while
 *					break
 *
 *			- 클래스
 *				· 멤버변수 / 공유변수
 *				· 메소드
 *					형식)
 *					public 리턴형 메소드명(매개변수) => 리턴형이 없는 경우 void
 *					{
 *
 *					}
 *				· 생성자
 *					초기화 / 시작과 동시 처리
 *					리턴형이 없음
 *					클래스명과 동일
 *					사용이 없는 경우 자동 디폴트 생성자가 초기화 됨
 *					상속 불가
 *				· 초기화 블록
 *					인스턴스 블록 : 인스턴스변수(일반 멤버 변수), static변수 초기화 가능 => 인스턴스는 주로 생성자 이용
 *					static 블록 : static 변수만 초기화 가능, 인스턴스변수 초기화 시 반드시 객체 생성 후에 사용 => static 변수 초기화 시 주로 사용
 *					*** 멤버변수는 private => 접근 시에 기능 부여
 *					*** 메소드, 생성자, 클래스는 주로 public 사용 => 메소드(읽기/쓰기 => getter/setter)
 *					
 *			- 특성 : 데이터 보호 / 재사용 / 수정, 추가 용이
 *				· 캡슐화 : 데이터 은닉화(private) 후 메소드를 통해 기능 접근
 *				· 상속/포함 : 수정 후 사용(상속) / 있는 그대로 사용(포함)
 *				· 오버라이딩 : 수정(오버라이딩) / 추가(오버로딩)
 *				
 *								오버라이딩			오버로딩				=> 면접 출제 90%
 *				--------------------------------------------------
 *				형태				상속				클래스 내
 *				메소드명			동일				동일
 *				매개변수			동일				개수나 데이터형이 다름
 *				리턴형			동일				관계 없음
 *				접근지정어			확대만 가능		관계 없음
 *				*** 접근지정어 크기 : private < default < protected < public
 *
 *			- 클래스의 종류
 *				· 인터페이스 : 관련된 클래스를 모아서 관리, 결합성이 낮은 프로그램(영향을 줄이는 프로그램) => 무조건 public
 *					상속
 *						다중 상속
 *						extends(X) => implements
 *						interface == (extends) ==> interface
 *						interface == (implement) ==> class
 *						interface A
 *						interface B
 *						class C implements A,B
 *					형식)
 *						interface interface명
 *						{
 *							변수
 *								public static final 데이터형 변수명=값
 *								--------------------> 생략 시 자동 추가
 *							----------------------------------------
 *							메소드(선언)
 *								public abstract void 메소드명();
 *								---------------> 생략 시 자동 추가
 *							----------------------------------------
 *							메소드(구현)
 *								public default(접근 지정어가 아닌 명령어로 구현이 가능한 메소드를 알려줌) 리턴형 메소드명() {}
 *								-----> 생략 시 자동 추가
 *								public static 리턴형 메소드명() {} => 항상 인터페이스를 통해서만 접근 가능
 *						*** new를 이용하지 않고 객체 생성 => 추상 클래스, 인터페이스
 *							File file=new File();
 *
 *			- 제어어
 *				· static(공유) / abstract(공통) / final(변경 불가)
 *
 *			- 접근지정어
 *				·  private(자신의 클래스 내에서만 접근 가능) / default(같은 패키지에서만 접근 가능) / public(패키지 상관없이 모든 클래스에서 접근 가능)
 */
public class MainClass_Lib_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
