package com.sist.main;

/*
 * 	추상클래스 => 확장(보완) = 인터페이스
 * 	인터페이스
 * 		1. 추상클래스의 일종 => 인터페이스도 클래스
 * 			- 클래스 : 단일 상속
 * 			- 인터페이스 : 다중 상속
 * 		2. 인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있음
 * 			인터페이스에 메소드 추가가 되면 문제 발생 => JDK 1.8 구현 메소드(default/static)를 사용하게 만듦
 * 			=> 소프트공학 : 인터페이스 고정을 해야 함
 * 		3. 형식
 * 			public interface interface명
 * 			{
 * 				변수
 * 					상수형 변수
 * 						예)	int a; // 오류
 * 							int a=10;
 * 						추가 => (public static final) int a=10; // 괄호 생략 가능	
 * 				구현이 안 된 메소드
 * 					void display(); => 구현 내용이 많은 경우
 * 					=> 프로그램에 맞게 구현해서 사용
 * 					*** 인터페이스는 모드 메소드를 public으로 입력해야 함
 * 				구현이 된 메소드
 * 					default void aaa(){
 * 
 * 					}
 * 					=> (public) default void aaa() {} // public 생략 가능
 * 					static void bbb(){
 * 
 * 					}
 * 					=> (public) static void bbb(){
 * 						
 * 					}
 * 					=> public void aaa();
 * 					=> public default void bbb(){}
 * 					
 * 				생성자(추상 클래스에는 생성자가 있음)	
 * 			}
 * 			
 * 			***	인터페이스는 모든 접근지정어가 public (변수, 메소드)
 * 				변수 => 반드시 명시적인 초기화를 함
 * 					예) int a; => int a=10;
 *				상속
 *					implements : 구현해서 사용
 *					· 	interface → interface
 *						interface A
 *						interface B (extends) A
 *					=========================
 *					·	interface → class
 *						interface A
 *						class B (implements) A
 *					=========================
 *					·	class → interface
 *						class A
 *						interface B () A
 *					=========================
 *						class A
 *						interface B () A // 오류
 *					=========================
 *						interface A
 *						interface B extends A => A, B
 *						interface C extends B => A, B, C
 *					=========================
 *						interface D extends A, B // 다중 상속 : 여러 개를 동시에 상속 받을 수 있음(콤마로 구분)
 *					
 *						interface A
 *						interface B
 *						class C implements A, B // 다중 상속
 *
 *
 *						interface A
 *						interface B
 *						class C
 *						class D extends C implements A, B
 *							  ----------  ----------
 *							  class 상속	  interface 상속
 *						
 *						=> 윈도우
 *						=> 인터페이스에 설정된 모든 것(메소드, 변수)
 *							public만 사용 가능 => public을 설정하지 않으면 자동 추가
 *						=> 인터페이스 사용
 *							= 윈도우 이벤트(마우스 클릭 등) 처리
 *							= 사용자 정의 => 클래스 관리(스프링 : 클래스 찾기(DL))
 *							= 인터페이스 대신 어노테이션으로 변경
 *						=> 설계
 *							= 개발 기간 단축
 *								예)	예약
 *									로그인
 *									맛집 선택
 *									예약일 선택
 *									예약 시간 선택
 *									인원 확인
 *									계약금 송금
 *									=> 좌석 선택 가능
 *							= 인터페이스 => 표준화
 *							= 서로 다른 클래스를 연결해 주는 역할(스프링)
 *
 *				*** 인터페이스는 자신이 메모리 할당을 할 수 없음
 *					구현된 클래스를 이용해서 메모리 할당을 함
 *
 *					interface A
 *					class B implements A
 *
 */



//interface A
//{
//	void aaa();
////	void bbb();
//	
//	int a=10;
//	void disp();
//}
//
//class B implements A
//{
//	
//	public void disp() {} // 접근지정어는 확대만 가능
//	
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//class C implements A
//{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


import javax.swing.*;
import java.awt.event.*;
public class MainClass3 extends JFrame implements ActionListener, MouseListener, KeyListener{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
