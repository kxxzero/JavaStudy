package com.sist.main;

/*
 * 	접근지정어 : 어느 클래스까지 접근할 수 있는지 설정
 * 		- private : 자신의 클래스에서 사용 가능 => 멤버 변수(저장된 데이터 보호)
 * 		- default : 같은 패키지 안에서만 접근 가능 => 사용 빈도가 거의 없음
 * 		- protected : 같은 패키지 안에서 접근 가능, 상속을 받을 경우 상속 내린 클래스의 패키지까지 접근 가능 => 사용 빈도 거의 없음
 * 		- public : 패키지와 관계 없이 모든 클래스에 접근 가능
 * 			=> 클래스 public class ClassName
 * 			=> 메소드 public 리턴형 메소드명()
 * 			=> 생성자 public 클래스명()
 * 			=> 객체지향 프로그램은 객체와 객체의 상호 작용
 * 							----------
 * 							연결 : 메모리 할당
 * 							교환 : 메소드
 * 	멤버 변수(지역 변수에서는 사용 불가)
 * 		[접근 지정어] 데이터형 변수명;
 * 		---------- 기본형, 참조형(사용자 정의 : 배열/클래스)	
 * 		private(데이터 보호 => 다른 클래스에서 사용 불가)
 * 			=> 저장 / 읽기 => 메소드 => Getter/Setter
 * 				예) public String getName()
 * 					{
 * 						return name;
 * 					}
 * 					getXxx() => age getAge()
 * 					=> public void setName(String name)
 * 						{
 * 							this.name=name;
 * 						}
 * 			=> 변수는 은닉화 메소드를 이용해서 변수 사용이 가능 => 캡슐화	
 * 
 * 		public class ClassName
 * 		{
 * 			private int a1;
 * 			private long a2;
 * 			private double d;
 * 			private boolean bb;
 * 			private int[] arr=new int[5];
 * 			private Music music=new Music();
 * 		}
 * 	생성자
 * 		- 클래스명과 동일
 * 		- 리턴형이 없음
 * 		- 여러 개 사용 가능
 * 		예) public class A
 * 			{
 * 				A(){} => X
 * 				public A(){}
 * 				public A(int a){}
 * 			}
 * 	멤버 메소드
 * 		[접근 지정어] 리턴형 메소드명(매개변수...) // 접근 지정어 대부분(98%) public 사용 
 * 		{
 * 			구현부	
 * 		}
 * 	패키지 : 폴더 => 관련된 클래스를 모아서 저장하는 공간
 * 				---------------
 * 				패키지가 다르면 같은 이름의 클래스 사용 가능
 *	
 *	***
 *	- 묶기
 *		· 관련된 데이터 => 배열(같은 데이터형) / 클래스(다른 데이터형)
 *		· 명령문(기능별 분리) => 메소드
 *		· 클래스(관련된 묶음) => 패키지
 *			=> 패키지 제작 : 라이브러리
 *			=> 패키지 사용
 *				같은 패키지 : import 없이 사용 가능
 *				다른 패키지 : import를 통해 클래스를 읽어 옴
 *						----------
 *						라이브러리 / 사용자 정의 클래스
 *				*** 패키지명은 com(org).회사명.압축
 *					DB연결 : com.sist.dao
 *	- 분리
 *		· 서버단 : 데이터를 관리
 *		· 클라이언트단 : 화면 출력 => main => JSP	
 *  					
 */

public class 패키지_접근지정어_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
