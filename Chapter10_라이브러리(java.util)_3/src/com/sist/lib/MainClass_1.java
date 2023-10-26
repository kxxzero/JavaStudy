package com.sist.lib;

/*
 * 	자바에서 가장 많이 사용되는 패키지
 * 	java.lang, java.util, java.io, java.sql
 * 
 * 	java.lang : Object, String, Math, Wrapper
 * 	java.util : Date, StringTokenizer, List(ArrayList), Map(HashMap)
 * 	
 * 	
 */

import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		/*
		 * 	자바의 표준 입출력
		 * 	System.in : 키보드 입력값 받기
		 * 	System.out : 화면 출력
		 */
		
		System.out.println("년 월 일 입력(2023 10 25):");
		int year=scan.nextInt(); // 스페이스바(공백)을 기준으로 자름
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		// 요일, 입력 달의 마지막 날짜 => Calendar에 설정
		// set() => get()
		
		/*
		 * 	1. 연도 설정 : set(Calendar.YEAR, year)
		 * 	2. 월 설정 : set(Calendar.MONTH, month-1) => 0번
		 * 	3. 일 설정 : set(Calendar.DATE, 1) => 달력
		 * 
		 * 	=> Calendar => 추상 클래스
		 * 	=> 미완성(메소드 구현이 안 된 상태)
		 * 	=> new를 이용해서 메모리 할당이 불가능
		 * 	=> new를 사용하지 않고 메모리 할당(추상클래스, 인터페이스)
		 * 							
		 */
		
		// Calendar 객체 생성
		Calendar cal=Calendar.getInstance();
		
		// 요청한 달의 날짜 설정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기
		// 해당 달의 마지막 날짜 가져오기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1; // 0부터 시작
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 출력
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		
		for(String w : strWeek)
		{
			System.out.print(w+"\t");
		}
		System.out.println("\n"); // 다음 줄 이동
		
		for(int i=1; i<lastday; i++)
		{
			if(i==1) // 맨 처음일 때 => 요일 위치에 공백을 주어야 함
			{
				for(int j=0; j<week; j++)
				{
					System.out.println("\t"); 
				}
				System.out.printf("%2d\t",i);
				week++; // 0 ~ 6 반복
				if(week>6)
				{
					week=0; // 일요일부터 시작
					System.out.println();
				}
			}
		}
	}

}
