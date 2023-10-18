package com.sist.main;

/*
 * 	클래스의 종류
 * 		- 일반클래스 : 사용자 정의
 * 			· 데이터형 클래스 : 여러 개의 변수를 모아서 한 번에 저장할 목적으로 사용
 * 				=> 	~VO(Value Object)
 * 					~DTO(Data Transfer Object)
 * 					=> 웹 : JSP(~Bean)
 * 			· 액션클래스 : 사용자 정의 클래스 => 데이터형 클래스를 제어할 목적으로 사용 => 메소드 
 * 				=> 	~DAO(Data Access Object) : 오라클 연결
 * 					~Manager : 파일 입출력, 크롤링, Open API)
 * 					~Service : DAO 여러 개를 묶어서 관리
 * 						DAO : 게시판
 * 						DAO : 댓글
 * 					~Controller : 자바에서 브라우저 연동
 * 					~RestController : 자바에서 자바스크립트로 값을 보내는 것 => JSON(자바스크립트가 인식할 수 있는 언어로 바꾸어 줌)
 * 					
 * 		- 추상클래스 : 단일 상속
 * 			· 주목적 : 관련된 클래스를 모아서 관리(서로 다른 클래스를 연결해서 사용)
 * 			· 미완성 클래스 : 메소드를 구현하지 않는 경우 => 선언
 * 				=> new를 이용해서 메모리 할당을 할 수 없음
 * 				=> 사용 시에는 반드시 상속을 내려서 구현 후 사용 => 오버라이딩 기법
 * 			· 단일 상속만 가능
 * 			· 선언만 한 메소드 존재할 수 있음
 * 			· 인스턴스 메소드, 인스턴스 변수 사용이 가능
 * 			· 형식
 * 				public abstract class ClassName
 * 					  ----------
 * 				{
 * 					변수 영역
 * 					메소드 => 구현
 * 						public void display(){}
 * 						=> 공용으로 사용 => 필요 시 오버라이딩 사용
 * 					메소드 => 선언
 * 						public abstract void display();
 * 						=> 상속을 받은 클래스는 반드시 구현을 해야 함
 * 						=> 구현이 안 되는 경우
 * 							버튼 => 디폴트가 불가(용도가 많음)
 * 							마우스
 * 							키보드
 * 				}
 * 				
 * 				public abstract ckass A
 * 				public class B extends A
 * 				{
 * 				}
 * 				=> A a=new B()
 * 				=> 구현된 클래스를 이용해서 메모리 할당
 * 
 * 			*** 추상클래스 : 공통성을 가지고 있는 클래스 => 요구 사항 분석
 * 				예) 게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기
 * 					묻고답하기 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 답변하기
 * 					댓글게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 * 					후기게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 * 						① 공통으로 사용되는 메소드를 찾음
 * 						② 추상메소드(구현이 안 된 메소드)
 * 							=> 클래스를 묶어서 한 개의 이름으로 제어
 * 							=> 설계 => 프로그램에 맞게 구현
 * 							=> ~~한 기능이 있는 사이트 제작
 * 							=> 상속 => 구현
 * 							=> 추상 클래스 1개로 모든 게시판 제어 => 카페
 * 				=> 추상 클래스 확인
 * 					① 선언된 클래스와 생성자가 다른 경우
 * 					② 메모리 할당 시 메소드 이용
 * 						예) List list=new ArrayList();
 * 
 * 		- 인터페이스 : 추상클래스의 일종 => 다중 상속
 * 
 * 		- 내부클래스
 * 
 * 
 * 
 * 		=> 버튼, 마우스, 키보드 => 디폴트(프로그램에 따라 다름)
 * 		   (구현이 안 되어 있음)
 * 			abstract class ActionListener
 * 			{
 * 				버튼클릭();
 * 				더블클릭();
 * 			}
 * 			abstract class MouseListener
 * 			{
 * 				마우스클릭_Left();
 * 				마우스클릭_Right();	
 * 			}
 * 			abstract class KeyListener
 * 			{
 * 				키보드DOWN();
 * 				키보드UP();
 * 			}
 * 
 * 			게임 제작
 * 			class Game1 extends ActionListener
 * 			class Game2 extends MouseListener
 * 			class Game3 extends KeyListener
 * 
 * 			class Game4 extends Game1
 * 			class Game5 extends Game4
 * 			
 * 			↓
 * 
 * 			class Game implements ActionListener, MouseListener, KeyListener // 다중 상속 가능
 * 			*** 추상 클래스 보완
 * 				① 다중 상속
 * 				② 구현이 안 된 메소드만 사용
 * 				③ 변수 => 상수
 * 				④ 기본 목적 => 다른 클래스에 영향을 미치지 않도록 함
 */

import java.util.*;

abstract class 도형
{
	// 선, 사각형, 삼각형, 원
	public abstract void draw(); // 추상 메소드 : 선언만 가능
	public void select()
	{
		System.out.println("검정색 사용");
	}
}

class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다.");
	}
	
}

class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
	}
	
}

class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
	}
	
	public void select()
	{
		System.out.println("빨간색 사용");
	}
	
}

class 삼각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다.");
	}
	
	public void select()
	{
		System.out.println("파란색 사용");
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("도형을 선택하세요. 선(1), 사각형(2), 원(3), 삼각형(4): ");
		int mode=scan.nextInt();
		
		도형 a=null;
		if(mode==1)
		{
			a=new 선();
		}
		else if(mode==2)
		{
			a=new 사각형();
		}
		else if(mode==3)
		{
			a=new 원();
		}
		else if(mode==4)
		{
			a=new 삼각형();
		}
		
		a.draw();
		a.select();
		
		
//		if(mode==1)
//			선 a=new 선();
//		{
//			a.draw();
//			a.select();
//		}
//		
//		else if(mode==2)
//		{
//			사각형 a=new 사각형();
//			a.draw();
//			a.select();
//		}
//		
//		else if(mode==3)
//		{
//			원 a=new 원();
//			a.draw();
//			a.select();
//		}
//		
//		else if(mode==4)
//		{
//			삼각형 a=new 삼각형();
//			a.draw();
//			a.select();
//		}
		
		
	}

}
