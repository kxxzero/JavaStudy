package com.sist.main;

class A
{
	private int a;
	public A(int a) // 매개변수가 있는 것을 우선 호출
	{
		this.a=a;
	}
}

class B extends A
{
	public B(int a) // 상속 시 매개변수가 동일해야 함(상속자가 없는 것 = 매개변수가 없는 것)
	{
		super(a);
	}
	
	public B()
	{
		super(1); // 메모리 할당을 위해 상위 클래스의 생성자(public A(int a))를 우선 호출하는 기능
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
