package com.sist.main;

/*
 * 	재사용 기법
 * 	기존의 클래스를 사용(라이브러리) => 라이브러리는 상속보다 포함
 * 	=> 상속을 할 수 없는 클래스 => 종단 클래스 : public final class ClassName
 * 	=> java.lang(String, Math, System, StringBuffer...) => 변경할 수 없음(완제품)
 * 
 *	= 상속(is-a)
 *	= 포함(has-a)
 *	=> 클래스를 비교할 수 없음
 *
 *	class A
 *	{
 *		int a,b,c,d,e,f;
 *	}
 *	class B
 *	{
 *		int a,b;
 *	}
 *	A > B(크기를 측정할 수 없음 = 오류 발생)
 *
 *	class A
 *	{
 *	}
 *	class B extends A
 *	{
 *	}
 *	A > B // 상속 받은 클래스보다 상속 내린 클래스가 더 큼
 *	*** 범위 => 공통성을 따짐
 *
 *	class A
 *	class B
 *	{
 *		A a;
 *	}
 *	=> 포함 클래스(A<B)
 *
 *	=> 포함 : 변경없이 있는 그대로 사용
 *	=> 상속 : 변경이 필요 => 오버라이딩
 *		예) 윈도우 => 윈도우를 자동차 모양으로 변경하여 사용	=> 상속
 *			class Login extends JFrame
 *			{
 *			}
 *			윈도우 => 윈도우를 사각형 모양으로 변경하여 사용 => 포함(있는 그대로 사용)
 *			class Login
 *			{
 *				JFrame fr=new JFrame(); 
 *				// 메소드에 선언한 것은 포함 클래스가 아님
 *				public void display()
 *				{
 *					JFrame fr=new JFrame(); 
 *				} => 지역 변수				
 *			}
 *			Login log=new Login();
 *			log.fr.메소드()
 *
 *			=> 포함 클래스가 많음
 *
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
