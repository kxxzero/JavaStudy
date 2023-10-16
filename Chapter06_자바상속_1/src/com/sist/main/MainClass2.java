package com.sist.main;

class A
{
	int a=10, b=20;
	void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
}

class B extends A
{
	int a=100, b=200;
	int c, d;
	// 오버라이딩 => 상속받은 메소드 변경
	void aaa()
	{
		System.out.println("B:aaa() Call..."); 
	}
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
}

// B클래스는 A클래스에 있는 모든 것을 사용할 수 있음(int a, b, aaa())
// A클래스는 B클래스에 있는 모든 것을 사용할 수 없음
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A(); // B클래스에 있는 변수, 메소드는 사용 불가
		System.out.println("a="+a.a);
		System.out.println("b="+a.b);
//		System.out.println("c="+a.c);
//		System.out.println("d="+a.d);
		a.aaa();
		
		B b=new B(); // b=> a,b,c,d,aaa(), bbb()
		System.out.println("a="+b.a);
		System.out.println("b="+b.b);
		System.out.println("c="+b.c);
		System.out.println("d="+b.d);
		b.aaa();
		b.bbb();
		
		// A > B => 클래스의 크기 => 범위(상속을 내린 클래스가 더 큼)
		// A a=new B();
		// B b=new A(); // 형변환 오류
		
		A aa=new B(); // aa => a,b,aaa()만 접근 가능
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
//		System.out.println("aa.c="+aa.c);
		aa.aaa();
		// 멤버 변수 > A aa
		// 메소드 => new B() 생성자
		// aa.bbb()
		
		B bb=(B)aa; // 상위 클래스 → 하위 클래스로 받는 경우 => 형변환 => 가장 많이 등장
//		B cc=new A(); // 오류 예) int aa=(int)10.5;
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		
		B cc=(B)new A(); // 오류 발생
		
		// 상속 : 하위 클래스로 접근하는 것이 기본
//			class A
//			clasa B extends A
//			B b=new B();
//			A a=new B(); => 여러 개의 클래스를 1개롤 묶어서 사용
//			A bb=new B();
//			B cc(A)bb;
		
	}

}
