package com.sist.main;

/*
 * 	인터페이스
 * 		- 기본 문법 : 변수는 사용할 수 없음(상수만 사용 가능)
 * 			예) int i; // 오류
 * 				int i=10; // 생략된 것이 있음
 * 					public static final int i=10;
 * 					=> static final int i=10; // 상수
 * 						final int i=10; // 상수형 변수
 * 						int i=10; // 변수
 * 		- 메소드
 * 			· 구현이 안 된 메소드 : 구현 내용이 여러 개인 경우
 * 				예) (public abstract)void display();
 * 					public (abstract) void display();
 * 			· 구현이 된 메소드 : 공통으로 사용되는 부분 정의 => 새로운 기능 추가 시에도 많이 사용
 * 				예) (public) default void aaa() {}
 * 					(public) static void bbb(){}
 * 				=> 메소드나 상수를 선언 => 무조건 public
 * 		- 상속
 * 			· 인터페이스도 클래스이기 때문에 상속을 내리면 상위클래스임
 * 				예) extends
 * 					implements
 *			· 인터페이스는 다중 상속을 사용함 => 콤마(,)로 구분
 *			
 *			interface ===== interface
 *					 extends
 *			interface =====	class
 *					implements
 *			class A
 *			interface B
 *			interface C
 *			class D extends A implements B,C // extends : 확장 / implements : 구현
 *			{
 *			
 *			}			
 * 		
 */

//interface A
//{
////	public static final int a = 0;
//	void aaa(); // (public abstract) 생략 가능
//}
//
//class B implements A
//{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


interface A
{
	void aaa();
}

interface B // extends A
{
	void bbb();
}

class C implements B, A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}
	
}


public class MainClass2 {
//	final int a=10;
	
	public static void main(String[] args) {
//		B b=new C();
//		b.aaa();
//		b.bbb();
//		A a=new C();
//		a.aaa();
		
		C c=new C();
		c.aaa();
		c.bbb();
		
	}
	

}
