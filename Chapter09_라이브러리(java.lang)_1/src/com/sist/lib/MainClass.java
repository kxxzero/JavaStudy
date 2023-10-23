package com.sist.lib;

/*
 * 	java.lang => 보통 package가 다르면 import를 사용해서 클래스를 가지고 옴(java.lang은 생략 가능)
 * 		- Object : 	모든 클래스의 상위 클래스 => 모든 클래스는 Object의 상속을 받음
 * 			= 모든 데이터형을 받을 수 있는 클래스
 * 			= 모든 데이터형을 모아서 관리
 * 			= Object[] obj={"", '', 10, 10.5, new A()};
 * 				=> 자바스크립트(배열 => Object이기 때문...)
 * 			= 기능만 가지고 있음(메소드)
 * 			= 주요 기능
 * 				· toString() : 자주 사용됨, 객체를 문자열화 => 오버라이딩이 가장 많이 사용되는 메소드
 * 					기본 출력 : 객체 주소
 * 					객체 출력할 때 toString()이 생략되고 있음
 * 					원형) String toString() 
 * 				· clone() : 객체를 복제해서 새로운 객체 생성 => Spring에서 주로 사용
 * 					싱글턴 : 1개의 객체를 생성해서 재사용하는 방식 => 필요 시에는 여러 개 생성가능(clone())
 * 					응용 : JSP(웹)에서는 알고리즘이 필요 없음
 * 					Spring : 디자인 패턴, 알고리즘
 * 					원형) Object clone() throws CloneSupportedException => ① 예외 처리, ② 형변환
 * 						* 원형 : 리턴형, 메소드명, 매개변수
 * 						* 사용처 : 70~80% 이미 제작됨(라이브러리) / 20~30% 사용자 정의(라이브러리+사용자 정의) => 조립식
 * 						* CBD : 라이브러리 중심으로 프로그램 구현
 * 						* 프로그래머(이미 존재하는 기능을 조립 - 자바, C#) VS 개발자(없는 것을 만드는 사람 - C/C++)
 * 						* 특성 : 	미국, 유럽 => 아키텍쳐
 * 								인도 => 구현
 * 								일본 => 무선 발전
 * 								한국 => 유선 발전(웹 사이트)
 * 				· finalize() : 소멸자(객체 메모리 해제 시에 자동 호출)
 * 					멀티미디어(스트리밍 서비스)
 * 					원형) protected void finalize()
 * 				· equals() : 객체 비교 시에 주로 사용
 * 					String에서 오버라이딩이된 메소드를 주로 사용
 * 					원형) boolean equals(Object obj)
 * 					'==' 주소값을 비교, 실제 메모리에 저장된 값
 * 					equals : 객체를 가지고 있는 데이터가 같은지 확인
 * 
 * 			* 문자열은 문자열 자체가 주소 => 문자열이 같을 경우 같은 주소를 가지고 있음 => 문자열은 같지만 다른 주소에 저장 시에는 new를 이용
 * 
 * 		- String : 문자열을 저장하는 데이터형/클래스형 => 기능 사용 가능
 * 			· 비교
 * 				= equals() : 같은 문자열인지 확인 => 로그인, 아이디 중복 체크 => 아이디 찾기, 비밀번호 찾기, 상세보기
 * 					원형) boolean equals(String s)
 * 					같은 문자열은 같은 주소를 가지고 있음
 * 					new를 이용하면 다른 주소에 저장
 * 				= startsWith()/endsWith()
 * 					원형) boolean startsWith(String s)
 * 					s로 시작하는 문자열
 * 					자동 완성기 => 대소문자 구분
 * 						boolean endsWith(String s)
 * 					s로 끝나는 문자열
 * 					사용 빈도가 거의 없음
 * 				= contains() : 문자열 포함 => 자바스크립트도 동일
 * 					원형) boolean contains(String s)
 * 					문자열 중에 s의 포함 여부
 * 					가장 많이 사용되는 메소드
 * 				= split() : 문자열 분리
 * 					원하는 문자별로 분리
 * 					원형) String[] split(",") => 크롤링
 * 					정규식) 표현법
 * 						기호 : \\기호
 * 							^ : ^A => A로 시작하는 모든 문자열 = startsWith
 * 							$ : A$ => A로 끝나는 모든 문자열 = endsWith
 * 							+ : A+ => A로 시작 => 1개 이상 문자열
 * 							* : A* => A로 시작 => 10개 이상 문자열
 * 							| : A|B => A 또는 B
 * 							[] : 문자의 범위
 * 								[A-Z] : 대문자
 * 								[a-z] : 소문자
 * 								[0-9] : 숫자
 * 								[가-힣] : 한글 전체
 * 							{} : 문자의 개수
 * 				= substring() : 문자를 자름
 * 				String substring(int s)
 * 					=> String s="Hello Java"
 * 					   		 	 0123456789 => 문자열의 시작은 0부터
 * 					s.substring(6) => 6부터 나머지 전체 => "Java"
 * 					String substring(int s, int e)
 * 					=> s.substring(1,4) 1~4번 전 까지(3까지) 자름
 * 
 * 				= replace() : 문자열 변경
 * 					String replace(char c1, char c2) // c1을 c2로 변경
 * 						   replace('A', 'B')
 * 				= replaceAll() : 정규식
 * 				= indexOf() : 앞에서부터 찾기
 * 				= lastIndexOf() : 뒤에서부터 찾기
 * 					String s="Hello Java";
 * 					
 * 				= length() : 문자의 개수
 * 					int length()
 * 				= trim() : 좌우 공백 제거
 * 					String trim() => 사용자 입력이 있는 경우
 * 				= valueOf()
 * 				
 * 
 * 		- StringBuffer : String 보완 => 문자열 결합
 * 		- Wrapper : 기본 타입의 데이터를 객체로 저장 => 기본 타입의 데이터를 쉽게 사용할 수 있도록 기능 첨부 => 클래스화
 * 			정수형
 * 				***byte => Byte
 * 				short => Short
 * 				***int => Integer
 * 				***long => Long
 * 			실수형
 * 				float => Float
 * 				***double => Double
 * 			논리형
 * 				***boolean => Boolean
 * 			문자형
 * 				char => Character
 * 
 * 			--------------------
 * 
 * 			웹
 * 			주소 => 유일하게 서버와 연결
 * 				=> 사용자가 값을 서버로 전송
 * 					URL주소?page=10 => String page="10" => int로 변경 후 사용
 * 														  int a=Integer.parseInt
 * 														  NUMBER, VARCHAR2,
 * 				=> (오토)박싱 / 언박싱
 * 				Integer 1=10; // 박싱
 * 				int j=i; // 언박싱
 * 		- System 
 * 			= println() : 화면 출력
 * 			= gc() : 메모리 회수 요청
 * 			= exit() : 프로그램 종료
 * 		- Math : 모든 메소드가 static으로 되어 있음
 * 			= random() : 임의로 발생
 * 			= ceil(double a) : 올림 메소드 => double
 * 		- Thread : 1개의 프로그램 안에 여러 개의 프로그램을 동시에 실행
 * 	java.util
 * 	java.text
 * 	java.io
 * 	java.net
 * 	java.sql
 * 
 * 	표준 자바 => javax(확장형) => 웹, 윈도우 
 */

