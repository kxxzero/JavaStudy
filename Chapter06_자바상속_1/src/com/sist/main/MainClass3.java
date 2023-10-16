package com.sist.main;

/*
 * 	객체 지향
 * 		- 데이터 손실 방지 : 캡슐화 => 변수 은닉화(private) => 기능(getter/setter) 처리
 * 		- 재사용 : 상속 / 포함(포함을 더 많이 사용)
 * 			· 상위 클래스 : 상속을 내리는 클래스 => 공통적으로 사용하는 내용(변수, 메소드)
 * 			· 하위 클래스 : 상속을 받는 클래스 => 재사용 => 확장(extends)
 * 				여러 개의 하위클래스를 묶어서 사용 => 상위 클래스 이용
 * 				단일 상속만 사용
 * 				키워드(extends)
 * 			= 변경 없이 있는 그대로 사용 : 포함 =>
 * 				예)
 * 					class Window
 * 					{
 * 						JFrame fr=new JFrame()
 * 					} 
 * 			= 변경해서 사용 : 상속
 * 				예)
 * 					class Window extends JFrame
 * 			*** new를 이용하지 않아도 메모리 할당 가능(리플렉션)
 * 			*** 사용법
 * 				class A
 * 				class C
 * 				class B extends A,C => 오류(C언어, React)
 * 				----------------------------------------
 * 				class A
 * 				class C extends A => A, C
 * 				class B extends C => A, C, B
 * 				=> 상속을 받은 클래스가 메모리는 크다
 * 				=> 클래스의 크기는 위로 올라갈수록 큼(범위) => 공통 기반, 
 * 
 * 				class A
 * 				class B extends A		A>B => is-a(상속)
 * 
 * 				class A
 * 				class B
 * 				{
 * 					A a=new A()			B>A => has-a(포함)
 * 				}
 * 				
 * 			= static : 상속은 불가 => 공통 사용 가능
 * 			= private : 상속은 가능 => 접근 불가
 * 			= 생성자
 * 			= 초기화 블록 => 예외
 * 
 *  		*** 메모리 할당
 *  			여러 개를 묶어서 사용 => 상위 클래스로 메모리 할당
 *  			확장된 클래스로 메모리 할당
 *  			class A
 *  			class B extends A => B, A
 *  			class C extends A => C, A
 *  			class D extends A => D, A
 *  			class E extends A => E, A
 *  			=> B b=new B()
 *  			
 *  			
 * 
 * 		- 유지보수(수정(오버라이딩)/추가(오버로딩)) 가능 : 다형성
 *
 */

public class MainClass3 {

	public static void main(String[] args) {
		
	}
}
