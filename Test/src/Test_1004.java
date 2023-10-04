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
 */

import java.util.Scanner;
public class Test_1004 {
	
	// 1) 1~10까지 출력하는 메소드 구현
	static void num()
	{
		 for(int i=1; i<=10; i++)
		 {
			 System.out.print(i+" ");
		 }
	}

	
	// 2) 1~10까지 합을 구하는 메소드 구현
	static void sum()
	{
		int sum=0;
		for(int i=0; i<=10; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	
	// 3) 1~n까지 합을 구하는 메소드 구현
	static int numSum(int n)
	{		
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		return n;
	}
	
	
	// 4) 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	
	
	
	// 5) 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	
	
	// 6) 문자열을 거꾸로 출력하는 메소드 구현 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== 1번 =====");
		// 1)
		num();
		
		System.out.println("\n===== 2번 =====");
		// 2)
		sum();
		
		System.out.println("\n===== 3번 =====");
		// 3)
		numSum(5);
		
		System.out.println("\n===== 4번 =====");
		// 4)
		
		System.out.println("\n===== 5번 =====");
		// 5)
		
		System.out.println("\n===== 6번 =====");
		// 6)
	}

}
