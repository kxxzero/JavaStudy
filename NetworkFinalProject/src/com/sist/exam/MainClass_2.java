package com.sist.exam;
/*
 * 	Thread : 1개의 프로그램에서 여러 개의 기능을 동시에 수행 => 실시간 변경(증권, 은행) => Ajax
 * 		1) 생성
 * 			new Thread()
 * 			= 이름 부여(Thread-0...)
 * 			= 이름 읽기 => getName()
 * 			= 이름 변경 => setName()
 * 			= 우선 순위 => 1~10(숫자가 클수록 높은 순위 => 작업 속도가 빠름)
 * 				MIN_PRIORITY : GC() => 1
 * 				NORM_PRIORITY : 사용자 정의 => 5
 * 				MAX_PRIORITY :  main() => 10
 * 		2) start() => 대기(Runnable)
 * 		3) run() => Running
 * 		4) sleep() => Wait
 * 		5) interrupt() => dead
 * 
 */

class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread()+":"+i);
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}
			
		}
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시분할 프로그램 => 시간을 나눠서 한 번씩 호출
		System.out.println(Thread.currentThread());
		MyThread2 t1=new MyThread2();
		MyThread2 t2=new MyThread2();
		MyThread2 t3=new MyThread2();
		MyThread2 t4=new MyThread2();
		MyThread2 t5=new MyThread2();
		
		t1.setName("홍길동");
		t2.setName("박문수");
		t3.setName("이순신");
		t4.setName("강감찬");
		t5.setName("심청이");
		
		t1.setPriority(10); // Priority : 우선 순위
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		
		// 대기 상태 => 동작
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
