package com.sist.lib;

/*
 * 	Set(인터페이스)
 * 		- ★★★ HashSet : 속도가 빠름, 순서가 없음(인덱스 번호 없음), 데이터 중복 불가 => 장르별, 부서별 분리
 * 		- TreeSet : 정렬, 검색 속도 => List에 저장 => 중복 제거
 * 			└ HashTable
 * 			· headSet
 * 			· tailSet
 * 
 * 		*** 주요 메소드
 * 			· 데이터 저장 : add(Object)
 * 			· 데이터 삭제 : remove()
 * 			· 데이터 전체 삭제 : clear()
 * 			· 데이터를 한 번에 모아서 관리 : iterator()
 * 
 * 		장바구니 => 같은 상품 구매
 * 	
 */

import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		// 중복 불가
		set.add("A");
		set.add("B");
		set.add("C");
		
		// 출력
		for(String s:set)
		{
			System.out.print(s+" ");
		}
		
		
	}

}
