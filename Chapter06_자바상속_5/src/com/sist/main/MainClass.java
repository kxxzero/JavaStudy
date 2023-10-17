package com.sist.main;

/*
 * 	객체지향의 3대 특성(문법 사항이 아닌 권장 사항)
 * 		예) 
 * 		· class Window extends JFrame => 재사용 => 상속
 * 			=> 변경 사항이 있는 경우
 * 
 * 		· class Window
 * 		{
 * 			JFrame f=new JFrame() => 재사용 => 포함
 * 		}
 * 			=> 웹 / 스프링 => 상속이 거의 없고 포함을 많이 사용
 * 
 * 		1. 캡슐화 : 데이터 보호
 * 			멤버 변수 => private(은닉화) => 기능(메소드) 설정을 통해 접근 => 읽기/저장(getter/setter)
 * 			=> 데이터를 감추고 메소드를 통해서 접근하는 방식
 * 
 * 		2. 상속/포함 : 기존의 클래스를 재사용
 * 			1) 상속
 * 			- 목적
 * 				· 재사용 : 신뢰성, 개발 속도 빠름
 * 				· 유지보수 
 * 				· 중복 제거
 * 				· 통일성
 * 			- 단점
 * 				· 실행 속도가 느림 (게임 => 어셈블러)
 * 					=> 자바 최적화 : exe(실행 파일)이 없는 웹, 모바일에서 주로 사용
 * 			- 장점
 * 				· 적은 양의 코드로 새로운 클래스 작성
 * 					예)
 * 						class JFrame => 1000줄
 * 						{
 * 							
 * 						}
 * 
 * 						class A extends JFrame
 * 						{
 * 						
 * 						}
 * 				· 코드를 공통적으로 관리하기 때문에 여러 코드를 추가(오버로딩), 변경(오버라이딩) 용이
 * 					*** 자바는 보통 오버라이딩 => 변경(프레임워크 : 실제 소스) => 스프링(전자정부프레임워크), 애니프레임워크
 * 			- 작성 방법
 * 				· extends(확장) : 기존의 클래스를 확장해서 새로운 클래스 제작
 * 					예)
 * 						class Parent
 * 						class Child extends Parent
 * 						=> 단점 : 단일 상속만 가능
 * 			- 특징
 * 				· 생성자, 초기화 블록은 상속 불가
 * 					=> 상속 받은 클래스의 객체 생성 시 상속 내리는 클래스가 우선적으로 먼저 메모리 할당
 * 					예)
 * 						class A
 * 						{
 * 							int a,b;
 * 							String s;
 * 							
 * 							public A()
 * 							{
 * 								
 * 							} => 자동 추가
 * 						}
 * 						
 * 						class B extends A
 * 						{
 * 							int c,d;
 * 							public B()
 * 							{
 * 								super() // 상속 받은 클래스의 생성자를 우선적으로 먼저 호출 => 보통 생략 되어 있음
 * 							} => 자동 추가
 * 						}
 * 					
 * 						B b=new B()
 * 						{
 * 							Stack => 메모리에서 처리(할당, 해제)
 * 							Heap => 실제 데이터 저장(프로그래머)
 * 						}
 * 				*** 모든 클래스의 상위 클래스(최상위 클래스) : Object
 * 				***	private : 상속 가능, 접근 불가능 => protected
 * 				*** 상속
 * 					= 상위 클래스 : super
 * 					= 자신 클래스 : this
 * 					= 상속을 내리는 클래스 : 상속 받은 클래스에 접근 불가
 * 					= 상속을 받는 클래스 : 자신 + 상속 내리는 클래스까지 접근 가능(this+super)
 * 													 				
 * 		3. 다형성 : 필요 시 
 * 			- 변경 : 오버라이딩
 * 			- 추가 : 오버로딩
 * 
 */

class A
{
	int a;
}

class B extends A
{
	int c;

	public B() {
		super(); // Object의 상속을 받고 있음 => 자동 추가
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
