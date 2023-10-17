
/*
 *	식별자 : 변수, 상수, 메소드, 클래스, 인터페이스
 *	
 *	제어문
 *		- 조건문(형식, 사용처 중요)
 *			· 선택문 : 값이 1개 => 키보드, 서버 프로그램 => Application
 *				형식 : switch(정수, 문자, 문자열)
 *					{
 *						case 값 :
 *							실행 문장
 *							break; => 실행 후 종료(중복적으로 실행 문장이 있는 경우에는 break 생략이 가능)
 *						case 값 :
 *							실행 문장
 *						default : 값이 없는 경우 실행 문장
 *					}
 *			· 단일 조건문 : 독립적(if문마다 따로 수행), 조건에 해당되는 모든 내용 출력 시 사용 => 웹(상세보기, 로그인, 아이디 찾기)
 *				형식 : if(조건문) // 조건 : true/false => 비교연산자, 논리연산자, 부정연산자
 *					{
 *						조건이 true일 때 수행
 *					}
 *			· 다중 조건문 : 사용 빈도가 상대적으로 낮음
 *				형식 : if(조건문)
 *					{
 *						조건이 true일 때 수행 => 종료
 *						조건이 false일 경우 => 다음 조건(if)으로 이동
 *					}
 *					else if(조건문)
 *					{
 *						조건이 true일 때 수행 => 종료
 *						조건이 false일 경우 => 다음 조건(if)으로 이동
 *					}
 *					else
 *					{
 *						조건이 없는 경우 수행
 *					}
 *			· 선택 조건문 : true와 false를 따로 나눠서 처리 => 계정 유무
 *				형식 : if(조건문)
 *					{
 *						조건이 true일 때 수행
 *					}
 *					else
 *					{
 *						조건이 false일 때 수행
 *					}
 *		- 반복문
 *			DB단 : DBA
 *			View단 : HTML, JS
 *			Back단  :Java
 *
 *			· for : 반복 횟수가 있는 경우 => 웹) 목록 출력, 쿠키 출력 등
 *				형식 : for(①초기값;②조건식;④증감식)
 *					{
 *						③반복 실행 문장
 *					}
 *					=> 조건식이 false가 될때까지 ② ~ ④ 반복
 *
 *				① 초기값 : 조건식에 사용할 변수 선언 => 초기화(초기값)는 처음 1회만 사용
 *				② 조건식 : 반복 횟수 => 반복문을 중단할지 여부 확인
 *						true => 반복 수행, false => 종료
 *				④ 증감식 : 조건식이 false가 되는 조건을 만듦

 *				예) for(int i=1;i<=10; i++)
 *					{
 *						수행문
 *					}
 *
 *			· while : 반복이 횟수가 없는 경우(무한 루프), 선조건이 false일 경우 아예 실행 못 할 수도 있음 => 서버 프로그램, 게임, 데이터베이스프로그램(예: 오라클), 파일 읽기 등
 *				형식 : while(조건문)
 *					{
 *						반복 실행 문장
 *					}
 *
 *			· do ~ while : 반복 횟수가 없으나 1회는 반드시 실행하는 경우, 일단 1회 수행 후조건
 *				형식 : do
 *					{
 *						반복 실행 문장
 *					} while(조건문)
 *		- 반복제어문
 *
 */

public class 자바제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		
		
		System.out.println("===== for =====");
				
		for (int i=1; i<=10; i++) { // 1 ~ 10 => 10회 반복
			System.out.println("Hello For문");
		}
		
		
		System.out.println("===== for =====");
		
		for (int i=0; i<10; i++) { // 0 ~ 9 => 10회 반복
			System.out.println("Hello For문");
		}
		
		
		System.out.println("===== for =====");
		
		for (int i=10; i>=0; i--) { // 10 ~ 0 => 10회 반복
			System.out.println("Hello For문");
		}
		
	}

}
