package com.sist.exam;

/*
 *	Thread
 *		= 모든 프로그램(프로세스)에 1개 이상 존재 => 프로그램 안에서 여러 개의 프로그램을 동시에 수행
 *		= main method => Thread
 *		= 서버에는 반드시 쓰레드를 필요로 함 => 여러 명이 접근 시 통신 부분을 따로 수행
 *		= 클라이언트 ↔ 쓰레드 : 멀티 쓰레드
 *		= 사용처(사용자 정의 쓰레드)
 *			- 데이터 수집 =>  20만 개
 *			- 네트워크 서버 => 서버를 여러 개 수행
 *			- 게임(비행기) => 비행기, 총알 => 쓰레드
 *			- 웹 서버 => 아파치, IIS => 톰캣(테스트용 => 웹 서버) = WAS(Web Application Server)
 *			- 데이터베이스 서버 : 오라클 => 서버는 1개만 수행(사용자 요청에 대한 처리 => 쓰레드)
 *		= 사용자 정의 쓰레드
 *			- 서버 개발자
 *			- 서버측 사이드(서버에서 동작하게 코딩) => 백엔드
 *			- 방법
 *				· 쓰레드 상속
 *					public class MyThread extends Thread
 *					{
 *						Thread 확장
 *						Thread 동작
 *						public void run
 *						{
 *							=> 동작 : 한 가지 일만 수행
 *						}
 *					}
 *			
 *				· 확장 없이 동작만 수행
 *					인터페이스 구현 => 윈도우에서 주로 사용
 *					public class MyThread implements Runnable
 *					{
 *						public void run()
 *						{
 *							=> 확장 없이 동작만...
 *						}
 *					}
 *				
 *				· 익명 클래스 이용
 *					람다식 : 메소드명 없이 사용 => 코딩 간결 => () => run
 *					* 단점 : 재사용 불가 => 객체지향을 벗어남
 *					Runnable r=()->
 *					{
 *						구현
 *					}
 *					=> 자바스크립트
 *						function aaa() {}
 *						let aaa=() => {} => 선호 (람다(X), 화살표 함수(Arrow)
 *			
 *			- 쓰레드의 생명 주기(생성 ~ 소멸)
 *				① 쓰레드 생성 => Thread => java.lang
 *					new Thread() // 직접 생성하는 것이 아니라 이미 생성되어 있음
 *				② 대기 상태(쓰레드가 필요한 자원 확보)
 *					start()
 *				③ 쓰레드 동작
 *					run() // run() 메소드는 호출하지 않음 => start를 호출하면 run이 자동으로 호출됨
 *				④ 일시 정지
 *					sleep()
 *				  쓰레드 종료
 *					interrupt()
 *				*** 쓰레드는 시분할 프로그램 => 나눠서 작업
 *					예) 1 ~ 10 => 출력
 *						new Thread() => 1
 *							1) JVM => 이름 부여 => Thread-0 => 변경
 *								   => 우선 순위 => 사용자 정의 => 5 // 1~10까지 있으나 5까지만 주로 사용
 *									// 10(빠름) : main 
 *									// 1(느림) : gc 
 *									
 *						new Thread() => 1
 *						new Thread() => 1
 *						
 *			
 */

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100); // 1/1000 
			}catch(Exception ex) {}
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		// 동작 => run() => start()
		t1.start(); // Thread-0
		t2.start(); // Thread-1
		t3.start(); // Thread-2
		
		System.out.println(Thread.currentThread().getName()); // currentThread() : 현재 쓰레드
		
	}

}
 