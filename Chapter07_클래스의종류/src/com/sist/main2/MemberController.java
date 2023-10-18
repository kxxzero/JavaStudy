package com.sist.main2;

interface I
{
	public void display(); // 구현하는 내용이 다른 경우
	public default void aaa()
	{
		System.out.println("default...");
	}
	
	public default void bbb()
	{
		System.out.println("BBB");
	}
	
}

class A implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A...");
	}
	
}

class B implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B...");
	}
	
}

class C implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C...");
	}
	
}
public class MemberController implements Controller{
	public void execute()
	{
		System.out.println("회원 관리 클래스");
	}
	
	public static void main(String[] args) {
		I i=new A();
		// I => display() aaa()
		// A => bbb
		
		i.display();
		i.aaa();
		
		i=new B();
		i.display();
		i=new C();
		i.display();
	}
}
