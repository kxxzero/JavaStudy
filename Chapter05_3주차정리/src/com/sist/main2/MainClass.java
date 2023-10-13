package com.sist.main2;

/*
 * 	static 메소드 / 인스턴스 메소드
 * 	static 변수, static 메소드를 호출
 * 	인스턴스 변수, 인스턴스 메소드는 반드시 객체 생성 후에 사용
 *  
 *  클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체)
 *  							=> 멤버변수와 지역변수의 구분
 *  							=> 지역변수, 매개변수 찾기 → 없는 경우에는 멤버변수에서 찾음
 *  예)
 *  	class A
 *  	{
 *  		int a=20; => 메모리 저장 위치가 다름
 *  		
 *  		void display()
 *  		{
 *  			int a=10;=> stack
 *  			System.out.println(this.a);
 *  		}
 *  		void display(int a)
 *  		{
 *  			System.out.println(a);
 *  		}
 *  		=> this : 객체
 *  			this() => 생성자(자신의 생성자를 호출할 때 사용)
 *  			=> 생성자에서만 사용 가능
 *  			=> 생성자 첫 줄에 위치함
 *  			예)
 *  				class A
 *  				{
 *  					A()
 *  					{
 *  					}
 *  					A(int a)
 *  					{
 *  						System.out.println("aaa");
 *  						this(); 오류 발생
 *  					}
 *  				}
 */

class Student
{
	int hakbun; // 0
	String name; // null
	String sex; // null
	
	public Student()
	{
		System.out.println("디폴트 생성자 호출...");
		this.hakbun=1; // 인스턴스 변수는 앞에 꼭 this를 붙여주어야 하지만 지역변수와 충돌이 없는 경우에는 this. 생략이 가능
		// Student가 가지고 있는 멤버 변수
		this.name="홍길동";
		this.sex="남자";
	}
	
	public Student(int hakbun, String name)
	{
		// 구분자 멤버변수와 지역변수의 구분
		this();
		this.hakbun=hakbun;
		this.name=name;
	}
	
	public Student(String sex)
	{
		this(); // 생성자 함수 호출
		this.sex=sex;
	}
	
	public Student(int h, String n, String s)
	{
		hakbun=h;
		name=n;
		sex=s;
	}
	
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	// 오버로딩 : 같은 메소드명으로 새로운 기능을 생성
		
}

public class MainClass {
	
	void display(int a, int b, int c)
	{
		System.out.println("display(int a, int b, int c)");
	}
	
	void display(double d, double d1, double d2)
	{
		System.out.println("display(double d, double d1, double d2)");
	}
	
	void display(double d, int d1, int d2)
	{
		System.out.println("display(double d, int d1, int d2)");
	}
	
	void display(double d, char d1, int d2)
	{
		System.out.println("display(double d, char d1, int d2)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass m=new MainClass();
		m.display(10.5, 'A', 100);		
		
		Student s1=new Student();
		s1.print();
		Student s2=new Student("여자");
		s2.print(); // 0, null, 여자
		Student s3=new Student("심청이");
		s3.print(); // 2, 심청이, null
		Student s4=new Student(3, "박문수", "남자");
		s4.print(); // 3, 박문수, 남자
		
//		Student s5=new Student(1, "홍길동", "여자");
//		s5.print();
		
		
	}

}
