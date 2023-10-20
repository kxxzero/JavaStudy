package com.sist.exception;

/*
 * 	예외 처리의 기본
 * 		*** try~catch~finally(가장 많이 사용)
 * 			- 형식)
 * 				try
 * 				{
 * 					에러 없이 실행 가능한 소스
 * 					// main => 정상 수행하는 문장 => 개발자 실수, 사용자의 입력 오류
 * 				}catch(Exception e
 * 				{
 * 					예외 복구 => 다시 입력 요청 => 다음 문장으로 이동
 * 					=> 예상되는 예외를 따라 처리 => 여러 개 사용 가능
 * 				}
 * 
 * 			- 동작 흐름
 * 				문장1
 * 				문장2
 * 				try => 전체/부분 => 에러가 발생할 수 있는 부분
 * 				{
 * 					문장3
 * 					문장4
 * 					문장5
 * 				}catch(Exception e)
 * 				{
 * 					문장6
 * 				}
 * 				문장7
 * 				문장8
 * 				=> 문장1 => 문장2 => 문장3 => 문장4 => 문장5
 * 				=> 문장7 => 문장8
 * 		--------------------------------------------------
 * 				문장1
 * 				문장2
 * 				try => 전체/부분 => 에러가 발생할 수 있는 부분
 * 				{
 * 					문장3
 * 					문장4 => int a=10/0 => 에러 발생 => catch 이동
 * 					문장5
 * 				}catch(Exception e)
 * 				{
 * 					문장6
 * 				}
 * 				문장7
 * 				문장8
 * 				=> 문장1 => 문장2 => 문장3 => 문장6 => 문장7 => 문장8
 * 		--------------------------------------------------
 * 				문장1
 * 				문장2 => 에러 발생
 * 				try => 전체/부분 => 에러가 발생할 수 있는 부분
 * 				{
 * 					문장3
 * 					문장4 => 에러 발생 => catch로 이동(밑에 있는 문장은 수행하지 못 함)
 * 					문장5
 * 						int a=10/0;
 * 						System.out.println(a); // 10 => 무시(건너 뜀) => catch로 이동
 * 				}catch(Exception e)
 * 				{
 * 					문장6 => 복구 => 문장3으로 이동
 * 				}
 * 				문장7
 * 				문장8
 * 				=> 문장1 => 종료 => 비정상 종료
 * 		--------------------------------------------------
 * 				try => 정상으로 수행하는 문장
 * 					=> 개발자 실수, 사용자 입력값 : 에러 발생(종료)
 * 				catch => 종료 방지를 위해서 수행하는 문장
 * 					=> 에러 발생 시 건너 뜀
 * 		*** 수행 문장에 이상이 없는 경우(에러가 없는 경우)
 * 			try
 * 			{
 * 				소스
 * 			}
 * 		*** 수행 문장에 이상이 있는 경우(에러가 있는 경우)
 * 			무시(건너 뜀) => catch로 이동
 * 
 * 				
 * 				
 * 
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2");
		try
		{
			System.out.println("문장3");
			System.out.println("문장4");
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8==정상종료");
	}

}
