package com.sist.lib;

/*
 * 	java.util : 프로그램에서 많이 사용되는 유용한 클래스의 집합
 * 		*** 반드시 import 사용
 * 		1) 날짜
 * 			- Date
 * 			- Calendar : Date에 없는 기능 확장판 => 예약 서비스
 * 		2) 문자열 분해
 * 			- StringTokenizer
 * 		3) 자료 구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 * 			- ★★★ 컬렉션 => 가변형(크기를 결정하지 않음)
 * 			- 표준화 : 모든 개발자가 동일하게 사용
 * 			=> CRUD => 읽기 / 쓰기 / 수정 / 삭제
 * 			Collection => interface
 * 				· List : 데이터 중복 허용, 순서가 있음(인덱스 이용)
 * 					= ★★★ ArrayList : 오라클(데이터베이스)에 있는 데이터를 저장해서 제어 => 비동기 방식
 * 						*** Vector의 단점을 보완한 ArrayList
 * 					= Vector : 네트워크(사용자의 정보 : IP, PORT) => 동기 방식
 * 					= LinkedList : C호환 => 수정, 삭제, 추가
 * 						*** 메소드 동일
 * 						- Queue
 * 				· Set : 데이터 중복 불가, 순서가 없음
 * 					= ★★★ HashSet
 * 					= TreeSet
 * 				· MAP : 데이터 중복 허용, 순서가 없음, 키/값으로 저장, 키는 중복 불가, 클래스 관리(스프링, 웹)
 * 					= HashMap 
 * 					= HashTable
 * 				
 * 			
 * 					
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		for(Object name:list)
		{
			System.out.println(name);
		}
	}

}
