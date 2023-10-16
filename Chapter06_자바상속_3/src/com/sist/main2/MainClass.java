package com.sist.main2;

// 메모리 => 상위 클래스 메모리 할당 → 상속 받은 클래스 메모리 할당
class Super
{
	int a;
	public Super(int a)
	{
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}

class Sub extends Super
{
	int a;
	public Sub()
	{
		super(100); // 생략 가능 => 자동 추가 | 매개변수가 있는 생성자는 반드시 호출 후에 사용 가능
		// public Super()
		// Super super=new Super()
		// 생략이 가능한 경우 : 상위 클래스가 디폴트 생성자인 경우
		a=1000;
		System.out.println("Sub 생성자 호출...");
		System.out.println("Sub:a="+this.a); // sub
		// this는 자신을 나타내는 객체명
		System.out.println("Super:a="+super.a); // Super
		// super는 상위 클래스를 나타내는 객체
		
		/*
		 * 	메모리 할당
		 * 			heap
		 * 	--------------------
		 * 	--------------------
		 * 	super			a	=> super.a (Super => a)
		 * 	--------------------
		 * 	this			a	=> this.a, a(Sub => a)
		 * 	--------------------
		 * 	--------------------
		 */
	}
}


/*
 * 	final 클래스
 * 	public final class()
 * 	- 확장이 안 되는 클래스
 * 	- 상속을 받을 수 없음
 * 	- String, Math
 * 	- System...
 * 	- java.lang
 */


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub sub=new Sub();
	}

}
