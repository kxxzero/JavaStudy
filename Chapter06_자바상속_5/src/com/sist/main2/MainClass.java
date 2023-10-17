package com.sist.main2;

class Movie
{
	// 공통
	// 예약
	// 영화 목록
	// 상세보기
	// 결제
	// 영화 추천
	
	void reserve()
	{
		System.out.println("예약을 한다.");
	}
	void list()
	{
		System.out.println("영화 목록을 보여준다.");
	}
	
	void detail()
	{
		System.out.println("영화 상세보기를 한다.");
	}
	
	void recommand()
	{
		System.out.println("영화 추천을 한다.");
	}
}

class CGV extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
//		super.reserve();
		System.out.println("CGV 예약");
	}

	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}
	
}

class MegaBox extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
//		super.reserve();
		System.out.println("메가박스 예약");
	}

	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}
	
	// 확장 => 기존 Movie가 가지고 있는 메소드 외에 다른 기능 추가
	public void print()
	{
		System.out.println("MegaBox:print() Call...");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		// 1개의 객체만 생성 => 상위 클래스
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 1개의 객체 이용
		
		Movie mm=new CGV(); // Movie 안에 있는 메소드를 호출
							// 메소드 호출 시에 오버라이딩을 할 경우 변경된 메소드 호출
		mm.reserve();
		
		mm=new MegaBox(); // mm은 print()를 호출할 수 없음
		mm.reserve();
//		mm.print();
		
		/*
		 * 	생성자와 클래스명이 다른 경우
		 * 	Movie m=new CGV()
		 * 
		 * 	
		 * 	class Movie
		 * 	{
		 * 		int a=100;
		 * 		void print()
		 * 		{
		 * 			movie
		 * 		}
		 * 	}
		 * 	class CGV extends Movie
		 * 	{
		 * 		int b;
		 * 		void aaa()
		 * 		{
		 *		}
		 *
		 * 		int a=1000; => 멤버변수 오버라이딩
		 * 		void print()
		 * 		{
		 * 			cgv	=> 메소드 오버라이딩
		 * 		}
		 * 	}
		 * 
		 * 	Movie m=new CGV()
		 * 	{
		 * 		m=> a, print() => CGV가 가지고 있는 print()
		 *		- 변수 => 클래스명
		 *		- 메소드 => 생성자 
		 * 	}
		 * 	
		 * 	=> 100개
		 * 	=> 분리
		 * 	=> 1개의 객체로 제어 => Object
		 * 	=> 배열 
		 * 		Object[] obj={10, "aaa", 10.5, 'A', new Movie()};
		 * 
		 */
		
//		Object o=10;
//		o=10.5;
//		o="";
//		o='A';

//		int i=(int)o;
		
		Object o=new CGV();
		CGV cc=(CGV)o; // 객체 형변환 => 자바에서 클래스 객체를 리턴하는 메소드가 많이 존재
	}

}
