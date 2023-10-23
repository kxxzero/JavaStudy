package com.sist.exception;

class MyException extends Exception{ // 사용자 정의는 반드시 Exception 상속을 받아야 함
	public MyException(String msg)
	{
		super(msg);
	}
}

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=21;
			// catch 안에서 인식하는 예외 클래스는 라이브러리로 만들러진 예외만 인식 => 직접 호출해야 사용 가능
			// 호출 : throw new 생성자("관련 메세지")
			if(a%3==0)
			{
				throw new MyException(a+"는(은) 3의 배수를 사용할 수 없습니다.");
			}
			// 검색 시 주로 사용 => 한글(모음 => 문자열) => if
		}catch(MyException m)
		{
			System.out.println(m.getMessage());
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 에러 위치 확인
//			System.out.println(m.getMessage()); // 에러 메세지
		}
	}

}
