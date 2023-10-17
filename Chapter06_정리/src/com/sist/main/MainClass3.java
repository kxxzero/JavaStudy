package com.sist.main;

/*
 * 	194page
 * 
 * 	1. 상속
 * 		1) 목적
 * 		2) 형식
 * 	
 * 	199page
 * 
 * 	2. 논리적 포함 관계
 * 		예)
 * 		   동물		추상화 => 공통점이 많음
 * 			|		
 * 		   포유류		구체적 |
 * 			|
 * 		   인간
 * 			|
 * 		----------
 * 		|		 |
 * 	   남자		여자
 * 		
 * 		abstract => 추상적인 => 공통적인 내용을 모아둔 것
 * 		게시판
 * 		- 글쓰기
 * 		- 상세보기
 * 		- 목록
 * 		- 수정
 * 		- 삭제
 * 		- 검색
 * 		
 * 		= 답변형 게시판
 * 		= 묻고 답하기
 * 		= 갤러리 게시판
 * 		= 댓글형 게시판
 * 		= 추상클래스/인터페이스 => 벤치마킹
 * 
 * 	201~202, 204, 206page
 * 
 * 	3. 단일 상속 => 변수 충돌
 * 	   오버라이딩 => 재정의 => 메소드 변경
 * 	   변수 / 메소드 오버라이딩
 * 	   오버로딩 / 오버라이딩 => 재정의 => 기존의 메소드 수정
 * 	   중복 함수 정의 => 새로운 기능 추가
 * 
 * 	207page
 * 	4. 접근 지정어
 * 		private변수는 접근 불가
 * 
 * 	211page
 * 	5. 생성자
 * 		class A
 * 		{
 * 			public A()
 * 			{
 * 			}
 * 		}
 * 		
 * 		class B extends A
 * 		{
 * 			public B()
 * 			{
 * 				super() => new A() 호출 => 생성자 첫 줄에 사용
 * 			}
 * 		}
 * 
 * 		B b=new B(); => new A() => new B
 * 		
 * 		=> 자신의 객체 => this
 * 		=> 자신의 생성자 호출 => this()
 * 		=> 상위 클래스 객체	=> super
 * 		=> 상위 클래스의 생성자 호출 => super()
 * 
 * 		=> 상속을 받은 클래스는 자신과 관련된 메소드, 변수, 상위 클래스의 변수, 메소드 사용 가능
 * 		=> 상속을 내린 클래스는 자신과 관련된 메소드, 변수만 사용 가능
 * 
 * 	217page 
 * 	final => 변수는 상수형
 * 		메소드는 확장 불가 => java.lang
 * 
 * 	221~227page
 * 	객체의 형변환
 * 		클래스의 크기가 있음
 * 			반드시 상속, 포함
 * 				class A
 * 				{
 * 					int a, b
 * 				}
 * 				class B
 * 				{
 * 					int a
 * 				}
 * 				=> 크기를 측정할 수 없음
 * 				class A
 * 				class B extends A
 * 				A > B
 * 
 * 
 * 				class A
 * 				{
 * 					B b=new B(); // 포함 : has-a
 * 				}
 * 				class B
 * 				{
 * 				}
 * 				=> A > B
 * 
 * 				묵시적 형변환(자동형변환)
 * 				class A
 * 				class B extends A
 * 
 * 				A a=new B();
 * 							=> B b(B)a; // 강제형변환
 * 				B b=new B();
 * 				A a=b;
 * 
 * 				=> 클래스도 데이터형임
 * 				=> 자바에서 지원하지 않는 데이터형
 * 					사용자 정의 데이터형
 * 
 * 		*** 제어자
 * 			- 접근 지정어 : private, protected, default, public
 * 			- 그 외 : static, final, abstract, synchronizer
 * 			- static : 공통적인 => 공유 변수
 * 				=> 클래스, 메소드, 변수 => 지역 변수에서는 사용할 수 없음
 * 			- final : 마지막
 * 				=> 클래스, 메소드, 멤버변수, 지역변수
 * 				예)
 * 					public final class A // 확장할 수 없는 클래스
 * 						=> 상속이 불가한 클래스(String, Math, System...(java.lang))
 * 					public final void display() {} // 오버라이딩 불가
 * 					public final int a=10; // 값 변경 불가(상수)
 * 			- abstract : 추상적인(공통성), 미완성 => 추상클래스, 인터페이스
 * 			- synchronizer : 동기적인(네트워크, 쓰레드)
 * 				· 비동기적 : AJax 
 * 				· 동기적
 * 
 * 			조합
 * 			----------------------------------------
 * 			대상			조합			
 * 			클래스		public default final/abstract => private, protected 사용 불가(오류 발생)
 * 			변수			private final/static
 * 			메소드		public final static abstract
 * 			지역변수		final
 * 
 */

public class MainClass3 {

	private int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
