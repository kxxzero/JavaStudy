package com.sist.main;

/*
 * 	인터페이스 : 같은 기능(강제화)을 가지는 클래스를 생성하여 제어
 * 		1) 	목적 : 서로 다른 클래스를 묶어서 관리
 * 			예) 	interface I
 * 				{
 * 					void aaa();
 * 					void bbb();
 * 					void ccc();
 * 					void default ddd();
 * 					void default eee();	
 * 					void default kkk();
 * 				}
 * 				class A implements I
 * 				{
 * 					void aaa();
 * 					void bbb();
 * 					void ccc();
 * 					void ddd();
 * 				}
 * 				class B implements I
 * 				{
 * 					void aaa();
 * 					void bbb();
 * 					void ccc();
 * 					void eee(); 
 * 				}
 * 				class C implements I
 * 				{
 * 					void aaa();
 * 					void bbb();
 * 					void ccc();
 * 					void kkk();
 * 				}
 * 				=> 인터페이스로 관리할 수 없음
 * 					I i=new A(); // i를 가지고 A가 가지고 있는 메소드를 제어 => 접근할 수 없는 메소드
 * 						aaa(), bbb(), ccc(), ddd() => 접근 불가
 * 					I i=new B(); // i를 가지고 B가 가지고 있는 메소드를 제어
 * 					I i=new C(); // i를 가지고 C가 가지고 있는 메소드를 제어
 * 				=> A,B,C가 유형이 같은 경우 1개의 이름으로 제어
 * 
 * 		2) 	특징
 * 			- 소스 코딩이 간결
 * 			- 인터페이스의 메소드가 동일
 * 				예) 				DriverManager
 * 									  |
 * 					-----------------------------------
 * 					  |	   |	 |	  |		|	   |
 * 					오라클 MySQL MSSQL DB2 SQLITE 사이베이스...
 * 					=> SQL => ANSI(표준화)
 * 
 * 		
 * 		*** Collection(컬렉션 : CRUD) // 배열 대신 사용
 * 					  |
 * 			--------------------
 * 			  |
 * 			List
 * 			  |
 * 			--------------------------------------------------
 * 				|		   |		  |			  |		  |
 * 			ArrayList	Vector	 LinkedList		Stack	Queue
 * 			
 * 				
 * 
 * 		3) 	인터페이스 VS 추상클래스
 * 			------------------------------------------------------------
 * 						인터페이스						추상클래스
 * 			------------------------------------------------------------
 * 			구현메소드		선언된 메소드					선언된 메소드/ 구현 메소드
 * 						public void display1();	
 * 						1.8 버전)
 * 						= default(접근지정어가 아님)
 * 							=> 구현된 메소드 사용
 * 							 
 * 						public default void display2();
 * 						= static
 * 							=> 반드시 인터페이스명으로만 접근 가능
 * 			------------------------------------------------------------
 * 			인스턴스 변수	사용 불가 => 공용				사용 가능
 * 						=> 상수형 변수만 사용 가능			private 변수 가능
 * 						=> public (only)
 * 						openjdk 1.9 버전)
 * 						= private 사용 가능
 * 			------------------------------------------------------------
 * 			생성자		존재하지 않음					존재함
 * 			------------------------------------------------------------
 * 			접근 범위		모든 내용 공개 => 메소드, 변수		한정(모든 접근 지정어 가능)
 * 			------------------------------------------------------------
 * 			상속			다중 상속						단일 상속
 * 						implements					extends
 * 						· interface → interface
 * 								extends
 * 						· interface → class
 * 								implements
 * 						= 사용자 정의, 라이브러리
 * 							=> 단일 상속 중심
 * 						= 윈도우 : 여러 개 받는 경우가 있음
 * 			------------------------------------------------------------
 * 			*** 공통점
 * 				= new를 이용해서 메모리 할당 가능
 * 				=> 상속을 내려서 상속 받은 클래스가 구현해서 사용
 * 				목적
 * 				= 서로 다른 클래스를 연결해서 사용 가능
 * 				= 관련된 클래스를 모아서 사용할 때 주로 사용
 * 			*** 실생활
 * 				= 전기 110 ↔ 220 => 어뎁터
 * 				= 컴퓨터 : 마우스, 키보드
 * 				
 * 		4) 인터페이스 구성 요소
 * 			public interface interface명
 * 			{
 * 				상수 : 반드시 초기값 설정(명시적으로 설정)
 * 				int a=10;
 * 				
 * 				(public stativ final) int 10;
 * 				=> 생략이 되면 접근지정어 / 제어어를 투가
 * 				------------------------------
 * 				구현이 안 된 메소드 : 프로그램에 맞게 구현
 * 				=> 개발자가 알아서 구현
 * 				(public abstract) void display();
 * 				------------------------------
 *				구현이 된 메소드 : 공통으로 사용되는 부분
 *				=> 필요할 때마다 변경해서 사용
 *				(public) default void method(){} // 접근지정어라 아니라 구현된 메소드
 *				(public) static void method(){} // 인터페이스명, 메소드명()
 *			*** 만약에 기능 추가가 있는 경우 default를 이용
 *				
 *						
 * 			}
 * 
 * 						
 */


interface I
{
	// public은 생략 시 컴파일러에 의해 자동으로 public이 추가됨
	public static void display()
	{
		System.out.println("I:display() Call...");
	}
}

class A
{
	public static void aaa()
	{
		System.out.println("A:aaa() Call..");
	}
}

class B extends A // 상속
{
	public void bbb()
	{
		aaa();
		A.aaa();
	}
}

class C implements I // 구현(상속) => class(단일 상속), interface(다중 상속)
{
	public void ccc()
	{
		 // display();
		I.display(); // 인터페이스의 static 메소드 => 인터페이스명으로 접근 가능
		
	}
}

interface AA
{
	void aaa();
	void bbb();
	void ccc();
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List list=new List<E>()
//				{
//			
//				}
//		AA aa=new AA();
	}

}
