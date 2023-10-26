package com.sist.lib;

import java.io.FileInputStream;
import java.util.Properties;

/*
 * 	컬렉션 프레임워크 : 군집(다수의 데이터)을 쉽게 관리할 수 있게 만든 라이브러리
 * 	=> 데이터 관리 : 추가, 수정, 삭제, 읽기 => 자료 구조 
 * 		= 파일 : 한 줄 씩 읽기 => 구분자
 * 			- read(), write(), delete()
 * 		= 오라클 : 원하는 데이터만 가지고 올 수 있음
 * 			- select(읽기), insert(추가), update(수정), delete(삭제)
 * 
 * 	=> 동적 메모리 할당(자동으로 크기가 변경(가변형 => 메모리 누수 방지) => 크기를 지정하지 않음)
 * 	=> 자동으로 인덱스 번호 관리 => 빈 공백이 없음
 * 	=> 컬렉션의 종류
 * 		= List : 순서 존재(인덱스 번호 자동 처리), 데이터 중복 허용
 * 			- ArrayList
 * 			- 주요 메소드
 * 				· add(Object) : 추가
 * 				· remove(int index) : 삭제
 * 				· set(int index, Object) : 수정
 * 				· get(int index) : 읽기
 * 				· isEmpty() : 비어있는지 확인
 * 				· clear() : 전체 삭제
 * 				· size() : 저장된 개수
 * 				· 2개의 List가 있는 경우 => 교집합(retainAll()), 합집합(addAll()), 차집합(removeAll())
 * 			*** Arrays.asList() => 배열 => ArrayList로 변경
 * 		= Set : 순서 없음, 데이터 중복 허용하지 않음 => List에서 중복 데이터를 제거할 때 주로 사용 => 장르별, 부서별, 상품별...
 * 			*** null값 추가 가능(1회만 가능)
 * 			- HashSet
 * 			- 주요 메소드
 * 				· add() : 추가
 * 				· remove(Object) : 삭제
 * 				· isEmpty() : 데이터 존재 여부
 * 				· size() : 개수
 * 			*** 일반 for문 사용 불가 => for~each문만 사용 가능(인덱스 번호가 없기 때문)
 * 		= Map : 2개를 동시에 저장(key, value) => 도서, 클래스 관리, 데이터 전송 관리, SQL 관리
 * 			- HashMap
 * 			- 주요 메소드
 * 				· put() : 저장
 * 				· get() : 읽기
 * 				· ketSet() : 저장된 키 읽기
 * 				· values() : 저장된 값 읽기
 * 				· size() : 크기
 * 				· clear() : 전체 삭제
 * 			*** 전체를 한 곳에 모아서 출력, 관리 => Iterator
 * 				
 * 	제네릭 : 라이브러리에 있는 데이터형을 프로그램에 맞게 변경해서 사용
 * 	프로그램(데이터 관리)
 * 	=> 데이터 저장 방법 : 변수, 배열, 컬렉션, 파일, 데이터베이스
 * 		= 데이터형 통일
 * 		= 라이브러리 : 이미 생성된 클래스(데이터형)
 * 			- 지정하는 리턴형/매개변수의 데이터형을 변경
 * 			- 프로그램 개발 시마다 형변환
 * 			- 필요 시마다 데이터형을 변경
 * 			=> 이러한 문제를 보완한 것 => 제네릭
 * 		*** 사용법
 * 			클래스<데이터형> => 리턴형/매개변수가 변경
 * 				- 단점 : 기본형은 사용 불가
 * 				- 보완 : 기본형을 사용할 수 있도록 클래스형 제공
 * 					Wrapper
 * 						· int => Integer
 * 						· long => Long
 * 						· double => Double
 * 						· boolean => Boolean
 * 						=> 호환성이 좋음, 기본형과 동일하게 사용 가능
 * 	Properties 
 * 		자바에서 제어 파일명 : .txt, .properties
 * 						.xml
 * 						.csv=> R => 데이터베이스
 * 						.json
 */
import java.util.*;
public class MainClass_Collection정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			// Map => 파일 => .properties		
			Properties prop=new Properties();
			prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter10_라이브러리(java.util)_collection\\src\\com\\sist\\lib\\student.properties"));
			String name=prop.getProperty("name");
			String addr=prop.getProperty("address");
			String phone=prop.getProperty("phone");
			System.out.println(name+" "+addr+" "+phone);
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("use.language"));
		}catch(Exception ex)
		
		{
			
	}

}
