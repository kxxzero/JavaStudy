/*
 * 	1. 데이터 저장 : 변수, 배열
 * 		- 정수
 * 			· int
 * 		- 문자열
 * 			· String
 * 	2. 요청 처리 : 연산자, 제어문(메소드화)
 * 		- 연산자
 * 			· 산술연산자(+, %)
 * 			· 비교연산자, 논리연산자, 대입연산자(+=)
 * 		- 제어문
 * 			· if, if~else
 * 			· for : 향상된 for(출력 전용 - 예) 웹, JavaScript(라이브러리 : forEach, map=>Vue.js, React, Redux))
 * 			· while : 데이터베이스 연동(오라클에서 데이터 읽기)
 * 	3. 분리 작업 : 관련된 내용끼리 묶기
 * 		- 데이터 묶기
 * 			· 배열
 * 			· 클래스
 * 		- 명령문 묶기
 * 			· 메소드 => 입력 / 처리 / 출력
 * 	=> ★★★ 객체 지향 프로그램 ★★★
 * 		- 재사용
 * 			· 상속(is-a) : 변경해서 사용
 * 			· 포함(has-a) : 있는 그대로 사용
 * 		- 수정, 기능 추가
 * 			· 다형성(오버라이딩, 오버로딩)
 * 		- 데이터 노출 방지
 * 			· 캡슐화
 * 		1) 설계 : 인터페이스
 * 		2) 비정상 종료를 방지(오류를 사전에 처리) : 예외 처리
 * 		3) 조립식 프로그램 : 라이브러리(네트워크, 데이터베이스 연동)
 * 
 * 
 * 
 * 	<배열>
 * 	: 데이터 묶기
 * 		- 장점
 * 			· 연속적으로 메모리 할당 가능 => 인덱스(index) 번호 이용
 * 			· 같은 데이터형(메모리 크기 동일)으로만 묶을 수 있음
 * 		- 단점
 * 			· 고정적임
 * 			· 크기를 선언하면 수정이 어려움 => 큰 배열을 다시 생성해서 사용 => 컬렉션으로 보완
 * 		1) 사용법
 * 			① 배열 선언
 * 				- 데이터형[] 배열명; (권장 형식)
 * 				- 데이터형 배열명[] (C언어)
 * 			② 초기값 부여
 * 				- 명시적 초기화(int, char)
 * 					예) int[] arr={1,2,3,4,5};
 * 				- 크롤링 초기화(String)
 * 				- 파일(String)
 * 				- 입력(int, char)
 * 					예) int[] arr=new int[5];
 * 						arr[0] scan.nextInt;
 * 						arr[1] scan.nextInt;
 * 				- 난수 발생(int, char)
 * 					예) int[] arr=new int[5];
 * 						arr[0]=(int)(Math.random()*100);
 * 						arr[0]=(int)(Math.random()*100);
 * 						=> 저장된 데이터가 많은 경우
 * 							for => index 이용
 * 			③ 필요 시에 수정
 * 				예) arr[0] => 일반 변수와 동일
 * 					arr[0]=100 => arr[0]=1000
 * 					=> 배열 : 변수명이 동일 => 인덱스 번호 이용 => 순차적 => for
 * 			④ 출력 => 검색
 * 				- 향상된 for문 : 간결함, 속도가 빠름, 실제 데이터를 1개씩 읽어 옴
 * 					for(데이터형 변수명:배열, 컬렉션){ // 데이터형 = 배열에 저장된 데이터형 / 배열에 저장된 데이터형보다 큰 데이터형식을 입력
 * 						
 * 					}
 * 			⑤ 배열의 개수 : 배열명.length
 * 			⑥ 출력 시 항상 0번부터 출력하는 것은 아님 => 필요 시에는 length-1 출력
 * 			⑦ 배열의 범위를 초과할 경우 => ArrayIndexOutOfBoundsException
 * 				인덱스, 첨자(예: [1])
 * 			⑧ 자동 초기화
 * 				new 이용 시 메모리를 할당할 경우 자동 초기화
 * 				- int = 0;
 * 				- double = 0.0
 * 				- boolean = false
 * 				- char = '\u0000' => null
 * 				- String = null
 * 				- 모든 클래스 = null
 * 				예) int[] arr; => arr=null => 참조변수(주소를 가지고 있음)
 * 					int[] arr={1,2,3,4,5}
 * 					int[] arr=new int[5];
 * 
 * 			⑨ 메모리 할당
 * 				예) int[] arr=new int[3];
 * 					
 * 					arr			실제 저장되는 위치(Heap)
 * 							   100
 * 					-----		|------------------------
 * 					100				0		0		0	
 * 					-----		----|-------|-------|----
 * 								arr[0]	arr[1]	arr[2]	=> 무조건 순차적
 * 
 */

import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int year, month;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("연도 입력:");
		year=scan.nextInt();
		
		System.out.println("월 입력:");
		month=scan.nextInt();
		
		// 달력 제작을 위한 처리
		// 1년도 1월 1일 ~ 요청한 날짜까지의 총일수%7 => 요일(각 월의 1일자에 대한 요일을 구함)
		// ① 전년도까지의 합
		int total=(year-1)*365
				+(year-1)/4 // 4년마다 윤년
				-(year-1)/100 // 100년마다 제외
				+(year-1)/400; // 400년마다 윤년
		
		// ② 전달까지의 합
		int[] lastday= {31,28,31,30, 31,30,31,31, 30,31,30,31}; // 명시적 초기화
		
		// * 윤년일 때 2월 : 29일 / 윤년이 아닐 때 2월 : 28일
		if((year%4==0) && (year%100!=0) || (year%400==0)) { // 윤년이라면
			lastday[1]=29; // 인덱스 번호 1 => 두번째
		}
		else {
			lastday[1]=28;
		}
		
		for(int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		
		// ③ +1
		total++;
		
		// ④ 요일 구하기
		int week=total%7;
		char[] strweek= {'일','월','화','수','목','금','토'};		
		
		// 달력 출력
		System.out.println(year+"년도 "+month+"월 1일은 "+strweek[week]+"요일입니다.");
		
		System.out.println(year+"년도 "+month+"월");
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=0; i<strweek.length; i++) {
			System.out.print(strweek[i]+"\t"); // 요일 출력
		}
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=1; i<=lastday[month-1]; i++) { // 일 수 출력
			if(i==1) {
				for(int j=0; j<week; j++) { // 일주일
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i); // 여백 생성
			
			week++;
			if(week>6) { // 토요일이면
				week=0; // 일요일로 바꿈
				System.out.println(); // 줄 바꿈
			}
		}
		
	}

}
