package com.sist.exception;

/*
 * 	예외 처리
 * 		1. 목적
 * 			- 사전에 에러를 방지
 * 			- 비정상 종료를 방지하고 정상 상태를 유지
 * 			- 에러 발생 시 에러를 건너 뜀

 * 		2. 에러 발생
 * 			- 사용자 : 잘못된 입력 => 유효성 검색
 * 			- 개발자 : 실수(예: 배열 인덱스, 정수 변환, 형변환...)
 * 
 * 		3. 분류
 * 			- 사전 차단 : 조건문 (if)
 * 			- 예외 처리
 * 				· 에러(Error) : 소스상에서 수정이 불가능한 에러
 * 					예) 변수의 과도한 사용으로 메모리 저장 공간 부족
 * 				· 예외(Exception) : 소스상에서 수정이 가능한 에러
 * 					예) 파일경로명, IP, 0으로 나누기, 배열 인덱스...
 * 						int[] arr=new int[2];
 * 						arr[2]=10; // 0, 1
 * 
 * 		4. 사용 방법
 * 			- 예외 복구 : try ~ catch
 * 			- 예외 회피 : throws
 * 			- 임의 발생 : throw
 * 			- 지원하지 않는 예외 : 사용자 정의 예외 처리
 * 
 * 		5. 예외의 종류(상속도)
 * 			Object : 모든 클래스의 상위 클래스
 * 			└ Throwable : 예외의 최상위 클래스
 * 				└ Error : 처리 불가(메모리 부족, 윈도우 충돌, 톰캣 미작동, 오라클 미연결)
 * 				└ Exception : 처리 가능(0으로 나누기, 배열 인덱스 범위, 형변환, 파일명, IP) => 예외 처리의 최상위 클래스
 * 
 * 					└ CheckException : 컴파일 시 예외 처리를 했는지 확인
 * 						=> 라이브러리 중에 반드시 예외 처리를 함
 * 						· java.io : 파일명이 틀린 경우
 * 							=> FileNotFoundException, IOException
 * 						· java.lang : URL 주소, IP가 틀린 경우
 * 							=>MalformedURLException
 * 						· java.sql : 오라클 URL => SQLException
 * 							jdbc:oracle:thin:@localhost:1521:XE => 연결 포트
 * 
 * 					└ UnCheckException : 예외 처리 확인 없기 때문에 필요 시에만 사용
 * 						└ RuntimeException : 실행 시 에러, 예외를 확인할 수 없음 (예: 1 ~ 100 사이의 정수 입력)
 * 							└ NumberFormatException : 문자열로 받아서 정수로 변경시킴
 * 								=> 웹에서 가장 많이 발생
 * 								=> http://localhost/main/main/jsp?page=10 // URL 주소 입력 시 공백 사용 불가
 * 								=> 웹에서는 데이터 전송(URL) => 자바는 메소드의 매개변수를 이용해서 전송
 * 							└ ArrayIndexOfOutBoundsException : 배열의 인덱스 범위를 벗어나는 경우
 * 							└ NullPointerException : null(주소가 없는 경우)인 클래스를 사용한 경우 
 * 							└ ArithmeticException : 0으로 나눈 경우
 * 
 * 					└ ClassNotFoundException
 * 
 * 		6. 에러 예상 
 * 			예) 문자열로 정수를 받아서 배열에 저장한 다음 나누기를 함
 * 			   ----------		--------	 -----
 * 				   ①				②			③
 * 				① : NumberFormatException
 * 				② : ArrayIndexOfOutBoundsException
 * 				③ : ArithmeticException
 * 
 * 		*** 사전에 에러 방지 => 
 * 
 */

import javax.swing.*;

class A
{
	public void aaa()
	{
		System.out.println("A:aaa()");
	}
}

class B extends A
{
	public void aaa()
	{
		System.out.println("B:aaa()");
	}
}

public class MainClass_1 extends JFrame{
	JButton b1, b2;
	public MainClass_1()
	{
		b1=new JButton("로그인");
		b1=new JButton("취소");
		add("North", b2);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
//		B b=(B)a;
//		System.out.println(Integer.parseInt("10"));
		
//		int[] arr=new int[2];
//		arr[2]=100;
//		System.out.println(arr[2]);
		
		new MainClass_1();
	}

}
