package com.sist.lib;

/*
 * 	Random : 난수 발생
 * 		=> nextInt(int bound) => 0~bound-1 발생
 * 
 * 	Arrays : 배열과 관련된 기능 제어
 * 		- ★★★ sort : 정렬
 * 		- copyOf : 다른 배열에서 복사
 * 		- toString() : 배열값 출력
 * 
 * 	StringTokenizer : 문자열 분리
 * 	
 */

import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=r.nextInt(100)+1; // 1~100
		}
		System.out.println("정렬 전="+Arrays.toString(arr));
		
		Arrays.sort(arr); // ASC(오름차순)
		System.out.println("정렬 후="+Arrays.toString(arr));
		
		// < 가변 배열 >
		// 작은 배열을 생성
		int[] subArr=Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(subArr));
		
		// 큰 배열로 변경
		int[] subArr2=Arrays.copyOf(arr, 10); // 남는 숫자는 0으로 채움
		/*
		 * 	나머지 영역은 초기값 설정
		 * 	int => 0
		 * 	double => 0.0
		 * 	class => null
		 * 	
		 */
		System.out.println(Arrays.toString(subArr2));
		
		
	}

}
