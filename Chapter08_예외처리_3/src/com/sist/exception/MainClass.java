package com.sist.exception;

/*
 *	1. 자바 문법
 *		- 변수 / 연산자 / 제어문
 *		- 사용자 정의 클래스
 *			· 멤버변수 / 메소드 / 생성자
 *			· 클래스의 종류 => 인터페이스
 *		- 예외처리(에러방지) : 사전에 에러를 방지하는 프로그램 => 비정상 종료를 방지하고 정상 수행
 *			· 목적 : 프로그램 종료를 방지
 *				예) 로그인 => 미입력 => 종료 방지(로그인 유도)
 *					개인 정보 누출 => 자바스크립트로 제어
 *			· 자바에서 지원하는 예외처리
 *				① if문 고려 => 예외처리
 *				② CheckException : 컴파일 시에 예외처리가 되어 있는지 확인 => 반드시 예외처리를 함(io : 입출력, net: 네트워크, sql : 오라클연결) => 웹과 관련
 *				  UnCheckException : 사용자의 입력에 따라 달라짐
 *				③ 예외처리 방법
 *					= 예외 복구(catch) => 에러를 받아서 처리
 *						형식)
 *							try
 *							{
 *								* 대부분의 모든 소스, 부분 소스
 *								* 정상 수행할 수 있는 소스 코드
 *							}catch(예외처리 종류)
 *							{
 *								* try에서 에러 발생 시 처리하는 문장
 *								* 복구는 거의 없음
 *								* 에러 위치(printStackTrace())
 *								* 에러 정보 확인(getMessage())
 *								* 에러 수정 목적
 *							}
 *							=> catch는 여러 개 사용 가능 => 전체(Exception)
 *							=> try ~ catch는 예외 처리 순서(상속도)가 있음
 *							finally
 *							{
 *								* 생략 가능
 *								* 사용처 : 서버 종료, 오라클 연결/해제, 파일 닫기
 *								* 에러 발생, 에러가 없는 경우
 *							}
 *							=> 	try 수행 : 정상 수행
 *								catch : 에러가 있음
 *								finally : catch절과 상관없이 무조건 수행
 *
 *						동작 순서)
 *							try
 *							{
 *								문장1
 *								문장2
 *								문장3
 *							}
 *							catch(Exception e)
 *							{
 *								문장4
 *							}
 *							finally
 *							{
 *								문장5
 *							}
 *							=> try에 에러가 없는 경우 : 1-2-3-5-catch절은 통과 => finally는 수행
 *
 *							------------------------------------------------------------
 *
 *							try
 *							{
 *								문장1
 *								문장2 => // 에러 발생 => 수행하지 못하는 문장 => catch절로 이동
 *								문장3 // 수행하지 못하는 문장
 *							}
 *							catch(Exception e)
 *							{
 *								문장4
 *							}
 *							finally
 *							{
 *								문장5
 *							}
 *							=> try에 에러가 발생하는 경우 : 1-4-5
 *
 *					= 예외 회피 => JVM에 미리 발생이 예측되는 에러를 알려줌 => RuntimeException은 생략 가능(UnCheckException에 속하는 것들은 생략 가능)
 *						형식)
 *							메소드() throws 예외 처리의 종류...
 *							메소드() throws Exception, NumberFormatException
 *							=> throws 문장을 사용하는 때 : 이미 소스가 완료된 상태에서 에러 처리를 할 경우
 *							=> throws는 예외 처리 순서가 없음
 *							=> 라이브러리 뒤에 많이 붙음
 *								* throws를 이용하는 경우
 *								* try ~ catch를 이용하는 경우
 *
 *								예)
 *									void insert() throws Exception
 *									=> insert를 호출하기 위해서는 예외 처리를 하고 사용
 *									void method()
 *									{	
 *										insert() => 오류
 *									}
 *									=> void method() throws Exception
 *									{
 *										insert()
 *									}
 *									void method()
 *									{
 *										try
 *										{
 *											insert()
 *										}catch(Exception ex) {}
 *									}
 *					= 임의 발생 => 테스트
 *					= 지원하지 않는 예외 => 사용자 정의 예외		
 *				
 *	2. 라이브러리 
 *		- java.lang
 *			· Object
 *			· String
 *			· StringBuffer
 *			· Wrapper
 *		- java.util
 *			· Date
 *			· Calendar
 *			· StringTokenizer
 *			· Collection
 *				= ArrayList
 *				= HashSet
 *				= HashMap
 *		- java.io : 업로드/다운로드 => 파일 관련
 *		- java.net : 흐름(크롤링=>프로젝트) URL
 *		- java.sql : 자바에서 오라클 연동
 *			· Connection
 *			· Statement
 *			· ResultSet
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
		
	}

}
