package com.sist.exception;

/*
 * 	기본적으로 try ~ catch를 사용
 *  소스가 복잡한 경우 소스 추가 시 throws를 가끔 사용 => 라이브러리에서 제공
 *  
 *  - 예외 처리(수정이 가능한 에러) 주 사용처
 *  	· 네트워크 : IP, Web Site,
 *  	· 입출력(IO) : 파일명, 파일 경로
 *  	· SQL : 오라클 문장(CRUD : SELECT, INSERT, UPDATE, DELETE)
 *  		=> DML : 데이터 조작	
 *  
 *  - 예외 처리 클래스
 *  	· Throwable : 예외의 최상위 클래스
 *  	· Exception
 *  
 *  - throw : 임의로 발생 => 테스트(견고한 프로그램)
 *  
 *  *** 헷갈릴 경우 자동 완성기 사용 추천
 */

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10;
			if(a%2==0)
			{
				throw new Exception(a+"는(은) 홀수가 아닙니다."); // throws 아님
				// 이 아래에는 소스 코드 작성 불가
				// throw => 사용자 정의 예외 처리
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
