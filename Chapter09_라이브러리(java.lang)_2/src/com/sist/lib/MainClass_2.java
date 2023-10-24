package com.sist.lib;

/*
 * 	Wrapper : 기본 데이터형을 클래스화
 * 	=> 기본데이터형에 기능을 부여해서 쉽게 사용 가능
 * 		int => Integer
 * 		long => Long
 * 		double => Double
 * 		boolean =?> Boolean
 * 		=> 웹에서 주로 사용
 * 	=> 웹/윈도우 => 모든 데이터값 문자열
 * 
 * 	=> Double.parseDouble("4.5") => 4.5
 * 	   Integer.parseInt("10") => int page=10
 * 	   Boolean.parseBoolean("true") => true
 * 	=> 제네릭 사용 시 데이터형 통일
 * 		메소드 => 리턴형, 매개변수
 * 
 * 		- <Integer> => 클래스형만 가능 / <int> 불가능
 * 			배열 => 저장(클래스) => Object
 * 			class Box<T> => T(Object)
 * 			{
 * 				T t=new T();
 * 				void setT(T t){}
 * 				T getT()
 * 				{
 * 					return T;
 * 				}
 * 			}
 * 
 * 			Box<String>
 * 			★★★ 오토박싱
 * 				Integer i=10; => int와 같이 사용 가능
 * 				int j=i;
 * 			★★★	언박싱
 */

import java.util.*;
public class MainClass_2 {
	static void aaa(Integer i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list=new ArrayList<Integer>();
		Integer i=10; // 오토박싱
		int j=i; // 언박싱
		System.out.println(i);
		
		aaa();
		
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
	}

}
