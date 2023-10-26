package com.sist.lib;

/*	List 계열의 클래스
 * 		- 순서가 있음(인덱스)
 * 		- 데이터를 중복해서 저장할 수 있음
 * 
 * 	★★★ ArrayList : 단방향 포인터(인덱스) => 조회하기 편리(성능이 좋음)
 * 		- 비동기 => Vector를 보완
 * 		- 검색이 빠름, 데이터 추가 시 뒤에 추가하면 속도가 빠름
 * 		- 수정, 중간에 추가, 삭제가 느림 => 웹에서는 사용하지 않음
 * 		- 수정, 삭제가 없는 프로그램에서 주로 이용(데이터베이스에서 주로 만들어짐) => 데이터를 모아서 전공(브라우저, 윈도우)
 * 	LinkedList : 양방향 포인터
 * 		- 수정, 추가, 삭제가 많은 경우에 주로 사용 => 윈도우(애플리케이션)
 * 		- 검색 속도 느림
 * 	Vector : 단방향 포인터(ArrayList와 동일)
 * 		- 동기 => 채팅, 서버 연결, 사용자 정보를 저장
 */

import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<Integer>();
		
		/*
		 * 	List<String> list=new Vector<String>()
		 *  List<String> list=new ArrayList<String>()
		 *  List<String> list=new LinkedList<String>()
		 */
		
		// 데이터 추가 : add(Object) → add(Integer)
		// Wrapper => 기본형과 동일하게 사용됨
		
//		int i=10, Integer i=10 => 오토박싱
		vec.add(10); // 0 / 정석적인 표기법 : vec.add(Integer.valueOf(10))
		vec.add(20); // 1
		vec.add(30); // 2
		vec.add(40); // 3
		vec.add(50); // 4
		
		for(int i=0; i<vec.size(); i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		
		// 삭제 : remove(index 번호) => 자동으로 인덱스 변경
		System.out.println("\n===== 삭제 후 =====");
		vec.remove(3);
		
		for(int i=0; i<vec.size(); i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		
		// 수정 : set(index 번호, 데이터)
		System.out.println("\n===== 수정 후 =====");
		vec.set(2,  1000);
		for(int i=0; i<vec.size(); i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		
		// 데이터 개수 : size()
		System.out.println("\n===== 데이터 개수 확인 =====");
		System.out.println("총 개수:"+vec.size()+"개");
		
		
		// 전체 삭제 : clear()
		System.out.println("\n===== 전체 삭제 =====");
		vec.clear();
		System.out.println("총 개수:"+vec.size()+"개");
		
		if(vec.isEmpty())
		{
			System.out.println("접속자가 없습니다.");
		}
		else
		{
			System.out.println("접속자가 있습니다.");
			
		}
	}

}
