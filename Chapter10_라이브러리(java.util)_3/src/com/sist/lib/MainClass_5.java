package com.sist.lib;

// 검색

import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수만 메모리에 저장
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		/*
		 *  Wrapper
		 *  	- 기본형을 클래스형으로 만들어서 기능을 부여
		 *  	- 제네릭 사용
		 *  	- 장점 : Wrapper 클래스와 기본형 호환
		 *  		Integer => 10, 20, 30...
		 *  		Integer i=10; => int
		 */
		
		// 추가 => add()
		list.add(Integer.valueOf(10)); // list.add(10)으로도 작성 가능
		list.add(20); // 1
		list.add(30); // 2
		list.add(40); // 3
		list.add(50); // 4
		
		for(int i=0; i<list.size(); i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		
		System.out.println("==========");
		
		list.add(3, 60); // 가급적 사용 자제
		for(int i=0; i<list.size(); i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		
		System.out.println("==========");
		
		list.remove(3);
		for(int i=0; i<list.size(); i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		
		System.out.println("==========");
		
		// 인덱스 번호 0번 => size() : 개수 => i<list.size()
		// 인덱스 초과 시 오류 발생
		
		//for-each
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("데이터 저장 개수 :"+list.size());
		System.out.println("데이터 존재 여부 :"+list.isEmpty()); // isEmpty() : 비어 있는지 확인
		// 라이브러리 => 메소드 isXxx() => boolean
		//			=> setXxx => void
		/*
		 * 	setXxx
		 * 	getXxx : 가져오기
		 * 	isXxx
		 *  remove
		 *  delete
		 */
		// 데이터 유무 => 유(false) / 무(false)
		list.clear();
		System.out.println("데이터 저장 개수 :"+list.size());
		System.out.println("데이터 존재 여부 :"+list.isEmpty());
		
	}

}
