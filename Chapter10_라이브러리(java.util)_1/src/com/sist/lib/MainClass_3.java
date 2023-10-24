package com.sist.lib;

// Random
import java.util.*;

/*
 * 	Random : 임의의 수를 JVM에서 추출할 때 사용
 * 		- Math.random() => double형
 * 		형식) int nextInt(int bound)
 * 			예)  nextInt(100)+1;
 * 			
 */

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A ~ Z 알파벳을 임의로 10개 발생
		Random r=new Random();
		
		for(int i=1; i<=10; i++)
		{
			char c=(char)(r.nextInt(26)+65); // A
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		for(int i=1; i<=6; i++)
		{
			int lotto=r.nextInt(45)+1; // 1 ~ 45
			System.out.print(lotto+" ");
		}
		
		System.out.println();
		
		int day=r.nextInt(7)+7; // 1 ~ 13
		Set set=new HashSet();
		for(int i=1; i<=day; i++)
		{
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" ");
			set.add(rr);
//			if(rr>=24) // 현재 24일이기 때문에 24일 이후에 예약 가능
//			{
//				System.out.print(rr+" ");
//			}
		}
		
		System.out.println();

		for(Object obj:set) // set 이용 시 데이터 중복 없음
		{
			System.out.print(obj+" ");
		}
	}

}
