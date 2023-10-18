package com.sist.main;

/*
 * 	interface
 * 		- 서로 다른 클래스를 연결해서 사용
 * 		- 결합성이 낮은 프로그램
 * 		- 개발자가 같은 메소드를 사용 => 표준화
 * 		- 관련된 모든 클래스를 묶어서 1개의 이름으로 관리
 * 			=> Model => 형식 => interface
 * 			=> class A
 * 			   class B extends A
 * 
 * 				A a=new A() // a에 있는 변수, 메소드만 호출
 * 				B b=new B() // b에 있는 변수, 메소드만 호출
 * 				A c=new B()	// a에 있는 변수, 메소드는 B에 있는 것을 호출 => 오버라이드된 메소드를 사용
 * 				
 * 				interface I => aaa() => 클래스마다 공통으로 적용되는 메소드 선언
 * 				class A implements I
 * 				{
 * 					aaa() bbb()
 * 				}
 * 					I i=new A() (X) // A a=new A();
 * 				class B implements I
 * 				class C implements I
 * 
 * 				I i=new A(); // i.aaa() => i에 존재하는 메소드 중에 A에서 오버라이딩한 메소드 호출
 * 				I i=new B(); // 
 * 				I i=new C();
 * 
 * 				상위클래스 객체명=new 하위클래스()
 * 				=> 접근 : 변수는 상위클래스에 있는 변수만
 * 						메소드는 상위클래스에 있는 메소드만
 * 						=> 오버라이딩 된 것만 가져올 수 있음
 * 
 * 
 * 
 * 
 * 			class A
 * 			{
 * 				int a;
 * 				void aaa(){}
 * 			}
 * 			Object obj=new A();
 * 			
 * 			class B
 * 			class C
 * 			Object[] obj={new A(), new B(), new C()}
 * 
 * 			A a=(A)obj[0];
 * 			
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
