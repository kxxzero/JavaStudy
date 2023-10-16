package com.sist.main2;

/*
 * 변수, 메소드 오버라이딩 => 변경 가능 => 덮어쓰기
 * 
 * 	오버라이딩	
 * 		1) 메소드명 동일
 * 		2) 상속
 * 		3) 매개 변수 동일
 * 		4) 리터형 동일
 * 		5) 접근 지정어 축소 불가 / 확대 가능
 * 			private < default < protected < public
 * 
 */
class Super
{
	int number=10;
	void display()
	{
//		System.out.println("Super:display Call...");
		System.out.println("Sub:display Call...");
	}
}

class Sub extends Super // Super 클래스를 확장해서 새로운 클래스 생성
{
	int number=20;
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Super sup=new Super();
//		System.out.println("Super.number="+sup.number);
//		
//		Sub sub=new Sub();
//		System.out.println("Sub.number="+sub.number);
//		
//		Super su1=new Sub();
//		System.out.println("Super.number="+su1.number);
		// 클래스 선언에 따라서 해당 데이터를 제어
		// Super 생성 => Super에 있는 변수
		
		Super s1=new Super();
		s1.display(); // Super
		
		Sub sub=new Sub();
		sub.display(); // Sub
		
		Super s2=new Sub();
		s2.display(); // Sub
		
		/*
		 * 	멤버변수 : 선언된 클래스형
		 * 		예) Super s=new Super() => Super가 가지고 있는 변수 제어
		 * 			Sub sub=new Sub() => Sub가 가지고 있는 변수 제어
		 * 			Super s=new Sub() => Super가 가지고 있는 변수 제어
		 * 	
		 * 	메소드 : 생성자 타입
		 * 		예) Super s=new Super() => Super
		 * 			Sub sub=new Sub() => Sub
		 * 			Super s=new Sub() => Sub
		 * 			=> 동적 바인딩
		 * 				생성자에 따라서 메소드 주소값이 변경
		 * 				생성자에 따라서 메소드 변경 가능, 변수 변경 불가
		 * 			
		 */
	}

}
