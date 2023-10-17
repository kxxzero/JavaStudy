
/*
 * 	1. 문자열 입력 => 대문자 → 소문자 / 소문자 → 대문자
 * 		①문자열 입력	②대소문자 변경
 * 
 * 	2. 문자열 입력 => 역순으로 출력
 * 		①문자열 입력 	②역순으로 출력
 */

import java.util.Scanner;
public class 메소드_2 {
	// 문자열 입력 : 리턴형 => String, 매개변수 없음 
	static String userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return scan.nextLine(); // next() : 엔터 시 메모리 저장(공백을 기준으로 문자열 인식) / nextLine() : 엔터 시 메모리 저장(줄바꿈을 기준으로 문자열 인식)
	}
	
	// 대소문자 변경 : 리턴형 / 매개변수 있음(String) => 결과값을 받아서 출력, 메소드 안에서 처리(○)
	static void alphaChange(String msg)
	{
		String result="";
		for(int i=0; i<msg.length(); i++)
		{
			char c=msg.charAt(i);
			if(c>='A' && c<='Z') // 대문자
			{
//				result+=(char)(c+32); // 소문자 변환
				result+=String.valueOf(c).toLowerCase(); // toLowerCase() : 소문자로 변환 => String에서만 사용 가능 / String.valueOf() : 문자열(String)로 변환
			}
			else if(c>='a' && c<='z') // 소문자
			{
				result+=(char)(c-32); // 대문자 변환
				result+=String.valueOf(c).toUpperCase();
			}
			else
			{
				result+=c;
			}
		}
		System.out.println("결과값:"+result);
	}
	
	// 역순으로 출력 => 결과값을 받아서 출력(○), 메소드 안에서 처리
	static String alphaReverse(String msg)
	{
		String result="";
		for(int i=msg.length()-1; i>=0; i--)
		{
			char c=msg.charAt(i);
			result+=c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println("입력값:"+msg);
		alphaChange(msg);
		String res=alphaReverse(msg);
		System.out.println("역순으로 출력:"+res);
	}

}
