package com.sist.lib;

/*
 * 	중복 데이터
 * 		- ArrayList
 * 	중복 없는 데이터
 * 		- HashSet
 * 	2개를 저장해서 찾기
 * 		- HashMap : 클래스 찾기, SQL 문장 찾기
 * 			=> Annotation
 * 
 * 	Map => 인터페이스 => 클래스를 모아서 관리
 * 		1) 종류
 * 			- HashTable
 * 			- HashMap : HashTable을 보완
 * 				=> 동기 → 비동기
 * 				=> Ajax
 * 		2) 특징
 *			- 2개를 동시에 저장(key, value)
 *			- key는 중복할 수 없음, value는 중복이 가능
 *				예) 	("id", "hong")
 *					("id", "shim") => get("id")
 *		3) 사용처 => 웹에서 제공하는 90% 클래스는 Map을 이용
 *			- 데이터 전송
 *				= HttpServletRequest => 서버에서 브라우저 전송
 *				예)	setAttribute("id", "hong")
 *				= session / cookie => 최신 방문
 *		4) 라이브러리
 *			- Spring : HashMap => key, 클래스 객체
 *				=> 클래스 관리 => 클래스 찾기(DL) => getBean("key")
 *				*** 객체의 생명 주시 => 생성 ~ 소멸 관리
 *					=> WEB(라이브러리의 일부)
 *			- MyBatis : 데이터베이스와 관련(데이터베이스 프로그램을 쉽게 짤 수 있도록 도움) => ORM
 *				=> SQL 문장을 관리 => key => 등록(XML, Annotation)
 *		5) 주요 메소드
 *			- put("key", value) : 저장 => 반드시 문자로 시작			
 *			- get(key) : 읽기
 *			*** 프로그램 : 데이터가 많이 있음
 *				=> 구분
 *					ArrayList => 인덱스
 *					Set => 중복	
 *					Map => key
 *					오라클 => Primary key(예: 영화 번호, 게시글 번호)
 *					=> 	정형화된 데이터
 *						비정형화된 데이터 => 분석 => 시각화 => 정형화된 데이터로 변경 => 빅데이터 => 예측(AI)
 *					=> Application => exe
 *						웹/모바일 => java → kotlin
 *						분석 => python
 *						실시간 => 스칼라
 *
 *					*** key 예시
 *						· ISBN(국가 고유 번호)
 *						· 책 번호
 *						· 국가 : ko, en ...
 *					
 */

import java.util.*;
public class MainClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map=new HashMap<String, String>();
		map.put("id", "hong");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("addr", "서울");
		map.put("phone", "010-1111-1111");
		
		System.out.println("ID: "+map.get("id"));
		System.out.println("PWD: "+map.get("pwd"));
		System.out.println("NAME: "+map.get("name"));
		System.out.println("SEX: "+map.get("sex"));
		System.out.println("ADDR: "+map.get("addr"));
		System.out.println("PHONE: "+map.get("phone"));
		
		System.out.println();
		
		Set<String> set=map.keySet();
		System.out.println(set);
		
		System.out.println();
		
		for(String key:set)
		{
			System.out.println(key.toUpperCase()+":"+map.get(key)); // 읽는 순서는 저장된 순서와 다름
		}
		
		System.out.println();
		
		for(String s:map.values())
		{
			System.out.println(s);
		}
		
		/*
		 * 	clear() : 전체를 삭제 => TRUNCATE(장점 : 한 번에 삭제 => 속도가 빠름 / 단점 : 복구 불가)
		 *  get() : 실제 데이터를 읽어옴
		 *  put() : 데이터를 저장할 때 사용
		 *  isEmpty() : 데이터가 있는지 확인
		 *  size() : 저장 개수
		 *  keySet() : key값만 가지고 옴
		 *  values() : 실제 저장된 값을 읽는 경우
		 */
		
	}

}
