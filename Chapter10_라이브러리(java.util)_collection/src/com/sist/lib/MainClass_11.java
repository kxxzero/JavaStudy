package com.sist.lib;

import java.util.*;
public class MainClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,40,70,60,10,20,40};
		Set<Integer>set=new HashSet<Integer>(); // 중복된 데이터 제거
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		System.out.println("\n===== 정렬(ASC) =====");
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		
		System.out.println("\n===== 정렬(DESC) =====");
		Collections.reverse(list); // 역순 정렬
		System.out.println(list);
		
		// ArrayList<?> list=new ArrayList<String>();
		// ArrayList list=new ArrayList();
		// ?는 와일드 카드(모든 데이터형을 받는 경우)
	}

}