import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="Hello";
		
		// 주소가 같은지 확인 => '=='
		String s3=new String("Hello");
		// 새로운 메모리 공간에 Hello 저장
		if(s1==s2)
		{
			System.out.println("s1과 s2는 같은 주소를 가지고 있다.");
		}
		else
		{
			System.out.println("s1과 s2는 다른 주소를 가지고 있다.");
		}
		// 실제 저장된 데이터(문자열) => equals
		if(s1.equals(s3))
		{
			System.out.println("s1과 s3는 메모리 저장 주소는 다르고");
		}
		else
		{
			System.out.println("s1과 s3는 메모리 저장 주소는 다르고");
		}
				
		
		String data="홍길동|박문수|이순신|강감찬|을지문덕";
		String[] names=data.split("|");
		for(String name:names)
		{
			System.out.println(name);
		}
		
//		// 다중 검색 => N(Name), S(Subject), C(Content)
//		String data1="NSC";
//		String[] ss=data1.split("");
//		for(String s:ss)
//		{
//			System.out.println(s);
//		}
		
		String[] data2= {
				"a.png",
				"b.jpg",
				"c.gif",
				"d.java",
				"e.java",
				"f.zip"
		};
		
		// 확장자 찾기
		for(String s:data2)
		{
			String ss=s.substring(s.lastIndexOf(".")+1);
//			System.out.println(ss);
			if(ss.equals("png")||ss.equals("jpg")||ss.equals("gif"))
			{
				System.out.println(s);
			}
		
		}
		
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				
			}
		}
	}
	

}
