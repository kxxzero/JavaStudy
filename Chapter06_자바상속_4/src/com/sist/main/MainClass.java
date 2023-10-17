package com.sist.main;




/*
 * 	1. 상속 : 멤버 변수, 메소드를 받아서 처리
 * 		- 멤버 변수의 접근 지정어
 * 			· private, default(패키지가 다른 경우) 제외?
 * 		- 메소드를 재사용 또는 변경해서 사용
 * 			=> 객체 지향과 관련된 것은 대부분 메소드와 관련됨
 * 		*** 라이브러리는 변수가 없음(유일하게 상수는 가지고 있음)
 * 		- 형식 : 단일 상속만 가능
 * 			예)
 * 				class SubClass extends SuperClass
 * 								-----> 기존의 클래스 확장(수정, 추가)
 * 				{
 * 					SuperClass가 가지고 있는 모든 메소드 사용 가능
 * 					=> 변경해서 사용 가능(오버라이딩)
 * 				}
 * 		- 호출
 * 			예) 
 * 				class A
 * 				class B extends A
 * 					  -			-
 * 					Sub			Super
 * 					상속을 내리는 클래스 > 상속 받은 클래스보다 큼 (Super > Sub)
 * 		*** 모든 클래스의 상위 클래스는 Object(가장 큼)
 * 			=> 자바에서 지원하는 라이브러리의 메소드 => Object를 리턴함
 * 		- 확장 : 클래스 사용 시에는 확장된 클래스를 사용
 * 			예) 
 * 				A a=new A(); => 활용
 * 				B b=new B(); // 기본
 * 				A a=new B(); // 특별한 경우(상속을 받은 클래스를 묶어서 사용할 때)
 * 				----------> 게시판
 * 				
 * 				class A
 * 				{
 * 					int a, b; => c
 * 					void aaa(){};
 * 					void bbb(){};
 * 				}
 * 				
 * 				class B extends A
 * 				{
 * 					int c, d
 * 					int a, b; // 메모리 상에만 배치
 * 					void aaa(){}; // 변경 시
 * 					void bbb(){}; // 변경 시 
 * 					void ccc(){};
 * 				}
 * 
 * 				A a=new A();
 * 				B b=new B();
 * 				C c=new B(); => A가 가지고 있는 변수
 * 								B에서 오버라이딩된 메소드 호출
 * 				=> c는 접근 불가능 : 변수(c,d)
 * 								메소드(ccc())
 * 
 * 				클래스 객체명 => 객체는 클래스에 있는 변수, 메소드만 사용
 * 				A a=> A 클래스에 정의된 변수, 메소드
 * 
 * 				상위 클래스 = 하위 클래스
 * 				(변수)		(메소드)	=> 메소드는 상위 클래스에 있는 것만 
 */

class A
{
	int a,b;
	void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
	
	void bbb()
	{
		System.out.println("A:bbb() Call...");
	}
}

class B extends A
{
	int a=100, b=200, c=300, d=400;
	void aaa()
	{
		System.out.println("B:aaa() Call...");
	}
	
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
	
	void ccc()
	{
		System.out.println("B:ccc() Call...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		// 가장 많이 사용 => 70%
		
		B bb=new B();
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		
		A cc=new B(); 
		// 인터페이스(클래스 여러 개를 묶은 것) => 30%
		System.out.println("cc.a="+cc.a);
		System.out.println("cc.b="+cc.b);
		cc.aaa();
		cc.bbb();
		
		// 멤버 변수: 클래스, 메소드
	}

}


