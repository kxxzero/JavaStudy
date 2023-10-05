
/*
 * 	연도 입력 => 윤년
 * 
 * 	1. 입력 => 초기화 // 예) 회원가입 시 필요한 데이터 입력 => 로그인(ID, PWD)
 * 	2. 윤년 확인 => 오라클 연결해서 데이터 추가 // 예) 로그인 여부 확인
 * 	3. 결과값 출력 // 예) 로그인 이동 로그인 : 메인 이동, 로그인 실패 : 다시 입력 요청
 * 
 * 	* 브라우저 => 자바 => 오라클 * ===> 라이브러리
 */

import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;
public class 메소드_3 {
	
	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력:");
		int year=scan.nextInt();
		return year;
	}
	
	
	// 윤년 확인
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	
	// 출력
	static void print(boolean bCheck)
	{
		if(bCheck)
		{
			System.out.println("윤년입니다.");
		}
		else
		{
			System.out.println("윤년이 아닙니다.");
		}
	}

	
	// 조립
	static void process()
	{
		int year=userInput();
		boolean bCheck=isYear(year);
		print(bCheck);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
