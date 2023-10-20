package com.sist.exception;

/* 
 *	묶는 기술 => 객체 지향(누가 잘 묶엇 사용하는가) => 재사용
 *
 *	1. 변수 묶는 방법
 *		- 배열 : 같은 데이터형(메모리 크기가 동일 => 연속적 메모리 구조) => 인덱스 이용
 *		- 클래스 : 다른 데이터형(메모리 주소(.)
 *	2. 연산자/제어문
 *		- 메소드(명령문을 묶어서 사용)
 *	
 *	*** 컴포넌트(부품) : 1개의 기능
 *		= 조립 : 1개의 프로그램
 *		= 게시판, 회원, 맛집, 채팅, 예약, 추천, 결제
 *		= 영화 : 게시판, 회원, 예약, 추천, 결제 => 수정
 *
 *	*** 프로그램 3대 형식
 *		= 가독성
 *		= 최적화
 *		= 견고성
 *	
 *		1) 테스트 : 견고한 프로그램 => 사전에 에러를 방지하는 프로그램 => 예외 처리
 *			- 프로그래머의 실수
 *			- 사용자의 잘못된 입력
 *		
 *		2) 예외처리
 *			- 정의 : 사전에 에러를 방지
 *			- 목적 : 비정상 종료를 방지, 정상 종료를 할 수 있도록 함
 *			- 분류
 *				· 에러 복구 : try ~ catch
 *					try
 *					{
 *						정상적으로 수행할 수 있는 명령문 => 평상 시 코딩
 *						
 *					}catch(예외처리 클래스)
 *					{	
 *						try 안에 있는 명령문에서 오류 발생 시 => 여러 개 사용 가능(실행은 1개만 수헹)
 *					}
 *					finarlly // 생략 가능
 *					{
 *					}
 *						① 서버닫기
 *				· 에러 무시(에러 회피) : throws
 *				· 견고한 프로그램 : throw => 임의로 에러 발생
 *				· 프로그램은 항상 모든 것을 지원하지 않음 => 사용자 정의(예: 예약, 추천, 결제)
 *				· 사용자 정의 데이터형 => 기존의 데이터형을 모아서 새로운 데이터형을 제작 => class
 *				· 사용자 정의 메소드
 *				· 예외 처리가 없는 경우 => 사용자 정의 예외 처리
 *				예) 결제 모듈, 보안 처리, 데이터 베이스 => 솔루션
 *				
 *			
 *				예) 
 *					실행
 *					문장1
 *					문장2 => 에러(비정상)
 *					try
 *					{
 *						문장3
 *						문장4
 *						문장5
 *					}catch(예외처리클래스)
 *					{
 *						문장6
 *					}
 *					finally // 무조건 실행
 *					{
 *						문장7
 *					}
 *					문장8 => 종료
 *
 *					1-2-3-4-5-7-8 => try가 정상이면 catch는 수행하지 않음(if ~ else)
 *
 *	
 *					try
 *					{
 *					}catch(A) // else if → finally
 *					{
 *						A에 대한 에러 복구
 *					}
 *					catch(B) // else if → finally
 *					{
 *						B에 대한 에러 복구
 *					}
 *					catch(C) // else if → finally
 *					{
 *						C에 대한 에러 복구
 *					}
 *					finally
 *					{
 *						닫기
 *					}
 *
 *					*** catch는 해당 영역에서 1번만 수행 => 종료
 *						
 */
import java.io.*;

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\movie.txt");
//			String data=""; // Ajax
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
//				data+=(char)i;
				sb.append((char)i);
			}
//			System.out.println(data);
			System.out.println(sb.toString());
		} catch (IOException e) {
			// 오류 발생 => 에러 확인
			/*
			 * 	getMessage() : 에러 메세지 => null
			 * 	printStackTrace() : 실행할 때 실행되는 순서를 보여줌 => 권장
			 */
			
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				
			}
		}
	}

}
