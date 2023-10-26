package com.sist.lib;

/*
 * 	자바의 컬렉션 : 자바의 자료 구조 => 데이터 관리
 * 		=> 데이터를 모아서 관리하는 클래스의 집합
 * 			=> CRUD(추가, 수정, 삭제, 읽기)
 * 			=> 메모리에서 영구적으로 저장되지 않음
 * 			=> 영구적인 저장 장치 : 파일 / 오라클
 * 
 * 	Collection => 인터페이스
 * 		- List : 순서를 가짐(인덱스 번호 => 배열을 보완한 클래스(고정적, 같은 데이터형만 모음, 가변형 : 크기를 지정하지 않음), 데이터 중복 허용
 * 			· ArrayList : Vector를 보완 => 비동기 => 데이터베이스 연동 
 * 				= 장점 : 배열 형식으로 만들어져 있음 => 인덱스를 이용해서 처리 => 접근 속도가 빠름
 * 				= 단점 : 중간에 추가/삭제 => 속도 저하
 * 				= 인덱스 번호는 항상 순차석으로 유지
 * 
 * 				= 사용 : 데이터 양이 일관적이고 추가/삭제 없는 경우에 주로 사용 => 데이터베이스 => 데이터의 접속 속도를 중요시 할 때(웹)		
 * 			· Vector : 동기 => 네트워크에서 접속자 정보 저장
 * 			· LinkedList : 호환 => C언어 개발자 
 * 			
 * 	***					
 * 		------------------------------------------------------------
 * 		Collection		읽기(접근시간)		추가/삭제		비고
 * 		------------------------------------------------------------
 * 		ArrayList		속도 빠름			느림			순차적으로 추가/삭제가 빠름
 * 						웹 자체 추가/삭제 X=> 오라클		효율적인 메모리 사용
 * 		------------------------------------------------------------
 * 		LinkedList		속도 느림			빠름			데이터가 많을수록 접근성이 떨어짐
 * 						=> 윈도우
 * 		------------------------------------------------------------
 * 
 * 		- Set : 순서가 없음, 데이터 중복 허용
 * 			· HashSet : 중복 데이터 생성
 * 			· TraceSet : 검색 최적화
 * 
 * 		- Map => 인터페이스(표준화) : 순서가 없음, 데이터 중복 허용
 * 			key, value => 쌍으로 생성
 * 			*** key는 중복 불가
 * 			· HashMap : 웹에서 가장 많이 사용
 * 				= 관련된 클래스 관리 => Spring, MyBatis
 * 				= 웹소켓(웹 네트워크) => sessionId
 * 			· HashTable : 단점 보완 => HashMap
 * 
 * 	Collection : 데이터가 일정 공간에 모아서 관리할 목적 => 예) 웹 목록 출력(브라우저)
 * 		1) 배열의 단점(저장 크기를 결정 => 고정적)을 보완 => 크기 결정을 하지 않음(가변형)
 * 		2) 인터페이스를 이용(표준화 => 모든 개발자가 동일한 메소드를 이용) => 프레임워크(Spring/MyBatis/JQuery/VueJS/ReactJS)
 * 			=> 일정 기본 틀 => 쉽게 다른 개발자의 코딩을 분석(유지 보수 편리)
 * 		
 * 	*** 주요 메소드 => 웹(공유)
 * 		① 추가
 * 			add(데이터)
 * 			add(int index, 데이터) => 속도 저하
 * 		② 수정
 * 			set(int index, 데이터)
 * 		③ 삭제
 * 			remove(int index)
 * 		④ ★★★ 읽기
 * 			get(int index)
 * 		⑤ ★★★ 저장 개수
 * 			size()
 * 		⑥ 전체 지우기
 * 			clear()
 * 
 */

import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList(); // Object
		// 가급적이면 같은 데이터를 첨부하는 것이 유리
		// 추가
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("이순신"); // 2
		list.add("강감찬"); // 3
		list.add("춘향이"); // 4
		// 순차적으로 추가
		
		// 출력
		for(int i=0; i<list.size(); i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		
		System.out.println("==========");
		
		// 추가
		list.add(2,"을지문덕"); // 원하는 위치에 추가
		
		// 출력
		for(int i=0; i<list.size(); i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		
		// 삭제 remove(int index)
		System.out.println("==========");
		list.remove(3);
		for(int i=0; i<list.size(); i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		
		// 수정 set(int index, 데이터)
		System.out.println("==========");
		list.set(2, "박문수");
		for(int i=0; i<list.size(); i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		System.out.println("현재 인원:"+list.size());
		
		// 전체 삭제 => clear()
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
		/*
		 * 	add() => 데이터 추가
		 *  size() => 저장된 개수
		 *  get() => 읽기
		 *  remove() => 삭제
		 *  set() => 수정
		 *  clear() => 전체 데이터를 비우는 경우
		 */
	}

}
