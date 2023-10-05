
// 문자 입력 => 대문자, 소문자, 숫자, 기타 구분

import java.util.*;
public class 메소드_문제_4 {
	
	// 입력
	static char userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=scan.next().charAt(0);
		return c; // 다른 곳에서도 사용할 수 있도록 넘겨주는 것
	}
	
	// 처리
	static String check(char c)
	{
		String res="";
		if(c>='A' && c<='Z')
		{
			res=c+"는(은) 대문자입니다.";
		}
		else if(c>='a' && c<='z')
		{
			res=c+"는(은) 소문자입니다.";
		}
		else if(c>='0' && c<='9')
		{
			res=c+"는(은) 숫자입니다.";
		}
		else
		{
			res=c+"는(은) 알파벳이나 숫자가 아닙니다.";
		}
		
		return res;
	}
	
	// 출력
	static void print(String res) {
		System.out.println(res);
	}
	
	// 조립
	static void process()
	{
		char c=userInput();
		String res=check(c);
		print(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		 
	}

}
