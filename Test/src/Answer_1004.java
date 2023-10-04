/*
 * 	리턴형 메소드명(매개변수...)
 * 	{
 * 		자체에서 void(결과값 없는 상태)
 * 	}
 * 	=> 메소드 : 기능 처리(연산자 + 제어문)
 * 		- 다른 클래스 연결
 * 		- 재사용(호출)
 * 
 * 
 * 	사용자 요청하는 값은 없다 => 매개 변수 없음
 * 
 * 	메소드 자체에서 출력 => 결과값 => main()
 * 	=> 메소드 사용 시 호출 // main()은 컴파일러에 의해 자동 호출 => Callback 함수
 * 	
 * 	메소드
 * 		- CallBack => main => 자동 호출되는 메소드(시작점)
 * 		- 사용자 정의 : 프로그래머가 직접 제작
 * 		- 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
 * 			· 자바에서 제공
 * 			· 외부 업체에서 지원(Jsoup, Spring) => mvnrepository.com
 * 			· CBD => 조립식 프로그램
 * 		- 조립 시, 재사용, 유지 보수가 편리하기 위함
 * 			· 재사용 : 메소드 불러오기
 * 				예) int aaa() => int a=aaa() : 넘겨준 값을 저장
 * 					double bbb() => double d=bbb()
 * 					void ccc() => ccc()
 * 					boolean ddd() => boolean b=ddd()
 * 
 * 		class A
 * 		{
 * 			int aaa(){}
 * 		}
 * 		class B
 * 		{
 * 			main()
 * 			{
 * 				A.aaa() // A라는 클래스의 aaa를 호출 예) Math.random()
 * 			}
 * 		}
 * 
 */

import java.util.*;
import java.util.Scanner;
public class Answer_1004 {
	
	// 1) 1~10까지 출력하는 메소드 구현 => 매개변수(X), 리턴형(X)
	static void num()
	{
		 for(int i=1; i<=10; i++)
		 {
			 System.out.print(i+" ");
		 }
	}

	
	// 2) 1~10까지 합을 구하는 메소드 구현 => 매개변수(X), 리턴형(O)
	static void sum()
	{
		int sum=0;
		for(int i=0; i<=10; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	static int sum2()
	{
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			sum+=i;
		}
		return sum; // 자체에서 출력할 경우 (void 사용, 리턴형 필요 없음)
	}
	
	
	// 3) 1~n까지 합을 구하는 메소드 구현 => 매개변수(O), 리턴형(X)
	static void numSum(int n)
	{		
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	
	// 4) 두 정수를 나눗셈 결과를 구해주는 메소드 구현 => 매개변수(O) 2개, 리턴형(O)
	static String div(int a, int b)
	{
		String result="";
		if(b==0)
		{
			result="0으로 나눌 수 없습니다.";
		}
		else
		{
			result=a+"/"+b+"="+a/b;
		}
		return result;
	}
	

	// 5) 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static void change(String msg)
	{
		System.out.println(msg.toUpperCase());
	}
	
	
	// 6) 문자열을 거꾸로 출력하는 메소드 구현 
	static void reverse(String msg)
	{
		for(int i=msg.length()-1; i>=0; i--)
		{
			char c=msg.charAt(i);
			System.out.print(c);
		}
	}
	
	
	// 7) 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
	// 년도 입력 메소드
	// 윤년 처리 
	// 출력
	static int yearInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력:");
		return scan.nextInt();
	}
	
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	static void print()
	{
		int year=yearInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		else
		{
			System.out.println("윤년이 아닙니다.");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== 1번 =====");
	// 1)
		num();
		
		
		System.out.println("\n===== 2번 =====");
	// 2)
		sum();
		//
		int sum=sum2();
		System.out.println(sum2());
		
		
		System.out.println("\n===== 3번 =====");
	// 3)
		numSum(5);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		numSum(num);
		
		
		System.out.println("\n===== 4번 =====");
	// 4)
		System.out.println("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int b=scan.nextInt();
		
		String res=div(a, b);
		System.out.println(res);
		
		
		System.out.println("\n===== 5번 =====");
	// 5)
		change("abcdef");
		
		
		System.out.println("\n===== 6번 =====");
	// 6)
		reverse("Hello");
	
		
		System.out.println("\n===== 7번 =====");
	// 7)
		print();
	}

}
