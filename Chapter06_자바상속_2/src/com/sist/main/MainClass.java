package com.sist.main;

/*
 *	상속
 *		1) 멤버 변수
 *			- static
 *			- private
 *
 *		2) 접근 지정어
 *			- public : 패키지와 상관 없이 가능, 접근 가능
 *			- protected
 *			- default : 패키지가 같은 경우 가능
 *			- private : 상속 받기 가능, 접근 불가
 *			=> 생성자, 초기화 블록은 받을 수 없음
 *
 *			*** 클래스 여러 개를 1개의 객체로 접근 시에는 상위 클래스를 이용
 *				예) 	   Student
 *					   |	|
 *				HStudent	UStudent
 *				HStudent h=new HStudent()
 *				UStudent u=new UStudent()
 *				-------------------------
 *				Student h=new HStudent()
 *				h=new UStudents()
 *
 *			*** 모든 클래스를 1개의 객체로 연결 가능
 *
 *				Object o=new MainClass()
 *				o=new MianClass()...
 *				Object는 모든 데이터형을 묶어서 사용 가능
 *				Object o=10;
 *				o=10.5;
 *				o=true;
 *			*** Object는 최상위 데이터형으로 모든 데이터를 받을 수 있음
 *
 *			자바의 매개 변수가 객체인 경우
 *			Object => 형변환 => 제네릭스
 *
 *			*** 형식) class 하위 클래스 extends 상위 클래스
 *			*** 단일 상속만 가능 => 다중 상속 불가
 *				예)
 *					class Man
 *					{
 *						String name;
 *						int age;
 *					}
 *					class Woman
 *					{
 *						String name;
 *						int age;
 *					}
 *					class Human extends Man, Woman // 다중 상속 => 자바에서는 존재하지 않음
 *					{
 *						String name;
 *						int age;
 *						String name;
 *						int age;
 *					}
 *					//  자바의 다중 상속 => 인터페이스
 *			
 *		3) 메소드
 *		
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
