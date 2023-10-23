package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
 * 	throws => 선언 => 예외회피
 * 	=> method 뒤에 붙어 있음
 * 	=> 라이브러리에서 주로 사용
 * 	  ----------> 자동 완성기 이용
 * 	=> throws 이용할 수 있음, try ~ catch 이용
 * 	----------------------------------------
 * 	주의점
 * 		void method() throws Exception, IOException, SQLException
 * 		{
 * 		}
 * 		=> 사용
 * 		void main() throws Exception, IOException, SQLException
 * 		{
 * 			
 * 		}
 * 		void main()
 * 		{
 * 			try
 * 			{
 * 				
 * 			}catch(IOException e)
 * 			{
 * 			}catch(SQLException e)
 * 			{
 * 			}catch(Exception e)
 * 			{
 * 			}
 * 		}
 * 		=> 가장 큰 예외처리로도 가능
 * 			void main() throws Exception
 * 			{
 * 			}
 * 			void main()
 * 			{
 * 				try
 * 				{
 * 				}catch(Exception e)
 * 				{
 * 				}
 * 			}
 */
public class MainClass_1 {
	// 소스 코드가 많거나 이미 만들어진 경우 => throws를 주로 사용 => 유지보수(중간 중간에 입력)
	// 처음 시작부터 사용하는 경우 => try ~ catch를 주로 사용 => 새 작업
	public void method() throws Exception, IOException, SQLException
	{
		// 컴파일 통과
		int i=Integer.parseInt("10 ");
		System.out.println(i);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();
		try
		{
			m.method();
		}catch(Exception e)
		{
			
		}
		System.out.println("프로그램 종료");
	}

}
