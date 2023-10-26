package com.sist.lib;

/*
 * 	컬렉션 프레임워크 : 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합(자바에서 지원하는 라이브러리 => 사용법)
 * 		- 데이터 수정, 삭제, 추가, 읽기 => CRUD(자료 구조)
 * 		- 배열의 단점을 보완 => 고정(정적) => 추가, 삭제가 어려움
 * 			=> 동적 메모리 할당(가변)
 * 				필요 시마다 추가, 삭제가 편리
 * 		- 단점 : 모든 데이터형을 저장할 수 있음(Object)
 * 		- 기본적으로 데이터 관리 = 같은 데이터형을 모아서 처리
 * 	제네릭 : 데이터형을 통일화 => 기존에 만들어진 메소드의 리턴형, 매개변수를 변경
 * 		- *** 데이터를 저장할 때 한 가지 데이터형만 사용이 가능하도록 만들어서 사용
 * 		- *** 소스 간결(형변환 없이 사용 가능), 가독성(어떤 데이터가 첨부되어 있는지 확인 가능) 
 * 		- 사용법 : 클래스 뒤에 <>(이 부호는 클래스만 사용 가능하며, 기본형은 사용 불가 => Wrapper)
 * 			예) 	ArrayList<Integer>
 * 				ArrayList<Music> ...
 * 				T, E, K, V
 * 				T => <type> => 클래스(type => 클래스 등록)
 * 							=> myBatis => type
 * 							=> Spring => class
 * 				E => elements => 클래스
 * 				K => key
 * 				V => value
 * 				ArrayList<E>
 * 				Set<E>
 * 				Map<K,V>
 * 					예) class Box<T>
 * 						{
 * 							T t;
 * 							public void setT(T t)
 * 							{
 * 								this.t=t;
 * 							}
 * 							public T getT()
 * 							{
 * 								return t;
 * 							}
 * 						}	
 * 						Box box=new Box() => T(Object)
 * 						Box<Integer> box=new Box<Integer>();
 * 							=> T(Integer)
 * 				
 * 	클래스의 종류
 * 		- List(인터페이스) : 순서 존재(자동으로 인덱스 번호 부여), 데이터 중복 허용 => 가장 많이 사용되는 컬렉션
 * 			구현하는 클래스 목록
 * 			· ArrayList : 비동기 방식 => 데이터베이스에서 데이터 읽기(웹의 핵심)
 * 				=> 장점 : 접근 속도 빠름, Vector의 단점을 보완
 * 				=> 단점 : 추가, 삭제 시 속도 느림(오라클에서 주로 하는 역할)
 * 				=> 역할 : 읽기, 데이터 모아서 전송 => myBatis(자체적 리턴형 List)
 * 			· Vector : 동기 방식 => 네트워크(접속자 정보 저장)
 * 			· LinkedList : 자체 처리(Application)
 * 				=> 장점 : 추가, 삭제 빠름
 * 				=> 단점 : 접근 속도 느림
 * 				=> List라는 인터페이스 이용(모든 메소드 동일)
 * 				=> java.util => 사용 시 반드시 import 입력
 * 				
 */

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>(); // 가변 => 메모리 저장 크기를 지정하지 않음(저장된 데이터만큼만 메모리 할당)
		// 배열 => 사용하지 않는 공간이 있는 경우 메모리 누수 현상 발생
		
		// 추가 : add() => add(object) → add(String) (제네릭)
		list.add("사과"); // 0
		list.add("배"); // 1 
		list.add("수박"); // 2
		list.add("바나나"); // 3
		list.add("메론"); // 4
		// 추가 시에는 중간이 아닌 가장 마지막 데이터의 다음부터 이어서 추가하는 것을 권장
		// 삭제는 웬만하면 하지 않는 것을 권장
		
		// 데이터 읽기 => 출력 : size(), get(index)
		for(int i=0; i<list.size(); i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		
		// 삭제 : remove(index) => 데이터 중복 허용
		System.out.println("\n===== 삭제 후 =====");
		list.remove(1);
		for(int i=0; i<list.size(); i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		
		// 수정 : set(index, 데이터)
		System.out.println("\n===== 수정 후 =====");
		list.set(2, "연시");
		for(int i=0; i<list.size(); i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		
		// 개수 : size()
		System.out.println("\n===== 저장 개수 =====");
		System.out.println("과일:"+list.size()+"개");
		
		
		// 데이터 비우기 : clear()
		System.out.println("\n===== 전체 삭제 =====");
		list.clear();
		System.out.println("과일:"+list.size()+"개");
		
		
		// 데이터 존재 유무 : isEmpty
		System.out.println("\n===== 데이터 존재 여부 확인 =====");
		if(list.isEmpty())
		{
			System.out.println("장바구니가 비었습니다.");
		}
		else
		{
			System.out.println("장바구니에 선택된 데이터가 있습니다.");
		}
	}

}
