/*
 *	54page : 제어문
 * 		변수 : 데이터 저장
 * 		연산자 : 결과값, 사용처, 형식
 * 		제어문 : 흐름(동작), 사용처, 형식 => 무조건 한 개의 문장만 수행 가능
 * 				if(조건문){
 * 					문장1 => 수행문
 * 					문장2 => 수행되지 않는 일반 문장
 * 				}
 * 			1. 제어문의 종류 : 조건에 따라 수행을 제어
 * 				- 조건문 : 비교연산자, 논리연산자, 부정연산자만 사용 가능
 * 					· 단일 조건문 : 속도가 느림(단일 조건문 여러개 사용 시), 1개가 독립 문장이기 때문에 중복이 있는 경우에 사용 가능
 * 						* 형식 : if(조건문){
 * 									조건문이 true일 경우에 수행할 명령문
 * 								}
 * 								=> 명령문을 제어(수행/수행X)할 수 있음
 * 
 * 					· 선택 조건문 : true와 false를 나눠서 작업
 * 						* 형식 : if(조건문){
 * 									조건문이 true일 경우에 수행할 명령문
 * 								}else{
 * 									조건문이 false일 경우에 수행할 명령문
 * 								}
 * 
 * 					· 다중 조건문 : 주로 한 번만 수행할 때 사용
 * 						계산기 : +, -, *, /
 * 						* 형식 : if(조건문){
 * 									조건문이 true일 경우에 수행할 명령문
 * 									true일 경우 종료 / false일 경우 아래 else if 조건문 실행
 * 								}else if(조건문){
 * 									true일 경우 종료 / false일 경우 아래 else if 조건문 실행
 * 								}else if(조건문){
 * 									true일 경우 종료 / false일 경우 아래 else 조건문 실행
 * 								}else{
 * 									해당 조건이 없는 경우 수행할 명령문 (생략 가능)
 * 								}
 * 
 * 
 * 							예) int score = 80;
 * 								if(score>=90)
 * 								A
 * 								if(score>=80)
 * 								B
 * 								if(score>=70)
 * 								C // if를 사용할 경우 true 값이 나와도 아래 if를 실행하기 때문에 else if 사용
 * 								if(score>=60)
 * 								D
 * 								if(score<60)
 * 								F
 * 								=> 결과 : D 해당되는 조건 모두 실행하기 때문
 * 
 * 							예) int a = 15; // 3, 5의 배수
 * 								if(a%3==0)
 * 								else if(a%5==0) // else if를 사용할 경우 실행하지 않기 때문에 if 사용
 * 								else if(a%7==0)
 * 
 * 				- 선택문
 * 				- 반복문
 * 				- 반복제어문
 * 
 */

// 단일 조건문 : 조건식(비교연산자, 논리연산자, 부정연산자)
// 1. 정수 한 개를 입력 받아서 짝수 / 홀수

import java.util.Scanner;
public class 자바제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 클래스 => 키보드로 입력해서 저장 => 엔터 메모리에 저장
			
//			기능(메모리
//			정수 : nextInt()
//			문자열 : next()
//			실수 : nextDouble()
//			논리 : nextBoolean()
//			* 문자는 X => System.in => 정수 // 예) A 입력 시 65
//			웹/윈도우에서는 char은 거의 사용하지 않는다. 대부분 문자열 사용
		
		// Scanner 클래스 저장 => 클래스를 저장 : new(메모리의 크기 생성)
		Scanner scan=new Scanner(System.in);
		// System.in : 자바 표준 입력
		// Sustem.out : 자바 표준 출력
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		// 가공
		if(num%2==0)
			System.out.println(num+"는(은) 짝수다.");
		if(num%2!=0)// num%2==1, !(num%2==0) 모두 같은 의미
			System.out.println(num+"는(은) 홀수다.");
		
		if(num%2==0) {
			System.out.println(num+"는(은) 짝수다.");
		}else {
			System.out.println(num+"는(은) 홀수다.");
		}

	}

}
